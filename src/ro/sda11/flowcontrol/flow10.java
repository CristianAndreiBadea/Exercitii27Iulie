package ro.sda11.flowcontrol;

import java.util.Random;

public class flow10 {

    public static void main(String[] args) {

        String[] arr = new String[5];

        Random r = new Random();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            int lungime = r.nextInt(10)+1; //=> genereaza un nr aleator intre 1 si 11
            arr[i] = cuvantaleator(lungime);
            System.out.print(arr[i] + " || ");
            if (arr[i].length() > max) {
                max = arr[i].length();
            }
        }
        System.out.println();
        System.out.println("Max length: " + max);
    }

    public static String cuvantaleator(int x) {
        Random r2 = new Random();
        char[] c = new char[x];
        for (int i = 0; i < c.length; i++) {
            c[i] = (char) (r2.nextInt(25) + 65); //genereaza nr aleator intre 65-90. tabela UTF: "A" are index 65
        }

        String s = new String(c); //transforma arrayul de caractere in string
        return s;

    }
}
