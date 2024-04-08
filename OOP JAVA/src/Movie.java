public class Movie {
    private String name;
    protected String origin;
    public String genre;
    public float rating;

    public String getName(){
        return name;
    }
    public Movie(String n,String o,String g,float r){
        name=n;
        origin=o;
        genre=g;
        rating=r;
    }
    public Movie(String n,String g){
        name=n;
        genre=g;
    }
    public void Details(){
        System.out.println("You are watching "+getName());
        System.out.println("Origin : "+origin);
        System.out.println("Genre : "+genre);
        System.out.println("Rating : "+rating);
    }
}
class pmain{
    public static void main(String[] args) {
        Movie p=new Movie(" SHUTTER ISLAND ","USA","Thriller",8.2f);
        p.Details();
    }
}
