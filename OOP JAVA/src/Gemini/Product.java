package Gemini;

public class Product {
    public String product;
    public double price;
    public int quantiy;

    public Product(String product,double price,int quantiy){
        this.product=product;
        this.price=price;
        this.quantiy=quantiy;
    }
    public double total(){
        double t=price*quantiy;
        return t;
    }
}
class t{
    public static void main(String[]args){
        Product p=new Product("Shaban",50,3);
        System.out.println("Total Price = "+p.total());
    }
}
