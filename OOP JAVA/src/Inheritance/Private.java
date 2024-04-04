package Inheritance;

public class Private {
    private String name;
    private int age;
    public Private(String name,int age)//We can also use constructor for private
    {
        this.name=name;
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
class pcb{
    public static void main(String[] args) {
        Private p=new Private("pial",23);
        System.out.println(p.getName()+ " "+p.getAge());
    }
}