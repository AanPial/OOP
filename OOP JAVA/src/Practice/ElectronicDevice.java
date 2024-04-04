package Practice;

public class ElectronicDevice {
    public String Brand;
    public double price;

    public ElectronicDevice(String Brand, double price) {
        this.Brand=Brand;
        this.price=price;
    }
    public void displayinfo(){
        //nothing
    }
}
class SmartPhone extends ElectronicDevice{
    public String Model;
    public String OperatingSystem;
    private String IMEI;
    public SmartPhone(String Brand,double price,String Model,String Op,String IMEI){
        super(Brand,price);
        this.Model=Model;
        this.OperatingSystem=Op;
        this.IMEI=IMEI;
    }
    public void displayinfo(){
        System.out.println(Brand);
        System.out.println(price);
        System.out.println(Model);
        System.out.println(OperatingSystem);
    }
    public String getIMEI(){
        return IMEI;
    }
    public static void main(String[]args){
        SmartPhone p=new SmartPhone("Xiaomi",2550.50,"Speed edition","Android",1223457478+"");
        p.displayinfo();
        System.out.println("IMEI : "+p.getIMEI());
    }
}
