import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        //Opening scanner
        Scanner input = new Scanner(System.in);
        
        //Variables
        String name = "", surname = "", fname = "";
        int age = 0;


        //
        System.out.println("Hello world! This is println...");
        System.out.print("And this is print");
        System.out.print(", with another print \n");
        
        System.out.println("Insert your name: ");
        name = input.next();

        System.out.println("Insert your surname: ");
        surname = input.next();

        System.out.println("Insert your age: ");
        age = input.nextInt();

        fname = name + " " + surname;
        System.out.println("Hello, " + fname + ".");
        System.out.println("You're " + age + " years old.");

        //Closing scanner
        input.close();
    }
}
