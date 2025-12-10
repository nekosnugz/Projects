package Geometry;
public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.setX(p.getX());
        this.setY(p.getY());
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x == 0 || x == -0 ? 0 : x;
    }
    
    public void setY(double y) {
        this.y = y == 0 || y == -0 ? 0 : y;
    }

    @Override
    public String toString() {
        return String.format("(%.1f, %.1f)", this.getX(), this.getY());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Point comp = (Point) obj;

        return this.x == comp.x && this.y == comp.y;
    }
}