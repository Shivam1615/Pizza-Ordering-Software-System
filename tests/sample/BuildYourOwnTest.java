package sample;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * This is the Junit testing class that composes of testing the Build Your Own pizza by
 * using the black box techniques. It tests the lower bounds, upper bounds, and the middle bounds
 * of the test cases.
 */
public class BuildYourOwnTest {
    /**
     * This is the pizzaPrice method that tests all three types of pizzas by testing
     * prices of the pizzas based on how many toppings the pizza contains and the different
     * sizes of the pizzas. In this case, I tested the 6 cases for different sizes of pizzas
     * such as small, medium, and large Build Your Own pizzas.
     *
     * @throws Exception Throws an exception when a test case is not meet with proper value.
     */
    @Test
    public void pizzaPrice() throws Exception{
        ArrayList<String> medium_size = new ArrayList<>();
        BuildYourOwn own = new BuildYourOwn("Build Your Own", "medium", medium_size);
        medium_size.add("Chicken");
        assertEquals(9, own.pizzaPrice()); //1 topping for medium sized (This is the lower bound)
        medium_size.add("Beef");
        assertEquals(11, own.pizzaPrice()); //2 toppings for medium sized
        medium_size.add("Cheese");
        assertEquals(13, own.pizzaPrice()); //3 toppings for medium sized
        medium_size.add("Mushroom");
        assertEquals(15, own.pizzaPrice()); //4 toppings for medium sized
        medium_size.add("Ham");
        assertEquals(17, own.pizzaPrice()); //5 toppings for medium sized
        medium_size.add("Onion");
        assertEquals(19, own.pizzaPrice());  //6 toppings for medium sized (This is the upper bound)

        ArrayList<String> small_size = new ArrayList<>();
        BuildYourOwn own2 = new BuildYourOwn("Build Your Own", "small", small_size);
        small_size.add("Beef");
        assertEquals(7, own2.pizzaPrice()); //1 topping for small sized (This is the lower bound)
        small_size.add("Cheese");
        assertEquals(9, own2.pizzaPrice()); //2 toppings for small sized
        small_size.add("Mushroom");
        assertEquals(11, own2.pizzaPrice()); //3 toppings for small sized
        small_size.add("Pepperoni");
        assertEquals(13, own2.pizzaPrice()); //4 toppings for small sized
        small_size.add("Pineapple");
        assertEquals(15, own2.pizzaPrice()); //5 toppings for small sized
        small_size.add("Sausage");
        assertEquals(17, own2.pizzaPrice()); //6 toppings for small sized (This is the upper bound)

        ArrayList<String> large_size = new ArrayList<>();
        BuildYourOwn own3 = new BuildYourOwn("Build Your Own", "large", large_size);
        large_size.add("Green Pepper");
        assertEquals(11, own3.pizzaPrice()); //1 topping for large sized (This is the lower bound)
        large_size.add("Ham");
        assertEquals(13, own3.pizzaPrice()); //2 toppings for large sized
        large_size.add("Onion");
        assertEquals(15, own3.pizzaPrice()); //3 toppings for large sized
        large_size.add("Chicken");
        assertEquals(17, own3.pizzaPrice()); //4 toppings for large sized
        large_size.add("Pineapple");
        assertEquals(19, own3.pizzaPrice()); //5 toppings for large sized
        large_size.add("Mushroom");
        assertEquals(21, own3.pizzaPrice()); //6 toppings for large sized (This is the upper bound)

    }
}