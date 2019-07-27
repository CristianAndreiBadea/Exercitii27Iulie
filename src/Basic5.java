public class Basic5 {

    public static void main(String[] args) {
        int b = Integer.MAX_VALUE;
        int a = Integer.MAX_VALUE;

        System.out.println(" numarul a este " + a);
        System.out.println(" numarul a este " + b);
        System.out.print("      suma este ");
        System.out.print((long)a+ (long)b);
        System.out.println();

        System.out.println("------------");
        int x=Integer.MAX_VALUE;
        int y= Integer.MIN_VALUE;
        System.out.println(x+y);

        System.out.println();

        System.out.println("------------");

        Integer t=3;
        Integer u=new Integer(5);
        String str="123";

        int suma;
        suma=t+u+Integer.parseInt(str);

        System.out.println(suma);
        System.out.println(Integer.parseInt(str));

        char c;
        c=str.charAt(0);
        System.out.println();
        System.out.println("------------");
        System.out.println((int)c);



    }
}
