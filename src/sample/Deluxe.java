package sample;

public class Deluxe extends Pizza{

    private int SMALL_FLAT_FEE = 14;
    private int MEDIUM_FLAT_FEE = 2;
    private int LARGE_FLAT_FEE = 4;

    Controller controller = new Controller();

    public Deluxe(String style, String size){
        super(style, size);
    }
    
    @Override
    public String toString() {
        return this.style + ":" + this.size.toUpperCase() + "\nToppings: " +
                controller.Deluxe_Toppings.toString().replace("[", "").replace("]", "") + "\nPrice: $" + pizzaPrice() + "\n";
    }

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
