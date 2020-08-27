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

//    boolean[][] booleans = getBooleans();
//
//    printBooleanArray(booleans);

// 1.1.13 Write a code fragment to print the transposition (rows and columns changed)
    // of a two-dimensional array with M rows and N columns.

//    printRandomTransposeMatrix(3, 4);

    // 1.1.14 Write a static method lg() that takes an int value N as argument and returns the
    // largest int not larger than the base-2 logarithm of N. Do not use Math

//    System.out.println(lg(3243));

    // 1.1.15 Write a static method histogram() that takes an array a[]
    // of int values and an integer M as arguments and returns an array of
    // length M whose ith entry is the number of times the integer i
    // appeared in the argument array. If the values in a[] are all
    // between 0 and M - 1, the sum of the values in the returned array should
    // be equal to a.length

//    int[] test = getRandomIntArray(10000000);
//    printArray(test);
//    StdOut.println();
//    printArray(histogram(test, 10));

  }

  //TODO hacer esta clase una libreria
  public static int[] histogram(int[] a, int M) {
    int[] b = new int[M];
    for (int k : a) {
      for (int j = 0; j < b.length; j++) {
        int count = 0;
        if (k == j) {
          count++;
        }
        b[j] += count;
      }
    }
    return b;
  }

  public static <T> void printArray(T[] a) {
    for (T i :
        a) {
      System.out.print(i + " ");
    }
  }

  public static int[] getRandomIntArray(int M) {
    int[] random = new int[M];
    for (int i = 0; i < random.length; i++) {
      random[i] = StdRandom.uniform(0, 10);
    }
    return random;
  }

  public static int lg(int N) {
    int result = 1;
    int count = 0;
    while (result < N) {
      result *= 2;
      if (result < N) {
        count++;
      }
    }
    return count;

  }

  public static void printRandomTransposeMatrix(int m, int n) {
    int[][] matrix = getMNMatrix(m, n);
    StdOut.println("MATRIZ ORIGINAL");
    printTwoDimArray(matrix);
    int[][] transpose = getTranspose(matrix);
    StdOut.println("MATRIZ TRANSPUESTA");
    printTwoDimArray(transpose);
  }

  public static void printTwoDimArray(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        StdOut.print(matrix[i][j] + " ");
      }
      StdOut.println();
    }
  }

  public static int[][] getTranspose(int[][] matrix) {
    int[][] transpose = new int[matrix[0].length][matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        transpose[j][i] = matrix[i][j];
      }
    }
    return transpose;
  }

  public static int[][] getMNMatrix(int m, int n) {
    int[][] matrix = new int[m][n];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = StdRandom.uniform(1, 10);
      }
    }

    return matrix;
  }

  public static boolean[][] getBooleans() {
    boolean[][] booleans = new boolean[StdRandom.uniform(1, 10)][StdRandom.uniform(25, 50)];

    StdOut.println("La matriz generada es de: [" + booleans.length + "][" + booleans[0].length
        + "] elementos");
    for (int i = 0; i < booleans.length; i++) {
      for (int j = 0; j < booleans[i].length; j++) {
        booleans[i][j] = randomBoolean();
      }
    }
    return booleans;
  }

  public static boolean randomBoolean() {
    Random r = new Random();
    return r.nextBoolean();
  }

  public static void printBooleanArray(boolean[][] booleans) {
    StdOut.print("X ");
    for (int i = 0; i < booleans[0].length; i++) {
      StdOut.print(i + 1);
    }
    StdOut.println();

    for (int i = 0; i < booleans.length; i++) {
      StdOut.print(i + 1 + " ");
      for (int j = 0; j < booleans[i].length; j++) {
        if (booleans[i][j]) {
          StdOut.print(" ");
        } else {
          StdOut.print("*");
        }
      }
      StdOut.println();
    }


  }

  public static void integerToBinary(int integer) {
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

  public static void getSum() {
    int sum = 0;
    for (int i = 1; i < 1000; i *= 2) {
      for (int j = 0; j < 1000; j++) {
        sum++;
      }
    }

    StdOut.println(sum);
  }

  public static void addFirst1000Numbers() {
    int sum = 0;
    for (int i = 0; i < 1000; i++) {
      for (int j = 0; j < i; j++) {
        sum++;
      }
    }

    StdOut.println(sum);
  }

  public static void whileMinusValue() {
    double t = 9.0;
    while (Math.abs(t - 9.0 / t) > .001) {
      t = (9.0 / t + t) / 2.0;
    }
    StdOut.printf("%.5f\n", t);
  }

  public static void fibonacci() {
    int f = 0;
    int g = 1;
    for (int i = 0; i < 15; i++) {
      StdOut.println(f);
      f = f + g;
      g = f - g;
    }
  }

  public static void printEqualNotEqual(String[] args) {
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

  public static boolean evaluateCorrectRange(double x, double y) {
    if (x > 1.0 || y > 1.0) {
      return false;
    } else {
      return true;
    }
  }
}