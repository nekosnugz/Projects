public class testCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(3, false, 0);
        
        // Car car3 = new Car(-1, false, -1);
        // Car car3 = new Car(-1, false, 5);
        // Car car3 = new Car(1, false, -5);

        System.out.println("Step 1:");
        System.out.println(car1.getDoors() + " " + car1.getState() + " " + car1.getSpeed());
        System.out.println(car2.getDoors() + " " + car2.getState() + " " + car2.getSpeed());
        System.out.println(car1.equals(car2));
        
        car1.setDoors(5);
        car1.setState(true);
        car1.setSpeed(500);
        
        System.out.println("Step 2:");
        System.out.println(car1.getDoors() + " " + car1.getState() + " " + car1.getSpeed());
        System.out.println(car2.getDoors() + " " + car2.getState() + " " + car2.getSpeed());
        System.out.println(car1.equals(car2));
        
        car2 = new Car(car1);
        
        System.out.println("Step 3:");
        System.out.println(car1.getDoors() + " " + car1.getState() + " " + car1.getSpeed());
        System.out.println(car2.getDoors() + " " + car2.getState() + " " + car2.getSpeed());
        System.out.println(car1.equals(car2));

    }
}