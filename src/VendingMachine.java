

import java.util.List;

public class VendingMachine {

    private List<Product> products;


    public VendingMachine(List<Product> products) {
        this.products = products;
    }


    public Product getProduct (String typeOfProduct, String name){
        for (Product product : products){
            if (product.getClass().getSimpleName().equals(typeOfProduct)){
                if (product.getName().equals(name)){
                    return product;
                }
            }
        }
        return null;
    }

//    public BottleOfWater getBottleOfWater(double volume){
//        for (Product product : products){
//            if (product instanceof BottleOfWater){
//                if (((BottleOfWater)product).getVolume()  == volume){
//                    return (BottleOfWater)product;
//                }
//            }
//        }
//        return null;
//    }

}
