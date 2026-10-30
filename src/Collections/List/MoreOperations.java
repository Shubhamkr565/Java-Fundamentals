package Collections.List;

import java.util.ArrayList;

public class MoreOperations {



    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Patna");

        System.out.println(cities);

        System.out.println("Total Cities: "+cities.size());

        System.out.println("first citie: "+cities.get(0));

        cities.remove("Mumbai");

        System.out.println(cities);


    }
}
