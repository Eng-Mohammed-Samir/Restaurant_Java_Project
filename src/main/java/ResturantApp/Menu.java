package RestaurantApp;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menu = new ArrayList<>();
    private List<String> categories = new ArrayList<>();

    // Reset
    public static final String RESET = "\u001B[0m";

    // Regular Colors
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";

    public void addMenuItemsForSetup(MenuItem[] items){
        boolean isItemExist = false;
        for(MenuItem item : items){
            isItemExist = isMenuItemExist(item);
            if(!isItemExist){
                menu.add(item);
            }
            else{
                System.out.println("This item already exists");
            }
        }
    }

    public MenuItem getMenuItem(int index){
        if(index >= menu.size()){
            System.out.println(RED + "Invalid index! This item doesn't exist in menu" + RESET);
            return null;
        }
        else{
            return menu.get(index-1);
        }
    }

//    public void addNewMenuItem(MenuItem item){
//        boolean isItemExist = false;
//        isItemExist = isMenuItemExist(item);
//        if(!isItemExist){
//            addMenuItemToItsCategory(item);
//        }
//        else{
//            System.out.println("This item already exists");
//        }
//    }

    public void addMenuCategories(String[] categories){
        boolean isCategoeyExist = false;
        for(String category : categories){
            for(String menuCategory : this.categories){
                if (menuCategory.equalsIgnoreCase(category.toLowerCase())) {
                    isCategoeyExist = true;
                    break;
                }
            }
            if(!isCategoeyExist){
                this.categories.add(category);
            }
            else{
                System.out.println("This category already exists");
            }
        }
    }

    public void displayMenu(){
        int iterator = 1;
        for(String category : categories){
            System.out.println(RED + "\n" +category + RESET);
            for(MenuItem item : menu){
                if(item.getCategory().equals(category)){
                    System.out.printf(BLUE + "%d-%-45s price:%.2f \n" + RESET , iterator, item.getName(), item.getPrice());
                    if(!item.getDescription().isEmpty()){
                        System.out.printf("(%s)\n",item.getDescription());
                    }
                    iterator++;
                }
            }
        }
    }

    public void addItemToBestDishes(int itemIndexInMenu){
        menu.get(itemIndexInMenu).setAsBestDishes(true);
    }

    public void removeItemFromBestDishes(int itemIndexInMenu){
        menu.get(itemIndexInMenu).setAsBestDishes(false);
    }

    public void displayBestDishes(){
        System.out.println(RED + "Best Dishes" + RESET);
        for(MenuItem item : menu){
            if(item.isBestSellers()){
                System.out.printf(BLUE + "%-47s price:%.2f \n" + RESET , item.getName(), item.getPrice());
                if(!item.getDescription().isEmpty()){
                    System.out.printf("(%s)\n",item.getDescription());
                }
            }
        }
    }

    public void displayCategories(){
        int iterator = 1;
        for(String category : categories){
            System.out.println(RED + iterator + "-" + category + RESET);
            iterator++;
        }
    }

    public void displayCategoryItem(int index){
        System.out.println(RED + categories.get(index) + RESET);
        for(MenuItem item : menu){
            if(item.getCategory().equals(categories.get(index))){
                System.out.printf(BLUE + "%-47s price:%.2f \n" + RESET , item.getName(), item.getPrice());
                if(!item.getDescription().isEmpty()){
                    System.out.printf("(%s)\n",item.getDescription());
                }
            }
        }
    }

    // Helper methods
    private boolean isMenuItemExist(MenuItem item){
        boolean isItemExist = false;
        for(MenuItem menuItem : menu){
            if (menuItem.getName().equalsIgnoreCase(item.getName().toLowerCase())) {
                isItemExist = true;
                break;
            }
        }
        return isItemExist;
    }

    private void addMenuItemToItsCategory(MenuItem item){
        for(MenuItem menuItem : menu){
            if(menuItem.getCategory().equalsIgnoreCase(item.getCategory().toLowerCase())){
                menu.add(menu.indexOf(menuItem), item);
                break;
            }
        }
    }
}
