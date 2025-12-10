public class testPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Ugo", "Fantozzi", "1001/bis", 8.6);
        Person p2 = new Person("Carlo", "Conte", "1237/bis", 5.3);
        Person p3 = new Person("Giovanni", "Calvo", "1237/bis", 2.6);

        System.out.println("Step 1:");
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        
        p1.setAvrg(8.9);
        p2.setAvrg(6);
        p1.setAvrg(2.3);

        System.out.println("Step 2:");
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
    }
}