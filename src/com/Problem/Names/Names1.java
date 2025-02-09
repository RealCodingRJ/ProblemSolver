package com.Problem.Names;

import java.util.ArrayList;
import java.util.Random;

public class Names1 {

    public static Random r = new Random();

    public static String getName() {

        ArrayList<String> name1 = new ArrayList<>();
        name1.add("James");
        name1.add("Luke");
        name1.add("Peter");
        name1.add("Matt");




        int index = r.nextInt(name1.size());
        return name1.get(index);
    }


}
