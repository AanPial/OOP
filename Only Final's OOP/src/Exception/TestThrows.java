package Exception;

public class TestThrows {
    public double count(int x,int y) throws ArithmeticException{
        int z=x/y;
        return z;
    }

    public static void main(String[] args) {
        try {
            TestThrows p=new TestThrows();
            p.count(5,0);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
