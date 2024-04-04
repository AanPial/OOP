package Gemini;

public class Ractangle {
    double width;
    double height;
    public Ractangle()
    {
        width=4.0;
        height=3.0;
    }
    public Ractangle(double width,double height)
    {
        this.width=width;
        this.height=height;
    }
    public Ractangle(double width)
    {
        this.width=width;
    }
    public double getArea()
    {
        double area;
        area=height*width;
        return area;
    }

    public static void main(String[]args)
    {
        Ractangle p=new Ractangle(5.0);
        Ractangle q=new Ractangle(2.0,3.0);

        System.out.println("Ractangle-1 : "+p.getArea());
        System.out.println("Ractangle-2 : "+q.getArea());

    }
}
