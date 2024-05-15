package Thread;

public class NurThread implements Runnable{
    int start;
    int end;
    int []prr;
    int max;
    NurThread(int start,int end,int []prr){
        this.start=start;
        this.end=end;
        this.prr=prr;
    }
    public void run(){
         max=prr[start];
        for (int i=start;i<end;i++){
            if (prr[i]>max){
                max=prr[i];
            }
        }
    }
}
class TestNur{
    public static void main(String[] args) {
        int []arr={10,20,30,45,8};
        int []mrr={100,120,31,4454,22};
        NurThread nur=new NurThread(0,4,arr);
        NurThread pial=new NurThread(0,4,mrr);
        Thread ob1=new Thread(nur);
        Thread ob2=new Thread(pial);

        ob1.start();
        ob2.start();

        try {
            ob1.join();
            ob2.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Maximum1 : "+nur.max);
            System.out.println("Maximum2 : "+pial.max);
        }
    }
}
