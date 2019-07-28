package ro.sda11.flowcontrol;

import java.util.Scanner;

public class Flow6Tree
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("cat de mare este bradul?");
        int inaltime = in.nextInt();
        System.out.println("care este raza bradului?");
        int raza = in.nextInt();
        int i,j,z;
        for(z=0;z<inaltime;z++)
        {
            for(i=0;i<raza;i++)
            {
                for(j=0;j<(raza*2-1);j++)
                {
                    if(j>=((raza*2-1)/2-i) && j<=((raza*2-1)/2+i)) System.out.print("*");
                    else System.out.print("-");
                }
                System.out.println();
            }
        }
        for (i=0;i<inaltime;i++)
        {
            for(j=0;j<(raza*2-1);j++)
            {
                if(j>=(raza*2-1)/2-1 && j<=(raza*2-1)/2+1 ) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
