package com.Problem.Names;

import java.util.ArrayList;
import java.util.Random;

public class Names2 {

    public static Random r = new Random();

    public static String getName() {

        ArrayList<String> name1 = new ArrayList<>();
        name1.add("Justin");
        name1.add("Nate");
        name1.add("Pat");
        name1.add("Kyle");


        int index = r.nextInt(name1.size());
        return name1.get(index);
    }
}
