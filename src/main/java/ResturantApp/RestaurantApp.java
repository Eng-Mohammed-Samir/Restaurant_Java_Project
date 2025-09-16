package RestaurantApp;

import java.util.Scanner;

import static RestaurantApp.Menu.*;

public class RestaurantApp {
    static Scanner input = new Scanner(System.in);
    static Menu menu = new Menu();
    static Order order = new Order();
    
    public static void main(String[] args) {
        Management.menuSetup(menu);

        boolean keepGoing = true;
        boolean isMenuDisplayed = false;
        int index;

        try {
            while (keepGoing) {
                index = displayOptions();
                switch (index){
                    case 1:
                        menu.displayMenu();
                        isMenuDisplayed = true;
                        break;
                    case 2:
                        menu.displayBestDishes();
                        break;
                    case 3:
                        displayCategoryItems();
                        break;
                    case 4:
                        menu.displayMenu();
                        System.out.println("Please enter the item number: ");
                        menu.addItemToBestDishes(input.nextInt()-1);
                        System.out.println("Here are the updated best dishes:\n");
                        menu.displayBestDishes();
                        break;
                    case 5:
                        if(!isMenuDisplayed){
                            menu.displayMenu();
                        }
                        ordering();
                        afterOrderHandling();
                        break;
                    case 6:
                        keepGoing = false;
                        break;
                    default:
                        System.out.println(RED + "Invalid option! Please enter a valid index" + RESET);
                }
            }
        }catch (Exception InputMismatchException){
            System.out.println(RED + "Invalid input! Please enter a numeric number" + RESET);
        }


    }

    static int displayOptions(){
        Scanner input = new Scanner(System.in);
        System.out.println(BLUE + "\nHello sir, please choose one of the following options:" + RESET);
        System.out.println(" 1-Display menu\n 2-Display Best Dishes\n 3-Display specific category items\n " +
                "4-Add your favorite item to best sellers\n 5-Make an order\n 6-Exit");
        return input.nextInt();
    }
    
    static void displayCategoryItems(){
        System.out.println("These are our categories:");
        menu.displayCategories();
        System.out.print("Which one do you want, please enter its number: ");
        int cat_index = input.nextInt();
        menu.displayCategoryItem(cat_index-1);
    }
    
    static void ordering(){
        boolean continueOrdering = true;
        while (continueOrdering){
            System.out.println("Please enter the item number:");
            int orderItem_index = input.nextInt();
            System.out.println("Enter your quantity:");
            int orderItem_quantity = input.nextInt();
            order.addItemToOrder(menu.getMenuItem(orderItem_index), orderItem_quantity);
            System.out.println("Do you want to continue? (choose a number: 1-yes  2-no");
            String wantToContinue = input.next();
            switch (wantToContinue.toLowerCase()){
                case "yes":
                    continueOrdering =  true;
                    break;
                case "no":
                    continueOrdering = false;
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }

    static void afterOrderHandling(){
        boolean keepHandling = false;
        while (!keepHandling){
            System.out.println("Please choose one of the following options:\n 1-Display order details\n 2-Modify an item quantity\n " +
                    "3-Remove an item\n 4-Display final bill");
            switch (input.nextInt()) {
                case 1:
                    order.displayOrderDetails();
                    break;
                case 2:
                    order.displayOrderDetails();
                    System.out.println("Please enter the item number you want to modify:");
                    int modify_index = input.nextInt();
                    System.out.println("Please enter the new quantity:");
                    int new_quantity = input.nextInt();
                    order.modifyOrderItemQuantity(modify_index, new_quantity);
                    order.displayOrderDetails();
                    break;
                case 3:
                    order.displayOrderDetails();
                    System.out.println("Please enter the item number you want to remove:");
                    order.removeItemFromOrder(input.nextInt());
                    order.displayOrderDetails();
                    break;
                case 4:
                    System.out.println("Please enter the discount percentage: ");
                    order.displayFinalBill(input.nextDouble());
                    keepHandling = true;
                    break;
                default:
                    System.out.println(RED + "Invalid option! Please enter a valid index" + RESET);
            }
        }
    }
}