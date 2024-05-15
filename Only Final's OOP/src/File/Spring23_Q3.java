package File;
import java.util.*;
import java.io.*;
public class Spring23_Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String []name=new String[n];
        String []id=new String[n];
        double []avg=new double[n];
        for (int i=0;i<n;i++){
            name[i]=sc.next();
            id[i]=sc.next();
            double sct=0;
            for (int j=0;j<6;j++){
                double x=sc.nextDouble();
                sct+=x;
            }
            avg[i]=sct/6;
        }
        try{
            PrintWriter p=new PrintWriter(new File("employee.txt"));
            for (int i=0;i<n;i++){
                p.println("Employee"+(i+1)+" name "+name[i]);
                p.println("Employee"+(i+1)+" id "+id[i]);
                p.println("Employee"+(i+1)+" average "+avg[i]);
            }
            p.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        try{
            PrintWriter p1=new PrintWriter(new File("increment.txt"));
            for (int i=0;i<n;i++){
                if(avg[i]>75){
                    p1.println("Employee"+(i+1)+" name "+name[i]);
                    p1.println("Employee"+(i+1)+" id "+id[i]);
                    p1.println("Employee"+(i+1)+" average "+avg[i]);
                }
            }
            p1.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        double max=avg[0];
        String maxname=name[0];
        for (int i=0;i<avg.length;i++){
            if (avg[i]>max){
                max=avg[i];
                maxname=name[i];
            }
        }
        System.out.println("Maximum "+maxname);
    }
}
