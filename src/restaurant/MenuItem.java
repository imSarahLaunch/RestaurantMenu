package restaurant;

public class MenuItem {
    private String name;
    private double price;
    private String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public MenuItem(String name, double price) {
        this(name, price, "");
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }
}
