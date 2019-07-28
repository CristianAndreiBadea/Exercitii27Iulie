package ro.sda11.flowcontrol;

import java.util.Scanner;

public class FLOW8 {
    public static void main(String[] args) {
        /*
        Write a simple “echo” application, that will: a. print back entered string,
        b. go to the beginning of a loop if user will enter “continue”,
        c. break the loop with a “good bye!” message, if user will enter “quit”.*/
        String str;
        Scanner input=new Scanner(System.in);
        str=input.nextLine();
        System.out.println(str);
        while (!str.equals("quit")) {
            str=input.nextLine();
            if (str.equals("continue")){
                continue;
            }
            if(str.equals("quit")){
                System.out.println("good bye");
            }else{
                System.out.println(str);
            }
        }

    }
}
