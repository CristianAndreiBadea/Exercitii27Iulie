package ro.sda11.flowcontrol;

import java.util.Random;

public class Flow9 {
    public static void main(String[] args) {
        //Write an application that will find biggest value within array of int variables.
        //a. check your application using randomly generated array (use Random class),
        //b. check your application at least 5 times in a loop (generate random array -> print

        int[] randomInts = new int[10];
        Random rnd = new Random();

        int nrRepetitii = 5;
        while (nrRepetitii >= 1) {

            System.out.println("Testul cu numarul " + nrRepetitii);
            for (int i = 0; i < randomInts.length; i++) {
                randomInts[i] = rnd.nextInt(100);
                System.out.println(randomInts[i]);

            }

            int max = MaximumValue(randomInts);
            nrRepetitii--;
            System.out.println("Maximul este : " + max);
        }
        int m = Integer.MIN_VALUE;
        for (int j = 0; j < randomInts.length; j++) {
            if (randomInts[j] > m) {
                m = randomInts[j];
            }
        }


//        int[] randomInts2 = new int[10];
//        for (int i = 0; i < randomInts.length; i++) {
//            randomInts2[i] = rnd.nextInt(100);
//            System.out.println(randomInts2[i]);
//
//        }
//        int m2 = MaximumValue(randomInts2);

    }


    public static int MaximumValue(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < a.length; j++) {
            if (a[j] > max) {
                max = a[j];
            }
        }
        return max;
    }
}
