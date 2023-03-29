/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package module5;

/**
 * Write a program that uses a while loop to display the following math operations both in the 
 * smaller to larger order and then the larger to smaller order with the denominator 
 * being 3 through 99.  Ensure your application displays the mathematical results.
 * 1/3.0 + 1/5.0 + 1/7.0 + ··· + 1/95.0 + 1/97.0 + 1/99.0
 * 1/99.0 + 1/97.0 + 1/95.0 + ··· + 1/7.0 + 1/5.0 + 1/3.0
 * 
 * @author deborahmeyer-gardner1 and Keegan Jones
 */
public class Module5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
       int i = 3;
       double sum = 0;
        
       
       
            while (i < 98 && i > 0) {

            sum = sum + 1.0/i;
                System.out.print("1/" + i + " +");
                            i = i + 2;
               
       }
        System.out.println("= " + sum + "\n\n");
        i = 101;
      
   
       {
        while (i < 102 && i > 4) {
            i = i - 2;
            sum = sum + 1.0/i;
                System.out.print("1/" + i + " +");
        }
       } 
         System.out.println("= " + sum);   
        
        }  
        
    }
    
}


