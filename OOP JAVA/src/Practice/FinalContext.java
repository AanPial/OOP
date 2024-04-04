package Practice;

public class FinalContext {
    public final void calculate(){
        System.out.println("calculate method is called");
    }
}
class StaticContext {
    final static int value=8;
    private static double mark=90.0;
    static int count;


        static int getCount(int x) {
        count=x;
        return ++count;
        }
        static   double getMark() {
            return mark;
        }
        // You can’t modify the following main method.
        public static void main(String[]args) {

            System.out.println("count= "+getCount(1));
            System.out.println("value = "+value);
            FinalContext sv = new FinalContext();
            System.out.println("mark= "+getMark());
            sv.calculate();
        }
    }