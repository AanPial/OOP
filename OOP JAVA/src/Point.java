public class Point {
    int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Circle{
    Point center;
    double radius;
    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }
    public int PointInsideCircle(Point p){
        double a = center.x;
        double b = center.y;
        double c = p.x;
        double d = p.y;
        double distance = Math.sqrt(((a - c) * (a - c)) + ((b - d) * (b - d)));
        if(distance > this.radius) return 0;
        else return 1;
    }
}

class Tests{
    public static void main(String[] args) {
        Point center = new Point(0, 0);
        double radius = 1;
        Circle c = new Circle(center, radius);
        Point p = new Point(2, 2);
        if(c.PointInsideCircle(p) == 1){
            System.out.println("yes, the point is inside the circle");
        }
        else System.out.println("no");
    }
}