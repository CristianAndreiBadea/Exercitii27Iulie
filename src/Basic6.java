import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Basic6 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner( System.in);

        float a;
        byte b;
        char c;
        int d;

        System.out.print("Introduceti o valoare float: "  );



        a=scanner.nextFloat();
        System.out.println( a );

        b=scanner.nextByte();
        System.out.println( b);

        c=scanner.next().charAt(0);
        System.out.println(c);

        d=scanner.nextInt();
        System.out.println((char)d);
        c=65;



    }
}
