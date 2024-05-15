package Thread;

public class Multi extends Thread{
    int id;
    Multi(int x){
        id=x;
    }
    public void run(){
        try{
            System.out.println("ID "+id);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class TestMulti{
    public static void main(String []args){

        for(int i=0;i<10;i++){
            Multi p=new Multi(i);
            p.start();
        }
    }
}
