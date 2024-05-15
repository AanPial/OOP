package ArrayList;

import java.util.*;

public class Address {
    String building_number, area, city;
    int zip_code;

    Address(String building_number, String area, String city,int zip_code){
        this.building_number = building_number;
        this.area = area;
        this.city = city;
        this.zip_code = zip_code;
    }

    int getZip_code(){
        return zip_code;
    }
}
class Test{
    public static void main(String[] args){

        ArrayList<Address>p=new ArrayList<>();

        p.add(new Address("19/A","Dhanmondi","Dhaka",1209));
        p.add(new Address("2/A","Tejgaon","Dhaka",1215));
        p.add(new Address("65","Nirala","Khulna",9100));

        p.add(1,new Address("215","Aamtola","Barishal",8200));

        p.set(2,new Address("36","Gulshan","Dhaka",1212));

        Collections.sort(p,new Sorting());
       /*
       Task 5: Delete the object at index 2
        */
        p.remove(2);
    }
}
class Sorting implements Comparator<Address> {
    public int compare(Address a1,Address a2){
        if(a1.getZip_code()>a2.getZip_code()){
            return 1;
        } else if (a1.getZip_code()==a2.getZip_code()) {
            return 0;
        }
        else {
            return -1;
        }
    }
}