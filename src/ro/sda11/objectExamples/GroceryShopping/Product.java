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

public class Product {
    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public Product (){}
    public Product (String name, double price){
        this.name=name;
        this.price=price;
    }

}
