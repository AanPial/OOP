package Abstract.Animal1;

public class Main {

    public void speak(Animal target){
        if(target instanceof baby){
            System.out.println("WAAHHH");
        } else if (target instanceof cat) {
            System.out.println("Mewo");
        }
        else {
            System.out.println("Grrrr");
        }
    }
    public static void main(String[] args) {
        Animal b,c;
        b=new baby();
        c=new cat();
        Main p=new Main();
        p.speak(c);
    }
}
