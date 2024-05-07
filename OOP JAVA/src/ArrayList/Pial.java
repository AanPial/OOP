package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Pial {
    String name;
    int id;
    Pial(String name,int id){
        this.name=name;
        this.id=id;
    }
    void show(){
        System.out.println("Nam "+name+" Id "+id);
    }
}
class piso implements Comparator<Pial> {
    public int compare(Pial s1,Pial s2){
        if (s1.id >s2.id){
            return 1;
        }
        else {
            return -1;
        }
    }
}
class TestPial{
    public static void main(String[]args){
        ArrayList<Pial>p=new ArrayList<>();
        p.add(new Pial("AAn",555));
        p.add(new Pial("mun",4468));
        p.add(new Pial("leve",78));
        Collections.sort(p,new piso());
        for (int i=0;i<p.size();i++){
            p.get(i).show();
        }
    }
}
