package Geometry;
public class IsoscelesTriangle {
    private double base, oblique;

    public IsoscelesTriangle(double base, double oblique) {
        this.base = base;
        this.oblique = oblique;
    }

    public IsoscelesTriangle() {
        this(0, 0);
    }

    public double getBase() {
        return this.base;
    }

    public double getOblique() {
        return this.oblique;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setOblique(double oblique) {
        this.oblique = oblique;
    }

    public double getPerimeter() {
        return this.base + 2 * this.oblique;
    }

    public double getArea() {
        return Math.abs((this.base * Math.sin(this.oblique)) / 2);
    }

}