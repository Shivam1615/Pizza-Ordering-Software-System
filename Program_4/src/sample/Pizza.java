package sample;
import java.util.ArrayList;

public abstract class Pizza {
    protected String style;
    protected String size;
    protected ArrayList<String> toppings;

    public int PRICE = 0;


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
        return this.style + ":" + this.style + "\n";
    }
}