/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Arrays;
import java.util.Random;
/**
 * Write a program that reads and fills an array with 20 integers. 
 * Then, using the array elements, calculate the data to find and display:
 * The highest value entered.
 * The lowest value entered.
 * The average of the numbers entered.
 * The sum of the numbers entered.
 * Display this information in a readable display making the data easy to understand.
 * @author deborahmeyer-gardner1
 */
public class FillArrayExample {
public static void main ( String [ ] args )
{
int [ ] rArr = new int [ 6 ] ;
Random rClass = new Random ( ) ;
rArr = rClass . ints ( ) . limit ( rArr . length ) . toArray ( ) ;
System . out . println ( "Randomly filled array elements are:" ) ;
for ( int i = 0 ; i < rArr . length ; i ++ )
{
System . out . print ( rArr [ i ] + " " ) ;
}
}
}
