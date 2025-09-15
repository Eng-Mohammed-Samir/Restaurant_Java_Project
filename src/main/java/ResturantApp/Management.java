package RestaurantApp;

public class Management {
    private static final String[] myCategories = {"Breakfast", "Pasta", "Pizza", "Ice Cream", "Desserts"};
    private static final MenuItem[] myMenuItems = {
            new MenuItem("Eggs with pastrami","Breakfast", 160,"Served with an appetizer platter, Etoile bread, and your choice of Turkish coffee or tea.", false),
            new MenuItem("Eggs with sausage","Breakfast", 160,"Served with an appetizer platter, Etoile bread, and your choice of Turkish coffee or tea.", false),
            new MenuItem("Shakshuka","Breakfast", 135,"Served with an appetizer platter, Etoile bread, and your choice of Turkish coffee or tea.", false),
            new MenuItem("Egyptian breakfast","Breakfast", 90,"Egyptian pie, white honey, local cream and your choice of Turkish tea or coffee.", false),
            new MenuItem("Turkish breakfast","Breakfast", 80,"Etoile bread, white honey, local cream, yogurt with your choice of Turkish tea or coffee.", false),
            new MenuItem("Negresco pasta","Pasta", 130,"Marinated chicken, mushrooms, mozzarella, white sauce.", true),
            new MenuItem("Crispy chicken pasta","Pasta", 125,"Hot or regular with mozzarella and white sauce.", true),
            new MenuItem("Seafood pasta","Pasta", 195,"Shrimp, calamari, mozzarella, crab and white sauce.", true),
            new MenuItem("sausage pasta","Pasta", 115,"Sausage, mozzarella, red sauce", false),
            new MenuItem("Chicken Ranch Pizza","Pizza", 170,"Marinated chicken, mozzarella, colored pepper, olives, ranch sauce, tomato sauce.", true),
            new MenuItem("Super Supreme Pizza","Pizza", 200,"Pepperoni, meat, mozzarella, bell peppers, olives, tomato sauce.", false),
            new MenuItem("Pepperoni pizza","Pizza", 175,"Pepperoni, mozzarella, bell peppers, olives, tomato sauce.", false),
            new MenuItem("Four Seasons Pizza","Pizza", 215,"Marinated chicken, beef, pepperoni, mushrooms, mozzarella, cheddar cheese, Kiri cheese, Romano cheese, colored peppers, olives, ranch sauce, tomato sauce.", false),
            new MenuItem("BBQ chicken Pizza","Pizza", 210,"Marinated chicken, mozzarella, bell peppers, olives, barbecue sauce, tomato sauce.", false),
            new MenuItem("Margherita pizza","Pizza", 140,"Tomato sauce and mixed cheese.", false),
            new MenuItem("Seafood pizza","Pizza", 230,"Shrimp, calamari, crab, mozzarella, colored pepper, olives, tomato sauce.", false),
            new MenuItem("Magnum Ice cream","Ice Cream", 85,"Ice cream of your choice, chocolate sauce, grenadine, apple.",false),
            new MenuItem("Banana Split","Ice Cream", 90,"2 scoops of ice cream, banana.",false),
            new MenuItem("Molten chocolate cake","Desserts", 85,"",false),
            new MenuItem("Lotus Molten Cake","Desserts", 115,"",false),
            new MenuItem("Cheesecake","Desserts", 75,"",false),
            new MenuItem("Chocolate cake","Desserts", 60,"",false),
            new MenuItem("Honey cake","Desserts", 60,"White and black honey",false),
            new MenuItem("Japanese cake","Desserts", 70,"",false)
            //new MenuItem("","", 0,"",false)
    };

    public static void menuSetup(Menu menu){
        menu.addMenuCategories(myCategories);
        menu.addMenuItemsForSetup(myMenuItems);
    }

}
