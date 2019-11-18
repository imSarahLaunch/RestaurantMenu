package restaurant;

public class Restaurant {
    public static void main(String[] args) {
        Menu menu = new Menu("Dominos");

        menu.setItems(new MenuItem("Pepperoni Pizza", 12.00));
        menu.setItems(new MenuItem("Bread Bites", 6.00));

        System.out.println(menu.getName());
        System.out.println(menu.getItems());
        
    }
}
