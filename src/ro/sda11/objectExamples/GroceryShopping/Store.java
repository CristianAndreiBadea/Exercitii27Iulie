package ro.sda11.objectExamples.GroceryShopping;
/*Grocery Shopping
        Create class Product, it should contain at least two fields – name and price.
        Create an empty array of Products – it’s size should be at least 5.
        Fill it within while loop. Simulate the process of doing shopping:
        ask for a product,
        add it to the cart (array),
        change index,
        if index will be greater than 5 – finish shopping,
        5. *pay for the products. Station*/

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Product[] produseMagazin = new Product[10];
        Product[] cosDeCumparaturi = new Product[5];
        int numarDeProduseMagazin=0;
        int numarProduseCos=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti cate produse doriti in magazin:");
        numarDeProduseMagazin=scan.nextInt();

        for(int i=0; i<numarDeProduseMagazin; i++){
            Product p=new Product();
            System.out.println("Introdu produsul: ");
            scan.nextLine();
            p.setName(scan.nextLine());
            System.out.println("Introdu pretul produsului adaugat: ");
            p.setPrice(scan.nextDouble());
            produseMagazin[i]=p;

        }
        for (int i=0; i<numarDeProduseMagazin; i++){
            System.out.println(i+1+". Produsul: "+produseMagazin[i].getName()+ " Pret: " +produseMagazin[i].getPrice()+ " lire");

        }
        int i=1;

        while(numarProduseCos<3){


            System.out.println("Introduceti ce produs doriti!!");
            System.out.print("Produsul nr."+i+" :");
            i++;
            int produs=scan.nextInt();
            cosDeCumparaturi[numarProduseCos]=produseMagazin[produs-1];
            numarProduseCos++;




        }
        System.out.println("Aveti in cos urmatoarele "+numarProduseCos+ " produse:");

        for(int j=0; j<numarProduseCos;j++){

            System.out.println(j+1+". "+cosDeCumparaturi[j].getName() + " "+cosDeCumparaturi[j].getPrice()+ " lire");

        }
        double sum=0;
        for(int j=0;j<numarProduseCos;j++)
        {sum+=cosDeCumparaturi[j].getPrice();



        }
        System.out.println("Aveti de plata: "+sum+" lire!\n"+ "Aici sau la pachet?");

    }
}
