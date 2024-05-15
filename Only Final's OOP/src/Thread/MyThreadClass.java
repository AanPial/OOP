package Thread;

public class MyThreadClass extends Thread{
    public long time;
    MyThreadClass(long x){
        time=x;
    }
    public void run(){
        try{
            Thread.sleep(time);
            System.out.println("ID- "+Thread.currentThread().getId());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class TestMy{
    public static void main(String[] args) {
        MyThreadClass ob1=new MyThreadClass(10000);
        MyThreadClass ob2=new MyThreadClass(3000);
        MyThreadClass ob3=new MyThreadClass(5000);
        MyThreadClass ob4=new MyThreadClass(1000);

        ob1.start();
        ob2.start();
        ob3.start();
        ob4.start();

    }
}
