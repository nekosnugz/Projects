import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1, num2, num3;
        int max = 0;

        System.out.println("Massimo tra tre numeri");

        System.out.print("Inserisci il primo numero intero: ");
        num1 = input.nextInt();
        input.nextLine();
        
        System.out.print("Inserisci il secondo numero intero: ");
        num2 = input.nextInt();
        input.nextLine();
        
        System.out.print("Inserisci il terzo numero intero: ");
        num3 = input.nextInt();
        input.nextLine();
        
        if (num1 > num2) {
            max = num1 > num3 ? num1 : num3;
        } else max = num2 > num3 ? num2 : num3;

        System.out.printf("Il numero maggiore tra '%d', '%d' e '%d' è '%d'", num1, num2, num3, max);


        input.close();
    }
}