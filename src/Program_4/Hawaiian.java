package Program_4;

/**
 * @author Shivam Patel
 * @author Kevin Shah
 *
 * This subclass is the Hawaiian pizza that computes the price of this pizza and prints out the value of the Hawaiian
 * pizza in a string format.
 */
public class Hawaiian extends Pizza{

    private int SMALL_FLAT_FEE = 8;
    private int MEDIUM_FLAT_FEE = 2;
    private int LARGE_FLAT_FEE = 4;

    Controller controller = new Controller();

    /**
     * Is a constructor of the Hawaiian Pizza that initializes the style and the size of the pizza.
     *
     * @param style Is the Hawaiian style pizza.
     * @param size Is the size of the Hawaiian style pizza.
     */
    public Hawaiian(String style, String size){
        super(style, size);
    }

    /**
     * Is the toString method of the Hawaiian Pizza that returns the value of the pizza.
     *
     * @return returns the string value of the Hawaiian Pizza.
     */
    @Override
    public String toString() {
        return this.style + " " + this.size.toUpperCase() + "\nToppings: " +
                controller.Hawaiian_Toppings.toString().replace("[", "").replace("]", "") +
                "\nPrice: $" + pizzaPrice() + "\n";
    }

    /**
     * This method computes the price of the Hawaiian Pizza.
     *
     * @return Is the variable that computes the price of the Hawaiian Pizza.
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
