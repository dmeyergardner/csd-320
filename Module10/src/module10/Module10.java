/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package module10;

import java.util.Arrays;

/**
 * Write four overloaded methods that return the average of an array with the
 * following headers: 
 * -- public static short average(short [] array) 
 * -- public static int average(int [] array) 
 * -- public static long average(long [] array) 
 * -- public static double average(double [] array) 
 * 
 * Write a test program that invokes each of these methods and then displays 
 * the average value returned along with a display of the original array 
 * elements. 
 * 
 * Ensure the display is easy to read and understandable. 
 * 
 * Lastly, each array sent into the methods must be of
 * different sizes to ensure the method code is correctly written.
 *
 * @author deborahmeyer-gardner1 & Arushi
 */
public class Module10 {

    public static void main(String args[]) {

        /* SHORT ARRAY */
        int count1 = 9; // Hard count, change this number if you want to change the parameters on how many integers are displayed
        short[] arr1 = new short[count1]; // Declare quantity of integers to work with and how they are output

        for (int i = 0; i < count1; i++) { // Grab a random integer "count" times
            arr1[i] = (short) ((Math.random() * (100)) + 1); // I need the integers to be random, output in a line array
        }

        System.out.println("--- SHORT ARRAY ---");
        System.out.println("Array of SHORT numbers = " + Arrays.toString(arr1)); // List the array
        System.out.println("Average in SHORT array is " + Module10.average(arr1)); // Find the average of the integers in the array above
        System.out.println("");

        /* INT ARRAY */
        int count2 = 7; // Hard count, change this number if you want to change the parameters on how many integers are displayed
        int[] arr2 = new int[count2]; // Declare quantity of integers to work with and how they are output

        for (int j = 0; j < count2; j++) { // Grab a random integer "count" times
            arr2[j] = (int) ((Math.random() * (300)) + 1); // I need the integers to be random, output in a line array
        }

        System.out.println("--- INT ARRAY ---");
        System.out.println("Array of INT numbers = " + Arrays.toString(arr2)); // List the array
        System.out.println("Average in INT array is " + Module10.average(arr2)); // Find the average of the integers in the array above
        System.out.println("");

        /* LONG ARRAY */
        int count3 = 5; // Hard count, change this number if you want to change the parameters on how many integers are displayed
        long[] arr3 = new long[count3]; // Declare quantity of integers to work with and how they are output

        for (int k = 0; k < count3; k++) { // Grab a random integer "count" times
            arr3[k] = (long) ((Math.random() * (300000)) + 1); // I need the integers to be random, output in a line array
        }

        System.out.println("--- LONG ARRAY ---");
        System.out.println("Array of LONG numbers = " + Arrays.toString(arr3)); // List the array
        System.out.println("Average in LONG array is " + Module10.average(arr3)); // Find the average of the integers in the array above
        System.out.println("");

        /* DOUBLE ARRAY */
        int count4 = 3; // Hard count, change this number if you want to change the parameters on how many integers are displayed
        double[] arr4 = new double[count4]; // Declare quantity of integers to work with and how they are output

        for (int l = 0; l < count4; l++) { // Grab a random integer "count" times
            arr4[l] = (double) ((Math.random() * (3000.0)) + 1.0); // I need the integers to be random, output in a line array
        }

        System.out.println("--- DOUBLE ARRAY ---");
        System.out.println("Array of DOUBLE numbers = " + Arrays.toString(arr4)); // List the array
        System.out.println("Average in DOUBLE array is " + Module10.average(arr4)); // Find the average of the integers in the array above

    }

    public static short average(short[] array) {
        short sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = (short) (sum + array[i]); // Find the sum total of the array integers in the array above
        }
        return (short) (sum / array.length); // Find the average of the array
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum = sum + array[j]; // Find the sum total of the array integers in the array above
        }
        return sum / array.length; // Find the average of the array
    }

    public static long average(long[] array) {
        double sum = 0;
        for (int k = 0; k < array.length; k++) {
            sum = sum + array[k]; // Find the sum total of the array integers in the array above
        }
        return (long) sum / array.length; // Find the average of the array
    }

    public static double average(double[] array) {
        double sum = 0;
        for (int l = 0; l < array.length; l++) {
            sum = sum + array[l]; // Find the sum total of the array integers in the array above
        }
        return sum / array.length; // Find the average of the array
    }
}
