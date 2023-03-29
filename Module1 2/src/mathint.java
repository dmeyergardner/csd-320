/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Deborah Meyer-Gardner, 2022Sep04, Module 1 Assignment
 * @purpose Write a program that displays the results of the below mathematical computations and compare the integer formats input and output. 
 */
public class mathint {
 
    public static void main(String[] arg) {
// This computation uses a decimal on all integers inside the parens
        System.out.println(4 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 ));
 // This computation uses no decimal to frame the integers in the parens
        System.out.println(4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 ));
    }
}    
/* The first line using a double type integer is more accuracte for mathematical calculations. Otherwise you can risk a rounding error such as on the second line.
* 
*All values in an mixed arithmetic operations (+, −, *, /, %) are converted to double type before the arithmetic operation in performed.
* @http://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/04/mixed.html
* 
* The precision of a floating point value indicates how many digits the value can have after the decimal point. The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits. Therefore it is safer to use double for most calculations.
* @https://www.w3schools.com/java/java_data_types_numbers.asp
*/