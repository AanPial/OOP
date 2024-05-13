package Exception;

public class NestedTryBlock2 {
    public static void main(String[] args) {
        try {
            try {
                try {
                    int [] arr={1,5,6,9};
                    System.out.println(arr[100]);
                }
                catch (ArithmeticException e){
                    System.out.println("Arithmetic exception");
                    System.out.println(" inner try block 2");
                }
            }
            catch (ArithmeticException e){
                System.out.println("Arithmetic exception");
                System.out.println("inner try block 1");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("outer (main) try block");
        }
        catch (Exception e){
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }
}
