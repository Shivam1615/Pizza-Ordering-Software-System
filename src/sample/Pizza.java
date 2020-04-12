package sample;
import java.util.ArrayList;

/**
 * This is the abstract superclass of the Build Your Own, Deluxe, and the Hawaiian pizza that
 * consists of two constructors and the toString method as well as the abstract method pizzaPrice().
 *
 * @author Shivam Patel
 * @author Kevin Shah
 */
public abstract class Pizza {
    protected String style;
    protected String size;
    protected ArrayList<String> toppings;

    /**
     * This is the first constructor that is used by the subclass Build_Your_Own because of the arraylist.
     *
     * @param style Is the style that composes of Build Your Own pizza.
     * @param size Is the size of any of the Build Your Own pizza.
     * @param toppings Is the arraylist of the toppings for Build Your Own pizza.
     */
    public Pizza(String style, String size, ArrayList<String> toppings) {
        this.style = style;
        this.size = size;
        this.toppings = toppings;
    }

    /**
     * This is the second constructor that is used by the subclasses of Deluxe pizza and Hawaiian pizza.
     *
     * @param style Is the style of Hawaiian or Deluxe pizzas.
     * @param size Is the size of Hawaiian or Deluze pizzas.
     */
    public Pizza(String style, String size) {
        this.style = style;
        this.size = size;
    }

    /**
     * Is the abstract method that is used by the subclasses in order to compute pizzas respectively.
     *
     * @return returns the price of any of the three pizzas in the subclasses.
     */
    public abstract int pizzaPrice();

    /**
     * Is the toString method of the Pizza superclass and are overwritten by the three subclasses.
     *
     * @return Returns the value of the three types of pizzas, but are overwritten in the subclasses.
     */
    public String toString() {
        return this.style + " " + this.size.toUpperCase() + "\nPrice: $" + pizzaPrice() + "\n";
    }

    /**
     * This is the main method and is used for testing values of the pizzas by using an arraylist of toppings.
     *
     * @param args Is an argument of the Main method.
     */
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
