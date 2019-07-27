
public class Casting {
    public static void main(String[]args){

//Exemplul 4: Enter two values of type int. Display their division
// casted to the double type and rounded to the third decimal point.

        int t= 20;
        int y= 7;

        double u=(double)t/y;
        System.out.printf("%.3f",u);
        System.out.println();
        System.out.printf("%.3f",Math.ceil(u));
    }
}
