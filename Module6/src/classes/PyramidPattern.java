/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 * Write a program that uses nested for loops to output the following with the shown display format:
                                   1               @
                                 1 2 1             @
                               1 2 4 2 1           @
                             1 2 4 8 4 2 1         @
                          1 2 4 8 16 8 4 2 1       @
                       1 2 4 8 16 32 16 8 4 2 1    @
                    1 2 4 8 16 32 64 32 16 8 4 2 1 @
 *
 * @author deborahmeyer-gardner1
 */
 
   
public class PyramidPattern  
{  
    /* Driver Code */  
    public static void main(String ar[])  
    {  
        int nrows = 6;  
   
        /* Code for displaying the pyramid */  
   
        for (int i = 0; i <= nrows; i++)  
        {  
            /* Print i empty spaces at the beginning of each row */  
            
   
            for (int j = (nrows - i)*2; j > 0; j--)  
            {  
                  System.out.print(" "); 
                
            }  
   
            /* Print 'k' value at the end of each row */  
   
            for (int k = 0; k <= i ; k++)  
            {  
                System.out.print((int)Math.pow(2,k) + " ");  
            }  
            
            for (int k = i-1; k >= 0 ; k--)  
            {  
                System.out.print((int)Math.pow(2,k) + " ");  
            }
   
          //  System.out.print(i); 
            System.out.println();  
   
            /* Increment the rowCount */  
           }  
    }  
}  
