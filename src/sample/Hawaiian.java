package sample;
import java.util.ArrayList;

public class Hawaiian extends Pizza{

    public Hawaiian(String style, String size){
        super(style, size);
    }

    public int pizzaPrice(){
        if(this.size.equals("small")){
            PRICE = 8;
        }else if(this.size.equals("medium")){
            PRICE = 10;
        }else if(this.size.equals("large")){
            PRICE = 12;
        }
        return PRICE;
    }

    @Override
    public String toString() {
        return this.style + ":" + this.size + "\n";
    }

    public static void main(String[] args) {

        /*ArrayList list = new ArrayList<String>();
        list.add("Ham");
        list.add("Pineapple");
        */

        Hawaiian hawaiian = new Hawaiian("Hawaiian", "large");
        System.out.println(hawaiian.toString() + "\n" + "$" + hawaiian.pizzaPrice());
    }

}
