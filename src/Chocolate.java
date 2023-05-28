import java.util.ArrayList;
import java.util.List;


public class Chocolate extends Product {
    private int weight;
    private String typeOfChocolate;
    private String nuts;
    private String formOfChocolate;

    public String getName() {
        return name;
    }

    private List <String> ArrTypeOfChocolate = new ArrayList<String>() {{add("dark"); add("milk"); add("white");}};

    private List <String> ArrNuts = new ArrayList<String>() {{
        add("almond");
        add("peanut");
        add("hazelnuts");
        add("without nuts");}};

    private List <String> ArrFormOfChocolate = new ArrayList<String>() {{add("bar"); add("tile");}};

    public Chocolate (String brand, String name, double price, int weight, String typeOfChocolate, String nuts, String formOfChocolate) {
        super(brand, name, price);
        checkInt(weight);
        checkString ("typeOfChocolate", typeOfChocolate, ArrTypeOfChocolate);
        checkString ("nuts", nuts, ArrNuts);
        checkString ("formOfChocolate", formOfChocolate, ArrFormOfChocolate);
    }

    public Chocolate (){
        this ("noname", "Just Chocolate", 100.00, 100,"milk", "without nuts", "tile");
    }

    private void checkString (String value, String inputValue, List Array){
        if (Array.contains(inputValue.toLowerCase())){
            switch (value) {
                case ("typeOfChocolate") -> this.typeOfChocolate = inputValue;
                case ("nuts") -> this.nuts = inputValue;
                case ("formOfChocolate") -> this.formOfChocolate = inputValue;
            }
        }
        else {
            switch (value) {
                case ("typeOfChocolate") -> this.typeOfChocolate = "milk";
                case ("nuts") -> this.nuts = "without nuts";
                case ("formOfChocolate") -> this.formOfChocolate = "tile";
        }
    }

}

    private void checkInt (int inputValue){
        if (inputValue < 0) {this.weight = 100;}
        else {this.weight = inputValue;}
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад: \"%s\", производитель: \"%s\", цена: %.2f руб.]\n" +
                "[%d гр., %s, %s, %s] \n", name, brand, price, weight, typeOfChocolate, nuts, formOfChocolate);
    }
}
