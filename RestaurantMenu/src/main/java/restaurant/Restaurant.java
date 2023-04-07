package restaurant;

public class Restaurant {
    public static void main(String[] args) {

        // TODO: Create menu items
        MenuItem item1 = new MenuItem("Pepperoni Pizza", "Classic Slice", 7.39, "main course");
        MenuItem item2 = new MenuItem("Toasted Ravioli", "St. Louis favorite", 6.29, "appetizer");
        MenuItem item3 = new MenuItem("Chocolate Cake", "Overly Chocolate", 4.59, "dessert");
        MenuItem item4 = new MenuItem("Veggie Pizza", "All the veggies you will ever need", 8.99, "main course");
        MenuItem item5 = new MenuItem("Garlic Bread", "Hot, buttery, delicious", 2.89, "appetizer");

        //TODO: Create a menu

        Menu menu = new Menu();


        //TODO: Add menu Items to menu

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        //TODO: Print the entire menu
        System.out.println(menu);

        //TODO: Print one item from the menu
        System.out.println(item1);


        // TODO: Remove an item and reprint menu
        menu.removeItem(item4);
        System.out.println(menu);

        // TODO: Test equals method
        System.out.println(item1.equals(item2));


        // BONUS MISSION

        // TODO: Try to add a duplicate
    }
}
