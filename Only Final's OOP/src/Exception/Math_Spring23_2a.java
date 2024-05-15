package Exception;

public class Math_Spring23_2a {
    public int divide(int a, int b) {
        return a / b;
    }
}
 class test {
    public static void main(String[] args) {
        Math_Spring23_2a m =new Math_Spring23_2a();

        int n=4;
        int d=0;
        try{
            System.out.println(m.divide(n,d));
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Complete");
        }

    }
}