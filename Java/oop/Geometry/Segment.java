package Geometry;

public class Segment {
    private Point p1, p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public Segment(double x1, double y1, double x2, double y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }
    
    public Segment(Segment s) {
        this.p1 = s.p1;
        this.p2 = s.p2;
    }
    
    public Segment() {
        this(0.0, 0.0, 0.0, 0.0);
    }


    // get methods
    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    // set methods
    // P1
    public void setP1(Point p) {
        this.p1 = new Point(p);
    }

    public void setP1X(double x) {
        this.p1.setX(x);
    }

    public void setP1Y(double y) {
        this.p1.setY(y);
    }

    // P2
    public void setP2(Point p) {
        this.p2 = new Point(p);
    }

    public void setP2X(double x) {
        this.p2.setX(x);
    }

    public void setP2Y(double y) {
        this.p2.setY(y);
    }

    // Overrides
    @Override
    public String toString() {
        return String.format("p1=(%.2f, %.2f) --- p2=(%.2f, %.2f)", this.p1.getX(), this.p1.getY(), this.p2.getX(), this.p2.getY());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Segment comp = (Segment) obj;

        return (this.getP1().equals(comp.getP1()) && this.getP2().equals(comp.getP2()));
    }

    // Other

    public void translate(double x, double y) {
        this.p1.setX(this.p1.getX() + x);
        this.p1.setY(this.p1.getY() + y);
        this.p2.setX(this.p2.getX() + x);
        this.p2.setY(this.p2.getY() + y);
    }

    public double getLength() {
        return Math.sqrt(Math.pow(this.p2.getX() - this.p1.getX(), 2) + Math.pow(this.p2.getY() - this.p2.getY(), 2));
    }

    public Point getMiddlePoint() {
        double mx = (this.p1.getX() + this.p2.getX()) / 2;
        double my = (this.p1.getY() + this.p2.getY()) / 2;
        return new Point(mx, my);
    }

    public void flipXAxis() {
        this.p1.setY(this.p1.getY() * -1);
        this.p2.setY(this.p2.getY() * -1);
    }

    public void flipYAxis() {
        this.p1.setX(this.p1.getX() * -1);
        this.p2.setX(this.p2.getX() * -1);
    }

    public static void main(String[] args) {
        Point p1 = new Point(0, 10);
        Point p2 = new Point(4, 13);

        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(10, 0, 10, 20);

        System.out.println("s1=" + s1.toString());
        System.out.println("s2=" + s2.toString());
        
        System.out.println("Lunghezza di s1: " + s1.getLength());
        System.out.println("Punto medio di s1: " + s1.getMiddlePoint().toString());
        
        s1.translate(10, 10);
        System.out.println("s1 e s2" +(s1.equals(s2) ? " " : " non ") + "sono uguali");
        
        s2.flipYAxis();
        s2.flipXAxis();

        System.out.println("s2=" + s2.toString());
    }

}