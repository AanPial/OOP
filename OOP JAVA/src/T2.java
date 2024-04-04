public class T2 {
    public static void main(String[]args)
    {
        T []arr;
        arr=new T[3];
        arr[0]=new T(12.5,5);
        arr[1]=new T(12.3,3);
        arr[2]=new T(10.1,2);

        int i;
        for(i=0;i< arr.length;i++)
        {
            System.out.println("Weight : "+arr[i].weight);
            System.out.println("Age : "+arr[i].age);
            System.out.println("Price : "+arr[i].getPrint());
        }
        double sum=0.0;

        for(i=0;i< arr.length;i++)
        {
            sum=sum+arr[i].getPrint();
        }
        System.out.println("Total Price = "+sum);
    }

}
