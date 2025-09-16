package RestaurantApp;

public class MenuItem {
    private String name;
    private String category;
    private double price;
    private String description;
    private boolean bestSellers;

    public MenuItem(String name, String category, double price, String description, boolean bestSellerss) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
        this.bestSellers = bestSellerss;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean isBestSellers() {
        return bestSellers;
    }

    public void setAsBestDishes(boolean bestDishes) {
        this.bestSellers = bestDishes;
    }
}
