package Exception;

public class TryCatchExample6 {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            System.out.println(i/j);
        }
        catch (Exception e){
            System.out.println("Cant devided by zero");
            System.out.println(i+j);
        }
    }
}
