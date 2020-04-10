package sample;
import java.util.ArrayList;

public class Deluxe extends Pizza{


    public Deluxe(String style, String size){
        super(style, size);
    }

    public int pizzaPrice(){
        if(this.size.equals("small")){
            PRICE = 14;
        }else if(this.size.equals("medium")){
            PRICE = 16;
        }else if(this.size.equals("large")){
            PRICE = 18;
        }
        return PRICE;
    }

    @Override
    public String toString() {
        return this.style + ":" + this.size + "\n";
    }

    public static void main(String[] args) {

        /*ArrayList list = new ArrayList<String>();
        list.add("Sausage");
        list.add("Pepperoni");
        list.add("Green Pepper");
        list.add("Onion");
        list.add("Mushroom");
        */

        Deluxe deluxe = new Deluxe("Deluxe", "small");
        System.out.println(deluxe.toString() + "$" + deluxe.pizzaPrice());
    }

}
