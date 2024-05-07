package Final2;


public class Point {
    int x;
    int y;
    static int count=0;
    Point(int x,int y){
        count++;
        this.x=x;
        this.y=y;
        if (count>2){
            throw new RuntimeException("Cannot create more than 3 instances");
        }
    }
    public static void main(String[] args) {
        Final1.Point p1=new Final1.Point(1,2);
        Final1.Point p2=new Final1.Point(1,2);
        Final1.Point p3=new Final1.Point(1,2);
        System.out.println(count);
    }
}
