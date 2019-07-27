import java.util.Scanner;
public class Flow5 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti numarul dorit: ");
        int n = input.nextInt();

        for(int i=n; i>=0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
