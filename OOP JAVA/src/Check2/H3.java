package Check2;

import java.util.Scanner;
public class H3
{
    public static void main(String [] args)
    {
        Scanner p=new Scanner(System.in);
        int x=p.nextInt();
        double y=p.nextDouble();
        p.nextLine();
        String z=p.nextLine();

        System.out.println("String: "+z);
        System.out.println("Double: "+y);
        System.out.println("Int: "+x);
    }
}