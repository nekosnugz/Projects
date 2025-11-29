import java.util.Scanner;
// import java.util.Random;

public class es1 {

    public static double rectArea(double b, double h) {
        return b * h;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Random rand = new Random();
        // Esercizio 1: Crea un metodo che calcola l'area di un rettangolo e testalo nel main con valori inseriti dall'utente.
        
        double n1, n2, area;

        System.out.print("\nInserisci un numero: ");
        n1 = input.nextDouble();
        input.nextLine();
        
        System.out.print("\nInserisci un'altro numero: ");
        n2 = input.nextDouble();
        input.nextLine();

        area = rectArea(n1, n2);

        System.out.printf("\nArea del rettangolo con lati pari a '%.2f' unita' e '%.2f' unita': %.2f", n1, n2, area);


        input.close();
    }

}