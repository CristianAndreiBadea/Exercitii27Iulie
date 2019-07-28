package ro.sda11.flowcontrol;

import java.util.Scanner;

// Write a “divide by” application.
// User should be able to enter initial value that will be divided
// in a loop by a new value entered by a user. Division should occur as long,
// as entered value will be different than 0. Result of division should be rounded
// to the fourth decimal point and printed to the console.

public class FLOW7 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner input=new Scanner(System.in);
        System.out.print("Introduceti a: ");
        a=input.nextDouble();
        System.out.print("Introduceti b: ");
        b=input.nextDouble();
//        c=a/b;
//        System.out.printf("Rezultatul este: %.4f \n" , c);
        while (b!=0) {
            c=a/b;
            System.out.printf("Rezultatul este: %.4f \n" , c);
            System.out.print("Introduceti b: ");
            b=input.nextDouble();
            if(b==0){
                System.out.println("Can not divide to 0");

            }
        }
    }
}
