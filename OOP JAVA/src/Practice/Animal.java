package Practice;

public class Animal {
    public String color;
    public String name;
    public Animal() {
        System.out.println("Default animal");
        color = "Unknown";
    }
    public void showNameColor() {
        System.out.println("Color is: "+ color+" Name is: "+
                name); }
    {
        System.out.println("Animal instance initialization ");
    }
}
class Pokemon extends Animal
{
    public String name = "Pikachu";
    public String color = "Red";
}
class AnimalTest {
    public static void main(String[] args) {
        Animal defaultAnimal = new
                Animal();
        Pokemon pk = new Pokemon();
        defaultAnimal.showNameColor();
        pk.showNameColor();
    }
}
