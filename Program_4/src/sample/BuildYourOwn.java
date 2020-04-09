package sample;
import java.util.ArrayList;

public class BuildYourOwn extends Pizza{

    public BuildYourOwn(String style, String size, ArrayList<String> toppings){
        super(style, size, toppings);
    }

    public int pizzaPrice(){
        return 0;
    }

    @Override
    public String toString() {
        return this.style + this.size;
    }

    public static void main(String[] args) {

    }

}
