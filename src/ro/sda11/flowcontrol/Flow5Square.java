package ro.sda11.flowcontrol;

import java.util.Scanner;

public class Flow5Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti dimensiunea patratului: ");
        int n = input.nextInt();

        int l;
        int c;

        for (l=0; l<=n; l++){
            for (c=0;c<=n;c++){
                if (c==0 || c==n){
                    System.out.print("#");
                }else if (l==0 || l==n){
                    System.out.print("#");
                }else if (l==c){
                    System.out.print("#");
                } else if (l+c==n){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
