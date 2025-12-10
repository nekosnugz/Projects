public class Vehicle {
    private int tires;
    private int cc;

    public Vehicle(int t, int c) {
        this.tires = t;
        this.cc = c;
    }

    public Vehicle() {
        this(0,0);
    }

    public int getTires() {
        return this.tires;
    }
    
    public int getCC() {
        return this.cc;
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle(4, 1400);

        System.out.println(v.getTires() + " tires");
        System.out.println(v.getCC() + " CC");
    }
}