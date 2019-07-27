import java.util.Scanner;
//As above but compare two values at the same time.
// Verify if first value is greater than 30 and second value is greater than 30, and so on.
public class Flow2
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a= ");
        int a = in.nextInt();
        System.out.print("b= ");
        int b = in.nextInt();

        if (a>30 && b>30) System.out.println("numerele sunt mai mari decat 30");
        else if(a<30 && b<30) System.out.println("numerele sunt mai mici decat 30");
        else if(a>30 && b<30) System.out.println("a >30 , b<30");
        else if(a<30 && b>30) System.out.println("a<30 , b>30");
        else if (a==30 && b==30) System.out.println(" ambele numere sunt egale cu 30");
        else if (a>30 && b==30) System.out.println("a>30 , b=30");
        else if (a<30 && b==30) System.out.println("a<30 , b=30");
        else if(a==30 && b<30) System.out.println("a=30 , b<30");
        else if (a==30 && b>30) System.out.println("a=30 , b>30");

        boolean ab;

        ab=a<30 && b>30;

        if(ab){
            System.out.println("a<30 si b>30");
        }

    }
}
