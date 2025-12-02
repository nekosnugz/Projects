import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, i;
        int sum = 0;

        System.out.println("Somma dei numeri da 1 a n");

        System.out.print("Inserisci un numero: ");
        num = input.nextInt();
        
        input.nextLine();

        i = num;
        while (i > 0) {
            sum = sum + i;
            i--;
        }

        System.out.printf("La somma dei numeri da '1' a '%d' è '%d'", num, sum);

        input.close();
    }
}