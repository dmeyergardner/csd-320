
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Write a program that prompts a user to enter two strings and then checks the strings entered and 
 * reports if either the first string is a sub-string of the second string, or if the second string 
 * is a sub-string of the first string.
 * @author deborahmeyer-gardner1
 */
public class Assignment4 {

  // Driver code and ability to grab user input
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
 
        // Get the user's first input
        System.out.println("Enter the first string: ");
        String localstring01 = input.nextLine();

        System.out.println("Your first string is : " + localstring01);
 
        // Get the user's second input
        System.out.println("Enter the second string: ");
        String localstring02 = input.nextLine();
        
        System.out.println("Your second string is :" + localstring02);
 
    // Check the string or sub-string status of the entered value
        
        // String 1 is sub to string 2    
        if (localstring01.contains(localstring02)) {
            System.out.println("The first entry is sub-string of the second entry");
        }
        // String 2 is sub to string 1
        else if (localstring02.contains(localstring01)) {
            System.out.println("The second entry is sub-string of the first entry");
        }
            //These strings are independent
        else {
             System.out.println("None of these strings are related to each other via sub");
        }
    }
}
