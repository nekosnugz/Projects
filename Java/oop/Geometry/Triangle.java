package Geometry;

public class Triangle {
    private Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle(Triangle t) {
        this.p1 = t.p1;
        this.p2 = t.p2;
        this.p3 = t.p3;
    }

    public void traslate(double x, double y) {
        this.p1.setX(this.p1.getX() + x);
        this.p1.setY(this.p1.getY() + y);

        this.p2.setX(this.p2.getX() + x);
        this.p2.setY(this.p2.getY() + y);
        
        this.p3.setX(this.p3.getX() + x);
        this.p3.setY(this.p3.getY() + y);
    }

    public double getSide(Point a, Point b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }

    public double getPerimeter() {
        return getSide(this.p1, this.p2) + getSide(this.p2, this.p3) + getSide(this.p1, this.p3);
    }

    public double getArea() {
        double per = this.getPerimeter() / 2;
        double l1 = getSide(this.p1, this.p2);
        double l2 = getSide(this.p2, this.p3);
        double l3 = getSide(this.p1, this.p3);
        
        return Math.sqrt(per * (per - l1) * (per - l2) * (per - l3));
    }

    public Point getCenterOfGravity() {
        return new Point((p1.getX() + p2.getX() + p3.getX()) / 2, (p1.getY() + p2.getY() + p3.getY()) / 2);
    }

    @Override
    public String toString() {
        return String.format("p1: (%.1f, %.1f) p2: (%.1f, %.1f) p3: (%.1f, %.1f)", this.p1.getX(), this.p1.getY(), this.p2.getX(), this.p2.getY(), this.p3.getX(), this.p3 .getY());
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Triangle comp = (Triangle) obj;

        return (this.p1.equals(comp.p1) && this.p2.equals(comp.p2) && this.p3.equals(comp.p3));
    }

    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        Point p2 = new Point(4,5);
        Point p3 = new Point(4,1);
        Point p4 = new Point(1,4);
    
        Triangle t1 = new Triangle(p1, p2, p3);
        Triangle t2 = new Triangle(p1, p3, p4);
        Triangle t3 = new Triangle(p1, p2, p2);
        Triangle t4 = new Triangle(t1);
    
        System.out.println("Triangolo t1" + t1.toString());
        System.out.println("Perimetro trianglol t1:" + t1.getPerimeter());
        System.out.println("Area triangolo t1:" + t1.getArea());
    
        System.out.println("Triangolo t2" + t2.toString());
        System.out.println("Perimetro trianglol t2:" + t2.getPerimeter());
        System.out.println("Area triangolo t2:" + t2.getArea());
    
        System.out.println("Triangolo t3" + t3.toString());
        System.out.println("Perimetro trianglol t3:" + t3.getPerimeter());
        System.out.println("Area triangolo t3:" + t3.getArea());
    
        System.out.println("Triangolo t4" + t4.toString());
        System.out.println("Perimetro trianglol t4:" + t4.getPerimeter());
        System.out.println("Area triangolo t4:" + t4.getArea());
    
        System.out.println("I triangoli t1 e t4" + ((t1.equals(t4)) ? " " : " non ") + "sono uguali");
        System.out.println("I triangoli t1 e t2" + ((t1.equals(t2)) ? " " : " non ") + "sono uguali");
    }

}