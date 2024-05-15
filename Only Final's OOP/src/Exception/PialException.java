package Exception;

public class PialException extends Exception{
    public PialException(String str){
        super(str);
    }
}
class testPial{
    public void rul(int x)throws PialException{
        if (x>10){
            throw new PialException("I am Pial Vai");
        }
    }

    public static void main(String[] args)throws PialException {
        testPial p=new testPial();
        p.rul(20);
    }
}
