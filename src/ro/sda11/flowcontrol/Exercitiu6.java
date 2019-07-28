package ro.sda11.flowcontrol;

import java.util.Scanner;

public class Exercitiu6 {

    public static void main(String[] args) {

        //If you would like to buy a bottle of milk –
        // cashier will ask you for a specific amount of money.
        // You have to enter that value and verify if it is same as the cashier asked.
        //If you would like to buy a bottle of wine –
        // cashier will ask you if you are an adult and for positive answer ask for a specific amount of money.


        Scanner input=new Scanner(System.in);
        int pretLapte = 6;

        String produs;

        int pretVin =25;
        int plata;

        System.out.println("Ce produs doriti?");

        produs= input.nextLine();

        if (produs.equalsIgnoreCase("Lapte")){
            System.out.println("Trebuie sa platiti "+pretLapte+" lei");
            plata=input.nextInt();
            if (plata==pretLapte){
                System.out.println("Multumim!");
            }else{
                System.out.println("Pretul nu este corect.");
            }
        }
        if (produs.equalsIgnoreCase("Vin")){
            System.out.println("Trebuie sa platiti "+pretVin +" lei");
            plata=input.nextInt();
            if (plata==pretVin){
                System.out.println("Multumim!");
            }else{
                System.out.println("Pretul nu este corect.");
            }
        }
    }
}