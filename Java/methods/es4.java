import java.util.Scanner;
// import java.util.Random;

public class es4 {
    public static double circleArea(double r) {
        return Math.PI * r * r;
    }
    public static double squareArea(double l) {
        return l*l;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Random rand = new Random();
        // Esercizio 4: Scrivi due metodi per calcolare l'area: uno per il cerchio (raggio) e uno per il quadrato (lato).
        double num, cArea, sArea;

        System.out.print("\nInserisci un numero: ");
        num = input.nextDouble();
        input.nextLine();

        cArea = circleArea(num);
        sArea = squareArea(num);

        System.out.printf("\nArea del cerchio di raggio '%.2f': %.2f", num, cArea);
        System.out.printf("\nArea del quadrato di lato '%.2f': %.2f", num, sArea);

        input.close();
    }
}