package sample;
import java.util.ArrayList;

public abstract class Pizza {
    protected String style;
    protected String size;
    protected ArrayList<String> toppings;

    public Pizza(String style, String size, ArrayList<String> toppings) {
        this.style = style;
        this.size = size;
        this.toppings = toppings;
    }

    public Pizza(String style, String size) {
        this.style = style;
        this.size = size;
    }

    public abstract int pizzaPrice();

    public String toString() {
        return this.style + " " + this.size.toUpperCase() + "\nTotal: $" + pizzaPrice() + "\n";
    }

    public static void main(String[] args) {
        ArrayList<String> myToppings = new ArrayList<>();
        myToppings.add("Tomato");
        myToppings.add("Onions");
        myToppings.add("Tomato");
        myToppings.add("Onions");
        myToppings.add("Tomato");
        myToppings.add("Onions");
        Pizza myPizza = new Deluxe("Deluxe", "large");
        System.out.println(myPizza);
    }
}
