package Interface;

public interface Salary {
    public double calculateSalary();
}
abstract class Person implements Salary{
    private int workhour;
    private int basic;
    Person(int workhour,int basic){
        this.workhour=workhour;
        this.basic=basic;
    }
    public int getWorkhour(){
        return workhour;
    }
    public int getBasic(){
        return basic;
    }
}
class Officer extends Person{
    private int exp;
    private int overtime;
    Officer(int a,int b,int exp,int overtime){
        super(a,b);
        this.exp=exp;
        this.overtime=overtime;
    }

    @Override
    public double calculateSalary() {
        double s=getBasic()+(exp*1000)+(overtime*200);
        return s;
    }
}
class Manager extends Person{
    private int exp;
    Manager(int a,int exp){
        super(0,a);
        this.exp=exp;
    }

    @Override
    public double calculateSalary() {
        double s;
        s=getBasic()+exp*5000;
        return s;
    }
}
class Worker extends Person{
    Worker(int a){
        super(a,0);
    }

    @Override
    public double calculateSalary() {
        double s;
        s=getWorkhour()*2000;
        return s;
    }
}
class SlMain{
    public static void main(String[] args) {
        Person officer1=new Officer(0,10000,2,5);
        System.out.println("Officer1 : "+officer1.calculateSalary());

        Person worker1 =new Worker(10);
        System.out.println("Worker1 : "+worker1.calculateSalary());

        Person worker2=new Worker(10);
        System.out.println("Worker2 : "+worker2.calculateSalary());

        Person manager1=new Manager(50000,5);
        System.out.println("Manager1 : "+manager1.calculateSalary());
        System.out.println("");
        System.out.println("");
        double []arr=new double[4];
        arr[0]= officer1.calculateSalary();
        arr[1]= worker1.calculateSalary();
        arr[2]= worker2.calculateSalary();
        arr[3]= manager1.calculateSalary();
        double sum=0.0,avg;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        avg=sum/4;
        System.out.println("Average : "+avg);
    }
}