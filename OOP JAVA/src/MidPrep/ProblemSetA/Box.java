package MidPrep.ProblemSetA;

public class Box {
    public double length;
    public double width;
    public double height;
    public Box(double length,double width,double height){
        this.length=length;
        this.height=height;
        this.width=width;
    }
    public double getVoluem(){
        double v;
        v=length*height*width;
        return v;
    }
}
class TestBox{
    public static void main(String[]args){
        Box b1=new Box(2,3.5,8);
        Box b2=new Box(5,5,5);

        System.out.println("Box 1 volume : "+b1.getVoluem());
        System.out.println("Box 2 volume : "+b2.getVoluem());
    }
}
