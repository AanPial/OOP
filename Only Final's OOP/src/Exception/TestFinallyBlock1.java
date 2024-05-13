package Exception;

public class TestFinallyBlock1{
    public static void main(String args[]){

        try{
            System.out.println("Code Begin");
            int x=10/0;
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally always excecuted.");
        }

        System.out.println("rest of the code...");
    }
}
