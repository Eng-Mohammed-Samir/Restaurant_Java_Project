package RestaurantApp;

public class OrderItem extends MenuItem{
    private int quantity=0;

    public OrderItem(MenuItem item, int quantity) {
        super(item.getName(), item.getCategory(), item.getPrice(), item.getDescription(), item.isBestSellers());
        this.quantity = quantity;
    }

    public double getItemTotalCost(){
        return quantity * getPrice();
    }

    public void displayOrderItemDetails(){
        System.out.printf("%-29s %-17.2f %-14d %.2f\n", getName(), getPrice(), quantity, getItemTotalCost());
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
