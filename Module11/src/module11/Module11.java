/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package module11;

import java.util.Arrays;

/**
 * Write methods using the following headers that returns the location of the
 * largest element in the array passed to the method returning a one-dimensional
 * array that contains two location elements.
 *
 * -- public static int [] locateLargest (double [][] arrayParam)
 * -- public static int [] locateLargest (int [][] arrayParam)
 *
 * Then, write methods using the following headers that returns the location of
 * the smallest element in the array passed to the method returning a
 * one-dimensional array that contains two location elements.
 *
 * -- public static int [] locateSmallest (double [][] arrayParam)
 * -- public static int [] locateSmallest (int [][] arrayParam)
 *
 * @author deborahmeyer-gardner1
 */

public class Module11 {

    /**
     * Main method constructing the arrays and the print outs
     * @param args
     */
    public static void main(String[] args) {

        // fixed hight and width of the array
       double[][] doubleArray = new double[4][4];
       int [][] intArray = new int [4][4];

       //random values for the DOUBLE array
        for (double[] doubleArray1 : doubleArray) {
            for (int column = 0; column < doubleArray1.length; column++) {
                doubleArray1[column] = (int)(Math.random() * 100);
            }
        }

        //random values for the INT array
        for (int[] intArray1 : intArray) {
            for (int column = 0; column < intArray1.length; column++) {
                intArray1[column] = (int)(Math.random() * 100);
            }
        }
        /* DOUBLE ARRAY */

        // Get the location of the largest element for the DOUBLE array
        int[] largelocation = locateLargest(doubleArray);
        int[] smalllocation = locateSmallest(doubleArray);

        System.out.println("--- DOUBLE ARRAY ---");

        // print out the entirity of the DOUBLE Array
        for (double[] doubleArray1 : doubleArray) {
            for (int column = 0; column < doubleArray1.length; column++) {
                System.out.print(doubleArray1[column] + " ");
            }
            System.out.println();
        }
        // System.out.println("Array of DOUBLE numbers = " + Arrays.toString(doubleArray)); // List the array
        System.out.println("The location of the largest element is at ("+ largelocation[0] + ", " + largelocation[1] + ")");
        System.out.println("The location of the smalest element is at ("+ smalllocation[0] + ", " + smalllocation[1] + ")");
        System.out.println("");

         /* INT ARRAY */

        // Get the location of the largest element for the INT array
        largelocation = locateLargest(intArray);
        smalllocation = locateSmallest(intArray);

       System.out.println("--- INT ARRAY ---");

       // print out the entirity of the INT Array
       for (int[] intArray1 : intArray) {
            for (int column = 0; column < intArray1.length; column++) {
                System.out.print(intArray1[column] + " ");
            }
            System.out.println();
        }

        System.out.println("The location of the largest element is at ("+ largelocation[0] + ", " + largelocation[1] + ")");
        System.out.println("The location of the smalest element is at ("+ smalllocation[0] + ", " + smalllocation[1] + ")");

    }

    /**
     * locateLargest DOUBLE returns the location of the largest element in a two-dimensional array
     * @param arrayParam
     * @return l
     */
    public static int [] locateLargest (double [][] arrayParam) {
        int[] l = new int[2];
        l[0] = 0;
        l[1] = 0;
        double max = 0;
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    l[0] = i;
                    l[1] = j;
                    max = arrayParam[i][j];
                }
            }
        }
        return l;
    }

    /* LOCATION OF THE ELEMENTS IN THE ARRAYS */

    /**
     * locateLargest INT returns the location of the largest element in a two-dimensional array
     * @param arrayParam
     * @return l
     */
    public static int [] locateLargest (int [][] arrayParam) {
        int[] l = new int[2];
        l[0] = 0;
        l[1] = 0;
        double max = 0;
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam.length; j++) {
                if (arrayParam[i][j] > max) {
                    l[0] = i;
                    l[1] = j;
                    max = arrayParam[i][j];
                }
            }
        }
        return l;
    }
    /**
     * locateSmallest DOUBLE returns the location of the smallest element in a two-dimensional array
     * @param arrayParam
     * @return l
     */
    public static int [] locateSmallest (double [][] arrayParam) {
        int[] l = new int[2];
        l[0] = 0;
        l[1] = 0;
        double min = 999;
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    l[0] = i;
                    l[1] = j;
                    min = arrayParam[i][j];
                }
            }
        }
        return l;
    }
     /**
     * locateSmallest INT returns the location of the smallest element in a two-dimensional array
     * @param arrayParam
     * @return l
     */
    public static int [] locateSmallest (int [][] arrayParam) {
        int[] l = new int[2];
        l[0] = 0;
        l[1] = 0;
        double min = 999;
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    l[0] = i;
                    l[1] = j;
                    min = arrayParam[i][j];
                }
            }
        }
        return l;
    }
}
