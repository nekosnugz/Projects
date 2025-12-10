public class Car {
    private int doors;
    private boolean state;
    private int speed;

    public Car(int doors, boolean state, int speed) {
        if (doors < 0 && speed < 0) throw new IllegalArgumentException("doors and speed must be greater than 0");
        if (doors < 0) throw new IllegalArgumentException("doors must be greater than 0");
        if (speed < 0) throw new IllegalArgumentException("speed must be greater than 0");

        this.doors = doors;
        this.state = state;
        this.speed = speed;
    }
    
    public Car(Car car) {
        this(car.getDoors(), car.getState(), car.getSpeed());
    }
    
    public Car() {
        this(0, false, 0);
    }
    
    public int getDoors() {
        return this.doors;
    }

    public boolean getState() {
        return this.state;
    }
    
    public int getSpeed() {
        return this.speed;
    }
    
    public void setDoors(int doors) {
        if (doors < 0) throw new IllegalArgumentException("doors must be greater than 0");
        this.doors = doors;
    }
    
    public void setState(boolean state) {
        this.state = state;
    }
    
    public void setSpeed(int speed) {
        if (speed < 0) throw new IllegalArgumentException("speed must be greater than 0");
        this.speed = speed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        
        Car comp = (Car) obj;
        return (this.doors == comp.doors && this.state == comp.state && this.speed == comp.speed);
    }
}