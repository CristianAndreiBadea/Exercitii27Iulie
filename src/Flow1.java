import java.util.Scanner;

public class Flow1 {
    //Write an application that will show if entered value is greater, equal or lower than 30.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int a = input.nextInt();

        if (a > 30) {
            System.out.println("a is greater than 30");
        } else if (a == 30) {
            System.out.println("a equals 30");
        } else {
            System.out.println("a is lower than 30");
        }
    }

}
