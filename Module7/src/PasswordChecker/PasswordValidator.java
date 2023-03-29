/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *
 * Some Websites impose certain rules for passwords. Write a method that checks whether a user's input String is a valid password. Suppose the password rules are as follows:
 * A password must have at least eight characters.
 * A password must contain both letters and digits.
 * A password must contain at least one uppercase character.
 * A password must contain at least one lowercase character.
 */
package PasswordChecker;

/**
 *
 * @author deborahmeyer-gardner1 & CodesCracker
 */

import java.util.Scanner;

public class PasswordValidator
{

    /**
     *
     * @param args contains the supplied command-line arguments as an array of String objects
     */
    public static void main (String[] args)
   {
       // Below is the password criteria
      int passwordLength=8, /* password minimum length */ upChars=0, /* must contain one upper case */ lowChars=0 /* must contain one lower case */;
      int special=0, /* must contain one special character */ digits=0 /* must contain one number */;
      char ch;
      Scanner s = new Scanner(System.in);
      
      // user display instructions
      
      System.out.println("----Create a Password Using the Following Parameters----");
      System.out.println("1. The Password must be at least 8 characters long.");
      System.out.println("2. The Password must contain at least one uppercase character.");
      System.out.println("3. The Password must contain at least one lowercase character.");
      System.out.println("4. The Password must contain at least one digit (0-9).");
      System.out.println("5. The Password must contain at least one special characters.");
      System.out.println("6. The Password must not contain < or >.");
      
      System.out.print("\nCreate a Password: ");
      String password = s.nextLine();
      
      // calculate the length of the password entered
      int total = password.length();
      if(total<passwordLength)
      {
         System.out.println("\nThe Password's Length has to be of 8 characters or more.");
         return;
      }
      else
      {
         for(int i=0; i<total; i++)
         {
            ch = password.charAt(i);
            
            // see if the password entered has an upper case letter
            if(Character.isUpperCase(ch))
               upChars++;
            
            // see if the password has a lower case letter
            else if(Character.isLowerCase(ch))
               lowChars++;
            
            // see if the password has a nummber
            else if(Character.isDigit(ch))
               digits++;
            else
            {
                // see if the password has invaild characters
               if(ch=='<' || ch=='>')
               {
                  System.out.println("\nThe Password is Invalid!");
                  return;
               }
               // see if the password contains spproved special characters
               else
                  special++;
            }
         }
      }
      
      // Now let us calculate a score for the user so they can see how strong the password they've created is
      if(upChars!=0 && lowChars!=0 && digits!=0 && special!=0)
      {
         if(total>=15)
         {
            System.out.println("\nThe Strength of Password is Strong.");
         }
         else
         {
            System.out.println("\nThe Strength of Password is Medium.");
         }
         System.out.println("\n----Password Scorecard----");
         System.out.println("UpperCase Character: " +upChars);
         System.out.println("LowerCase Character: " +lowChars);
         System.out.println("Digit: " +digits);
         System.out.println("Special Character: " +special);
      }
      
      // if the password is missing another piece of criteria, then we need to inform the user
      else
      {
         if(upChars==0)
            System.out.println("\nThe Password must contain at least one uppercase character.");
         if(lowChars==0)
            System.out.println("\nThe Password must contain at least one lowercase character.");
         if(digits==0)
            System.out.println("\nThe Password must contain at least one digit.");
         if(special==0)
            System.out.println("\nThe Password must contain at least one special character.");
      }
   }
}