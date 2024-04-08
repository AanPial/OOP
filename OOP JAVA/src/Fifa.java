public class Fifa {
    private int noGoals;
    public String venue;
    public Fifa(){
        System.out.println("Who will be winner?");
    }
    public Fifa(int noGoals,String venue){
        this();
        this.noGoals=noGoals;
        this.venue=venue;
    }
    public String toString(){
        return "Fifa->noOFGoals:"+noGoals+",Venue:"+venue;
    }
    public int getNoGoals(){
        return noGoals;
    }
}
class BrazilFans extends Fifa{
    int havingWorldCups;
    public BrazilFans(int n,String s,int havingWorldCups ){
        super(n,s);
        this.havingWorldCups=havingWorldCups;
        System.out.println("Brazil will win.");
    }
    public String toString(){
        return "Brazil Fans->"+"[Fifa->noOFGoals:"+getNoGoals()+",Venue:"+venue+"],"+"havingWorldCup:"+havingWorldCups;
    }
    public void incrementWorldCups(){
        havingWorldCups++;
    }
}
class ArgentinaFans extends Fifa{
    int havingWorldCups;
    public ArgentinaFans(int n,String s,int havingWorldCups ){
        super(n,s);
        this.havingWorldCups=havingWorldCups;
        System.out.println("Argentina will win.");
    }
    public String toString(){
        return "Argentina Fans->"+"[Fifa->noOFGoals:"+getNoGoals()+",Venue:"+venue+"],"+"havingWorldCup:"+havingWorldCups;
    }
    public void incrementWorldCups(){
        havingWorldCups++;
    }
}
class Mid{
    public static void main(String[] args) {
        Fifa a,b;
        a=new ArgentinaFans(10,"Qatar",2);
        b=new BrazilFans(7,"Qatar",5);
        System.out.println(a.toString());
        System.out.println(b.toString());
        if (a.getNoGoals()> b.getNoGoals()){
            ((ArgentinaFans)a).incrementWorldCups();
            System.out.println(a.toString());
            System.out.println(b.toString());
        }
        else {
            ((BrazilFans)a).incrementWorldCups();
            System.out.println(a.toString());
            System.out.println(b.toString());
        }
    }
}