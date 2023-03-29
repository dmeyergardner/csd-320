/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Write a program with four methods for calculating the cost of a yearly auto service visit.
 * The methods will be titled yearlyService.
 * yearlyService(no parameters) - Will return the standard service charge.
 * yearlyService(one parameter) - Will return the standard service charge with an added oil change fee.
 * yearlyService(two parameters) - Will return the standard service charge with an added oil change fee and a tire rotation charge.
 * yearlyService(three parameters) - Will return the standard service charge with an added oil change fee, a tire rotation charge, along with a coupon amount that will be deducted from the total cost.
 * Write a main method that will test each of these methods two times.
 *
 * @author deborahmeyer-gardner1
 */
public class AutoShop {

    public static void main(String[] args) {
        double discount, tireRotation, oilChange, total;

        //variable declaration  
        //serviceCharge=150;
        tireRotation = 30;

        oilChange = 75;

        discount = 0.15;  // 15 mean 15% 

        total = 0;

        // run your tests, are the values printing correctly, print outputs
        for (int i = 0; i <= 1; i++) {
            System.out.println("Running Test number " + i);
            
            // this loop will output all methods twice
            for (int j = 0; j <= 3; j++) {
                if (j == 0) {
                    total = AutoShop.yearlyService();
                }
                if (j == 1) {
                    total = AutoShop.yearlyService(oilChange);
                }
                if (j == 2) {
                    total = AutoShop.yearlyService(oilChange, tireRotation);
                }
                if (j == 3) {
                    total = AutoShop.yearlyService(oilChange, tireRotation, discount);
                }
                System.out.println("Total is:  " + total);
            }
        }
    }

    // generate maths for output
    public static double yearlyService() {
        return 150.0;
    }

    public static double yearlyService(double oil) {
        return 150.0 + oil;
    }

    public static double yearlyService(double oil, double tire) {
        return 150.0 + oil + tire;
    }

    public static double yearlyService(double oil, double tire, double coupon) {
        return (150.0 + oil + tire) * (1 - coupon);
    }
}
