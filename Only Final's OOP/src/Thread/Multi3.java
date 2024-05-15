package Thread;

public class Multi3 implements Runnable{
    public void run(){
        try{
            System.out.println("ID "+Thread.currentThread().getId());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
class TstMulti3{
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Thread ob=new Thread(new Multi3());
            ob.setPriority(Thread.NORM_PRIORITY);
            ob.start();
        }
    }
}
