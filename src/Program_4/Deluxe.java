package Program_4;

/**
 * This subclass is the Deluxe style pizza class that computes the price of a Deluxe pizza and
 * prints out the value of the Deluxe pizza in the toString method.
 *
 * @author Shivam Patel
 * @author Kevin Shah
 *
 */
public class Deluxe extends Pizza{

    private int SMALL_FLAT_FEE = 14;
    private int MEDIUM_FLAT_FEE = 2;
    private int LARGE_FLAT_FEE = 4;

    Controller controller = new Controller();

    /**
     * This method is the contructor that takes in the style and size of the Deluxe pizza
     * amd initializes them.
     *
     * @param style Is the style of the pizza which is Deluxe in this class.
     * @param size is the variable that composes of small, medium, and large sizes of pizzas.
     */
    public Deluxe(String style, String size){
        super(style, size);
    }

    /**
     * This is the toString() method that prints out the value of the Deluxe pizza.
     *
     * @return returns the value of Deluxe pizza in a string format.
     */
    @Override
    public String toString() {
        return this.style + " " + this.size.toUpperCase() + "\nToppings: " +
                controller.Deluxe_Toppings.toString().replace("[", "").replace("]", "") + "\nPrice: $" + pizzaPrice() + "\n";
    }

    /**
     * This method computes the price of the Deluxe pizza.
     *
     * @return variable that returns the price of the Deluxe pizza.
     */
    public int pizzaPrice(){
        int price = SMALL_FLAT_FEE;
        if (size.equals("medium")) {
            price += MEDIUM_FLAT_FEE;
        } else if (size.equals("large")) {
            price += LARGE_FLAT_FEE;
        }
        return price;
    }

}
