package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class UniqueProductCategories {

    public static void main(String[] args) {
        Set<String> product = new HashSet<>();

        product.add("Electronics");
        product.add("Clothing");
        product.add("Electronics");
        product.add("Grocery");
        product.add("Clothing");
        product.add("Books");

        System.out.println("Unique Categories: "+product);
        System.out.println("Total Categories: "+product.size());

    }
}
