public class AddNumbers {
    private int x,y,z;
    public AddNumbers(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void myadd()
    {
        z=x+y;
        System.out.println("\nTotal Sum : "+z);
    }
    public static void main(String [] args)
    {
        AddNumbers p=new AddNumbers(10,20);
        p.myadd();
    }
}
