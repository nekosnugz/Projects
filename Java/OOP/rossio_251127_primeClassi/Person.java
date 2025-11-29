public class Person {
    private String name, surname, register;
    private double avrg;


    public Person(String name, String surname, String register, double avrg) {
        if (avrg < 0.0 || avrg > 10.0) throw new IllegalArgumentException("avrg must be between 0 and 10 (inclusive)");
        
        this.name = name;
        this.surname = surname;
        this.register = register;
        this.avrg = avrg;
    }

    public Person() {
        this(null, null, null, 0);
    }

    public String getName() {
        return this.name;
    }
    
    public String getSurname() {
        return this.surname;
    }
    public String getRegister() {
        return this.register;
    }
    
    public double getAvrg() {
        return this.avrg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public void setAvrg(double avrg) {
        if (avrg < 0.0 || avrg > 10.0) throw new IllegalArgumentException("avrg must be between 0 and 10 (inclusive)");
        this.avrg = avrg;
    }

    @Override
    public String toString() {
        return String.format("Name: %s - Surname: %s - Register: %s - Average mark: %.2f", this.getName(), this.getSurname(), this.getRegister(), this.getAvrg());
    }
    
    public void printInfo() {
        System.out.println(this.toString());
    };
}