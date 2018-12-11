class Point {
    int x;
    int y;
    
    Point(int x , int y){
        this.x = x;
        this.y = y;
    }

    Point(){
        this(0,0);
    }
    String getXY(){
        return "("+x+","+y+")";
    }
} // end Point

class Shape {
    String color = "block";
    void drow(){
        System.out.printf("[color=%s]%n", color);
    }
} // end Shap

class Triangel extends Shape {
    Point[] p = new Point[3];

    Triangel(Point[] p){
        this.p = p;
    }

    void draw(){
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s%n", p[0].getXY(), p[1].getXY() , p[2].getXY(), color);
    }
} // end Triangel

class Circle extends Shape {

    Point center;
    int r;

    Circle(){
        this(new Point(0,0), 100);
    }
    Circle (Point center , int r){
        this.center = center;
        this.r =r;
    }

    void draw(){
        System.out.printf("[center= (%d, %d), r=%d , color=%s %n", center.x , center.y , r , color);
    }
} // end Circle


class DrawShape {
    public static void main (String args[])  {

        Point[] p = {
                        new Point(100, 100),
                        new Point(140 , 50),
                        new Point(200 , 100)
                    };
        Triangel t = new Triangel(p);
        Circle c = new Circle(new Point(150 , 150), 50);
        
        t.draw();
        c.draw();

    }
}