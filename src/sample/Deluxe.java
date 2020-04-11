package sample;

public class Deluxe extends Pizza{

    private int SMALL_FLAT_FEE = 14;
    private int MEDIUM_FLAT_FEE = 2;
    private int LARGE_FLAT_FEE = 4;

    public Deluxe(String style, String size){
        super(style, size);
    }

    public String toString() {
        return this.style + " " + this.size.toUpperCase() + "\nPrice: $" + pizzaPrice() + "\n";
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
