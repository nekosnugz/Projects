public class Temperature{
    private int day;
    private double max, min;

    public Temperature(int day, double max, double min) {
        this.day = day;
        this.max = max;
        this.min = min;
    }

    public Temperature() {
        this(1 , 0, 0);
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return this.day;
    }

    public void setMax(double max) {
        this.max = max; 
    }

    public double getMax() {
        return this.max;
    }

    public void setMin(double min) {
        this.min = min; 
    }

    public double getMin() {
        return this.min;
    }

    public double getTermalExcursion() {
        return Math.abs(this.max - this.min);
    }

    public boolean compareMax(Temperature t2) {
        return this.max > t2.max;
    }

    public double getAverage() {
        return (this.max + this.min) / 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;

        Temperature comp = (Temperature) obj;
        
        return this.day == comp.day && this.max == comp.max && this.min == comp.min;
    }

}