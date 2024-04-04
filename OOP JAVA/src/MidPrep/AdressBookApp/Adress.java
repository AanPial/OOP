package MidPrep.AdressBookApp;

public class Adress {
    private String name;
    private int Age;
    private String Adress;

    public Adress (String name,int Age,String Adress){
        this.name=name;
        this.Age=Age;
        this.Adress=Adress;
    }
    public void setName(String n){
        name=n;
    }
    public void setAge(int x){
        Age=x;
    }
    public void setAdress(String A){
        Adress=A;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return Age;
    }
    public String getAdress(){
        return Adress;
    }
    public void delete(){}

}
class AdressBook extends Adress{
    public AdressBook(String name,int Age,String Adress){
        super(name,Age,Adress);
    }
    public void updateRecord(String n,int A,String Ad){
        super.setName(n);
        super.setAge(A);
        super.setAdress(Ad);
    }
    public void delete(){
        super.setName("Deleted");
        super.setAge(-1);
        super.setAdress("Deleted");
    }
}
class check{
    public static void main(String[] args) {
        Adress p=new AdressBook("Abdullah",23,"Jatrabari");

        System.out.println("Name : "+p.getName());

        ((AdressBook)p).updateRecord("Tabassum",21,"Vuighor");
        System.out.println("New name : "+p.getName());

        p.delete();
        if(p.getAge()==-1){
            System.out.println("Deleted");
        }

    }
}