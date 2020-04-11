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
        int price = 0;
        if(toppings.size() < 1 || toppings.size() > 6){
            throw new NullPointerException("Invaild number of toppings");
        }else {
            price = SMALL_FLAT_FEE + (PRICE_PER_TOPPING * toppings.size());
            if (size.equals("medium")) {
                price += MEDIUM_FLAT_FEE;
            } else if (size.equals("large")) {
                price += LARGE_FLAT_FEE;
            }
        }
        return price;
    }

    @Override
    public String toString() {
        return this.style + ":" + this.size.toUpperCase() + "\nToppings: " +
                this.toppings.toString().replace("[", "").replace("]", "")
                + "\nPrice: $" + pizzaPrice() + "\n";
    }

}
