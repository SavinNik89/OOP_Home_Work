
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        int a = 1;
        Product product1;

        product1 = new Product("ООО Лучшая вода", "Бу", -100.12);

//        System.out.println(product1.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [1]", 115, 1);
        Product bottleOfWater2 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [2]", 215, 1.5);
        BottleOfWater bottleOfWater3 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [3]", 1115, 1.5);
        Product bottleOfWater4 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [4]", 55, 2);

        Product snickers = new Chocolate("Mars Incorporated", "Snickers", 65.50,
                85, "milk", "peanut", "bar");

        Product alenka = new Chocolate();

        Product ritterSport = new Chocolate("Alfred Ritter GmbH & Co. KG", "Ritter Sport", 250.00,
                100, "dark", "almond", "tile");

        Product babaevskiy = new Chocolate("BA", "BA", -5.0,
                -250, "cocoa", "pistachios", "piece");

        System.out.println(alenka.displayInfo());

        System.out.println(snickers.displayInfo());

        System.out.println(ritterSport.displayInfo());

        System.out.println(babaevskiy.displayInfo());


//        System.out.println(bottleOfWater1.displayInfo());
        Product bottleOfMilk1 = new BottleOfMilk("ООО Чистый источник", "Бутылка с молоком", 115, 1.5, 10);
//        System.out.println(bottleOfMilk1.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater4);
        products.add(bottleOfWater3);
        products.add(alenka);
        products.add(snickers);
        products.add(ritterSport);
        products.add(babaevskiy);

        VendingMachine vendingMachine = new VendingMachine(products);
        Product productResult = vendingMachine.getProduct("Chocolate", "Ritter Sport");
        if (productResult != null){
            System.out.println("Вы купили: ");
            System.out.println(productResult.displayInfo());
        }
        else {
            System.out.println("Такого продукта нет в автомате.");
        }
    }
}
