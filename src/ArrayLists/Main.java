package ArrayLists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList groceries = new ArrayList();
        groceries.add("Eggs");
        groceries.add("Butter");
        groceries.add("Milk");
        groceries.add("Hot Dogs");
        groceries.add("Water");
        groceries.add("Juice");
        groceries.add("Meat");
        groceries.add("Salt");
        groceries.add("Pepper");
        System.out.println(
                "-----------------------"
        );
        System.out.println("My Grocery List");
        System.out.println(
                "-----------------------"
        );
        for (int i = 0; i < groceries.size(); i++){
            System.out.println(groceries.get(i));
        }
    }
}
