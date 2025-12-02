import java.util.Scanner;

public class es3 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        double num1 = 0, num2 = 0;
        char operator = ' ';
        double result = 0;
        boolean isOperatorValid = false;

        System.out.println("Calcolatrice semplice");

        while (!isOperatorValid) {
            System.out.print("\nInserisci un numero: ");
            num1 = input.nextDouble();
            input.nextLine();
            
            System.out.print("Inserisci l'operatore: ");
            operator = input.next().charAt(0);
            input.nextLine();
            
            System.out.print("Inserisci un'altro numero: ");
            num2 = input.nextDouble();
            input.nextLine();

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    isOperatorValid = true;
                    break;
                case '-':
                    result = num1 - num2;
                    isOperatorValid = true;
                    break;
                case '*':
                    result = num1 * num2;
                    isOperatorValid = true;
                    break;
                case '/':
                    result = num1 / num2;
                    isOperatorValid = true;
                    break;
                default:
                    System.out.print("Valore non valido, riprovare");
            }
        }

        System.out.printf("%.2f %c %.2f = %.2f", num1, operator, num2, result);


        input.close();
    }
}
