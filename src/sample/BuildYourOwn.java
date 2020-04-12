package sample;
import java.util.ArrayList;

/**
 * This class includes the Build Your Own style pizza and computes the price of this pizza along with printing out
 * items in Build Your Own pizza in string format.
 *
 * @author Shivam Patel
 * @author Kevin Shah
 *
 */
public class BuildYourOwn extends Pizza{

    private int PRICE_PER_TOPPING = 2;
    private int SMALL_FLAT_FEE = 5;
    private int MEDIUM_FLAT_FEE = 2;
    private int LARGE_FLAT_FEE = 4;

    /**
     * This is the contructor that initializes the values of style, size, and toppings arraylist.
     *
     * @param style is the name of the type of pizza.
     * @param size composes of small, medium, and large pizzas.
     * @param toppings composes of 10 items for customers to chose from.
     */
    public BuildYourOwn(String style, String size, ArrayList<String> toppings){
        super(style, size, toppings);
    }

    /**
     * Computes the price of the Build Your Own Pizza.
     *
     * @return returns the value of the price of Build Your Own Pizza.
     */
    public int pizzaPrice() {
        int price = SMALL_FLAT_FEE + (PRICE_PER_TOPPING * toppings.size());
        if(toppings.size() < 1 || toppings.size() > 6){
            throw new NullPointerException("Invalid number of toppings");
        } else {
            if (size.equals("medium")) {
                price += MEDIUM_FLAT_FEE;
            } else if (size.equals("large")) {
                price += LARGE_FLAT_FEE;

            }
        }
        return price;
    }

    /**
     * This method is the toString() method that outputs the items of Build Your Own pizza in string format.
     *
     * @return returns the string value of the items in the Build Your Own Pizza.
     */
    @Override
    public String toString() {
        return this.style + " " + this.size.toUpperCase() + "\nToppings: " +
                this.toppings.toString().replace("[", "").replace("]", "")
                + "\nPrice: $" + pizzaPrice() + "\n";
    }

}
