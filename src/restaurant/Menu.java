package restaurant;

import java.util.ArrayList;

public class Menu {
    private String name;
    private ArrayList<MenuItem> items = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public void setItems(MenuItem aItem) {
        items.add(aItem);
    }

    public ArrayList<String> getItems() {
        ArrayList<String> items = new ArrayList<>();

        for (MenuItem item : this.items) {
            String lineItem = "";

            lineItem += item.getName() + "\t";
            lineItem += item.getDescription() + "\t";
            lineItem += item.getPrice();

            items.add(lineItem);
         }
        return items;
    }
}
