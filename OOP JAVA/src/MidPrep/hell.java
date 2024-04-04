package MidPrep;

public class hell {
    int a=10;
    int b=20;
    public String func(){
        String s="hello"+a+"Hi: "+b;
        return s;
    }
}
class hill{
    public static void main(String[] args) {
        hell p=new hell();
        System.out.println(p.func());
    }
}
