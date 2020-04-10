package sample;
import java.util.ArrayList;

public class BuildYourOwn extends Pizza{

    private int PRICE_PER_TOPPING = 2;
    private int SMALL_FLAT_FEE = 5;
    private int MEDIUM_FLAT_FEE = 2;
    private int LARGE_FLAT_FEE = 4;

    public BuildYourOwn(String style, String size, ArrayList<String> toppings){
        super(style, size, toppings);
    }

    public int pizzaPrice() {
        int price = SMALL_FLAT_FEE + (PRICE_PER_TOPPING * toppings.size());
        if (size.equals("medium")) {
            price += MEDIUM_FLAT_FEE + (PRICE_PER_TOPPING * toppings.size());
        } else if (size.equals("large")) {
            price += LARGE_FLAT_FEE + (PRICE_PER_TOPPING * toppings.size());
        }
        return price;
    }

    @Override
    public String toString() {
        return this.style + " " + this.size.toUpperCase() + "\nToppings: " + this.toppings
                + "\nTotal: $" + pizzaPrice() + "\n";
    }

}
