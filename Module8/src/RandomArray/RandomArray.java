/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RandomArray;

import java.util.Random;
import java.util.Arrays;
/**
 * Write a program that reads and fills an array with 20 integers. 
 * Then, using the array elements, calculate the data to find and display:
 * The highest value entered.
 * The lowest value entered.
 * The average of the numbers entered.
 * The sum of the numbers entered.
 * Display this information in a readable display making the data easy to understand
 * @author deborahmeyer-gardner1
 */
public class RandomArray {
   public static void main(String args[]) {
       
        int count = 20; // Hard count, change this number if you want to change the parameters on how many integers are displayed
        byte [] arr = new byte [count]; // Declare quantity of integers to work with and how they are output
        int min = Integer.MAX_VALUE; // Declare mimimum value
        int max = Integer.MIN_VALUE; // Decalre maximum value
        int sum = 0;
        
        
        for (int i = 0; i < count; i++) { // Grab a random integer "count" times
            Random randNum = new Random(); // I need the integers to be random
            arr[i] = (byte) randNum.nextInt(); // output in a line array
        }
        
        for (int i = 0; i < arr.length; i++) {
             if (arr[i] >= max)
                max = arr[i];  // Find the maximum in the array above
             if (arr[i] <= min)
                min = arr[i];  // Find the minimum in the array above
             sum = sum+arr[i]; // Find the sum total of the array integers in the array above
        }
        double avg = sum/(double)count; // Find the average of the integers in the array above
        
        // Print out the all statements or outputs
        System.out.println(Integer.MAX_VALUE);
        System.out.println("Random numbers = "+Arrays.toString(arr));
        System.out.println("Largest in given array is " +max);
        System.out.println("Smallest in given array is " +min);
        System.out.println("Average in given array is " +avg);
        System.out.println("Sum of the array is " +sum);
   }
}