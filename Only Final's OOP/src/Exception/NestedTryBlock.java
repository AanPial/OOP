package Exception;

public class NestedTryBlock {
    public static void main(String[] args) {
        try{
            try {
                System.out.println("Going to devided by zero");
                int x=10/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            try{
                int a[]=new int[5];

                //assigning the value out of array bounds
                a[5]=4;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            finally {
                System.out.println("Other Statements");
            }
        }
        catch (Exception e){
            System.out.println("handled the exception (outer catch)");
        }
        System.out.println("Normal flow");
    }
}
