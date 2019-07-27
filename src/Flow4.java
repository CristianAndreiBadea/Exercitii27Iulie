import java.util.Scanner;

public class Flow4 {
    public static void main(String[] args) {
        //Write an application that for any entered number between 0 and 9 will provide it’s name. For example for “3” program should print “three”.

        Scanner in = new Scanner(System.in);

        int a;


        boolean sfarsit = false;

        while (!sfarsit) {
            System.out.print("Introduce valoarea lui a: ");
            a = in.nextInt();

            switch (a) {
                case 0: {
                    System.out.println("zero");
                    break;
                }
                case 1: {
                    System.out.println("unu");
                    break;
                }
                case 2: {
                    System.out.println("doi");
                    break;
                }
                case 3: {
                    System.out.println("trei");
                    break;
                }
                case 4: {
                    System.out.println("patru");
                    break;
                }
                case 5: {
                    System.out.println("cinci");
                    break;
                }
                case 6: {
                    System.out.println("sase");
                    break;
                }
                case 7: {
                    System.out.println("sapte");
                    break;
                }
                case 8: {
                    System.out.println("opt");
                    break;
                }
                case 9: {
                    System.out.println("noua");
                    break;
                }
                default: {
                    System.out.println("nu a fost gasit numarul");
                    sfarsit = true;

                }
            }
        }
    }
}