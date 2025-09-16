package RestaurantApp;

import java.util.ArrayList;
import java.util.List;

import static RestaurantApp.Menu.*;

public class Order {
    private List<OrderItem> order = new ArrayList<>();
    private final double taxRate = 14;

    public void addItemToOrder(MenuItem item, int quantity){
        this.order.add(new OrderItem(item, quantity));
    }

    public void displayOrderDetails(){
        System.out.printf(RED + "\n%-30s %-15s %-15s %s\n" ,"Item", "Item price", "quantity", "Total price" + RESET);
        int iterator=1;
        for(OrderItem item : order){
            System.out.print(iterator + "-");
            item.displayOrderItemDetails();
            iterator++;
        }
    }

    public void displayFinalBill(double discount){
        double totalCost = calculateOrderTotalCostWithDiscount(discount);
        displayOrderDetails();
        System.out.println("_____________________________________________________________________________");
        System.out.printf("%-30s %.2f\n", "Total Cost: ",calculateOrderTotalCost());
        if(discount != 0){
            System.out.printf("%-30s %.2f%s\n", "Applied discount:", discount, "%");
            System.out.printf(BLUE + "%-30s %.2f\n" + RESET, "Total Cost after discount: ", totalCost);
        }
        System.out.printf(RED + "%-30s %.2f\n" + RESET, "Total taxes("+(int)taxRate+"%):", calculateTaxes(totalCost));
        System.out.printf(BLUE + "%-30s %.2f\n" + RESET, "Final bill: ", calculateFinalBill(totalCost));
    }

    public void modifyOrderItemQuantity(int itemIndex, int newQuantity){
        order.get(itemIndex-1).setQuantity(newQuantity);
    }

    public void removeItemFromOrder(int itemIndex){
        order.remove(itemIndex-1);
    }


    // Helper methods
    private double calculateOrderTotalCost(){
        double orderTotalCost = 0;
        for(OrderItem item : order){
            orderTotalCost += item.getItemTotalCost();
        }
        return orderTotalCost;
    }

    private double calculateOrderTotalCostWithDiscount(double discount){
        return calculateOrderTotalCost() * (1-(discount/100));
    }

    private double calculateTaxes(double totalCost){
        return totalCost * (taxRate/100);
    }

    private double calculateFinalBill(double totalCost){
        return totalCost + calculateTaxes(totalCost);
    }
}
