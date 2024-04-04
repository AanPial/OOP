public class testGoat {
    public static void main(String[]args)
    {
        Goat []arr;
        arr=new Goat[3];
        arr[0]=new Goat(12.5,5);
        arr[1]=new Goat(12.3,3);
        arr[2]=new Goat(10.1,2);

        
        int i;
        for(i=0;i< arr.length;i++)
        {
            System.out.println("Weight : "+arr[i].weight);
            System.out.println("Age : "+arr[i].age);
            System.out.println("Price : "+arr[i].getPrice());
        }
        double sum=totalPrice(arr);
        System.out.println("\n\nTotal Price = "+sum);
    }
    static double totalPrice(Goat arr[])
    {
        int i;
        double sum=0.0;
        for(i=0;i< arr.length;i++)
        {
            sum=sum+arr[i].getPrice();
        }
        return sum;
    }
}
