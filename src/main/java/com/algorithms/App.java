package com.algorithms;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Random;

public class App {
    public static void main(String[] args) {

        // 1.1.3
//        printEqualNotEqual(args);
//
//        // 1.1.5
//        System.out.println(evaluateCorrectRange(.1, 0.3));
//

        // 1.1.6
        //  fibonacci();

        // 1.1.7(a)
//        whileMinusValue();
//        // 1.1.7(b)
//        addFirst1000Numbers();
//
//        // 1.1.7(c)
//        getSum();

        // 1.1.9 Write a code fragment that puts the binary representation of a positive integer N
        // into a String s.

//        integerToBinary(151351);

        // 1.1.11
        // Write a code fragment that prints the contents of a two-dimensional boolean array
        // using * to reresent true and a space to represent false. Include row and column numbers.

        boolean[][] booleans = new boolean[StdRandom.uniform(1, 10)][StdRandom.uniform(25, 50)];

        StdOut.println("La matriz generada es de: [" + booleans.length + "][" + booleans[0].length + "] elementos");
        for (int i = 0; i < booleans.length; i++) {
            for (int j = 0; j < booleans[i].length; j++) {
                booleans[i][j] = randomBoolean();
            }
        }

        printBooleanArray(booleans);


    }

    private static boolean randomBoolean() {
        Random r = new Random();
        return r.nextBoolean();
    }

    private static void printBooleanArray(boolean[][] booleans) {
        StdOut.print("X ");
        for (int i = 0; i < booleans[0].length; i++) {
            StdOut.print(i + 1);
        }
        StdOut.println();

        for (int i = 0; i < booleans.length; i++) {
            StdOut.print(i + 1 + " ");
            for (int j = 0; j < booleans[i].length; j++) {
                if (booleans[i][j])
                    StdOut.print(" ");
                else
                    StdOut.print("*");
            }
            StdOut.println();
        }


    }

    private static void integerToBinary(int integer) {
        String s = "";
        for (int i = integer; i > 0; i = i / 2) {
//
//            if (i % 2 == 0) {
//                // concatena el 0
////                System.out.println("0");
//
//                s.append("0");
//            } else {
//                // concatena el 1
////                System.out.println("1");
//                s.append("1");
//            }

            s = (integer % 2) + s;
        }
        StdOut.println(integer + " en binario es: " + s);
    }

    private static void getSum() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < 1000; j++)
                sum++;

        StdOut.println(sum);
    }

    private static void addFirst1000Numbers() {
        int sum = 0;
        for (int i = 0; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;

        StdOut.println(sum);
    }

    private static void whileMinusValue() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001)
            t = (9.0 / t + t) / 2.0;
        StdOut.printf("%.5f\n", t);
    }

    private static void fibonacci() {
        int f = 0;
        int g = 1;
        for (int i = 0; i < 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }


    private static void printEqualNotEqual(String[] args) {
        // TODO verificar tamaño de args

        if (args[0].equals(args[1])) {
            if (args[0].equals(args[2])) {
                StdOut.println("equal");
            } else {
                StdOut.println("not equal");

            }
        } else {
            StdOut.println("not equal");
        }
    }


    private static boolean evaluateCorrectRange(double x, double y) {
        if (x > 1.0 || y > 1.0) return false;
        else return true;
    }
}