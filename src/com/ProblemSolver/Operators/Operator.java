package com.ProblemSolver.Operators;

import java.util.ArrayList;
import java.util.Random;


public class Operator {

    public static ThreadLocal thread =
            ThreadLocal.withInitial(() -> null);
    public static Random r = new Random();

    public static String printOperator() {

        Thread th = new Thread(() -> {
            thread.set(getOperator());
            getOperatorMessage();
        });

        th.start();
        return null;
    }

    public static String getOperator() {
        ArrayList<String> op = new ArrayList<>();

        op.add("+");
        op.add("-");
        op.add("*");
        op.add("/");


        int index = r.nextInt(op.size());
        return op.get(index);
    }





    public static void getOperatorMessage() {
        System.out.println("Selected Op: " + thread.get()) ;

    }


}
