import java.text.DecimalFormat;
public class Gg4 {
    public static void main(String[]args)
    {
        double a=1234.9874;
        DecimalFormat p=new DecimalFormat("#");
        System.out.println("#1 : "+p.format(a));
        DecimalFormat q=new DecimalFormat("#.###");
        System.out.println("#2 : "+q.format(a));
        DecimalFormat r=new DecimalFormat("#.000000");
        System.out.println("#3 : "+r.format(a));
        DecimalFormat s=new DecimalFormat("0000000.00");
        System.out.println("#4 : "+s.format(a));
        DecimalFormat t=new DecimalFormat("$,###.##");
        System.out.println("#5 : "+t.format(a));
    }
}
