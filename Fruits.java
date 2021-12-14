import java.util.*;
/**
 * Fruits class which holds types of fruits
 * @author t487060
 */


public class Fruits {


    private String fruit_name;
    private long fruit_price;
    private String fruit_colour;


    public Fruits(String fruit_name, long fruit_price, String fruit_colour) {
        this.fruit_name = fruit_name;
        this.fruit_price = fruit_price;
        this.fruit_colour = fruit_colour;
    }
    public String getFruit_name() {
        return fruit_name;
    }
    public long getFruit_price() {return fruit_price; }
    public String getFruit_colour() {return fruit_colour; }

}

