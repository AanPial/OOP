package Exception;

public class MultipleCatchBlock5 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        try {
            int x=arr[100]/0;
            System.out.println(arr[10]);
        }
        /*catch (Exception e){
            System.out.println("Undefined"); [it will generate a error.which is unhandlable]
        }*/
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (ArithmeticException e){
            System.out.println("Arthmatic exception");
        }



    }
}
