/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class FractionLoop {
    
/**
 * Write a program that uses a while loop to display the following math operations both in the 
 * smaller to larger order and then the larger to smaller order with the denominator 
 * being 3 through 99.Ensure your application displays the mathematical results.  
 * 1/3.0 + 1/5.0 + 1/7.0 + ··· + 1/95.0 + 1/97.0 + 1/99.0
 * 1/99.0 + 1/97.0 + 1/95.0 + ··· + 1/7.0 + 1/5.0 + 1/3.0
 * 
 * @author deborahmeyer-gardner1 and Keegan Jones
     * @param args the command line arguments
 */

    //@param args the command line arguments
    
    public static void main(String[] args) {
        // TODO code application logic here
    
       int i = (int) 3.0;
       double sum = 0;
       while (i <= 98.0 && i > 0) {
       // cutting an "or equal to" to ensure that my integers don't count any higher than needed causing an infinite loop
            
            sum = sum + 1.0/i;
                System.out.print("1/" + i + " + ");
                // this will output all 1/integer with an addition sign
                     i = i + 2;
       }
       // end the first while
       
       sum = sum + 1.0/i;
        //everything else was added together, don't forget to add the starting enttry '1/3'

        System.out.println("1/" + i + " = " + sum + "\n\n"); {
        // display results of "1/i + 1/i++' and sum of all
       
       sum = 0;
       // reset sum
       
        // int i = (int) 3.0; still applies so we have to start at 102 and work down
        while (i < 102.0 && i > 4) {
            
            sum = sum + 1.0/i;
                System.out.print("1/" + i + " + ");
                // this will output all 1/integer with an addition sign
                i = i - 2;
            }
            // end the second while
        } 
                   sum = sum + 1.0/i;
                //everything else was added together, don't forget to add the starting enttry '1/99'
 
         System.out.println("1/" + i + " = " + sum + "\n\n");   
    }        
}


