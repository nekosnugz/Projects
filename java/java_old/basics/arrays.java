import java.util.Scanner;
import java.util.Random;

public class arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Esercizio 1: Dichiara un array di 10 numeri, riempilo con i primi 10 numeri pari e stampali usando enhanced for.
        int[] numberArray = new int[10];
        
        for (int i = 0; i < 10; i++) numberArray[i] = i * 2;

        for (int num : numberArray) System.out.printf("%d ", num);

        // Esercizio 2: Leggi 8 voti da tastiera, salvali in un array e calcola la media.
        int[] grades = new int[8];
        double average = 0.0f;

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("\nInserisci il %d° voto: ", i + 1);
            grades[i] = input.nextInt();
            input.nextLine();
        }

        for (int num : grades) average += num;

        average /= grades.length;

        System.out.printf("\nLa media dei voti e' '%.2f", average);

        // Esercizio 3: Crea un array di 6 nomi, riempilo e poi stampa solo i nomi che iniziano con 'A'.
        String[] names = new String[6];

        for (int i = 0; i < names.length; i++) {
            System.out.printf("\nInserisci il %d° nome: ", i + 1);
            names[i] = input.next();
            input.nextLine();
        }

        for (String name: names) if (name.charAt(0) == 'A' || name.charAt(0) == 'a') System.out.printf("%s ", name);

        // Esercizio 4: Leggi 5 numeri in un array, trova e stampa il numero maggiore e la sua posizione.
        int[] numbers = new int[5];
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("\nInserisci il %d° numero: ", i + 1);
            numbers[i] = input.nextInt();
            input.nextLine();
        }

        for (int i : numbers) max = max < i ? i : max;

        System.out.printf("Il massimo dei numeri forniti e' %d", max);

        // Esercizio 5: Crea un array di temperature della settimana, riempilo e conta quante temperature sono sopra i 20 gradi.
        double[] temperatures = new double[7];
        int over20 = 0;

        for (int i = 0; i < temperatures.length; i++) {
                System.out.printf("\nInserisci la temperatura media del %d° giorno della settimana: ", i + 1);
                temperatures[i] = input.nextDouble();
                input.nextLine();
        }

        for (double d : temperatures) over20 = d > 20 ? over20 + 1: over20;

        System.out.printf("\nNel corso della settimana sono state registrate temperature sopra i 20° in %d giornate diverse.", over20);

        // Esercizio 6: Leggi 10 numeri in un array e stampali in ordine inverso.
        int[] arrNum = new int[10];

        for (int i = 0; i < arrNum.length; i++) {
                System.out.printf("\nInserisci il %d° numero: ", i + 1);
                arrNum[i] = input.nextInt();
                input.nextLine();
        }

        for (int i = arrNum.length; i >= 0; i--) System.out.println(arrNum[i]);

        // Esercizio 7: Crea un array di 7 giorni della settimana e un array di 7 temperature. Stampa il giorno più caldo.
        String[] week = {"Lunedi'", "Martedi'", "Mercoledi'", "Giovedi'", "Venerdi'", "Sabato", "Domenica"};
        int[] weekTemperatures = new int[7];
        int maxTemp, maxTempIndex = 0;

        for (int i = 0; i < weekTemperatures.length; i++) {
                System.out.printf("\nInserisci la temperatura registrata %s: ", week[i]);
                weekTemperatures[i] = input.nextInt();
                input.nextLine();
        }

        maxTemp = weekTemperatures[0];

        for (int i = 0; i < weekTemperatures.length; i++) {
            maxTempIndex = maxTemp < weekTemperatures[i] ? i : maxTempIndex;
        }

        System.out.printf("%s e' stata registrata la temperatura massima settimanale pari a %d°C", week[maxTempIndex], weekTemperatures[maxTempIndex]);

        // Esercizio 8: Leggi numeri da tastiera fino a quando l'utente inserisce 0, salvali in un array (max 20 elementi) e poi stampali.
        int[] numArray = new int[20];
        int i = 0;

        do {
            System.out.print("Inserisci un numero: ");
            numArray[i] = input.nextInt();
            input.nextLine();
        } while (i < 20 && numArray[i-1] != 0);

        for (int i : numArray) {
            System.out.printf("%d ", i);
        }

        // Esercizio 9: Crea due array di 5 numeri ciascuno, riempili e crea un terzo array con la somma elemento per elemento.
        Random rand = new Random();

        int arrLength = 5;
        int[] arr1 = new int[arrLength];
        int[] arr2 = new int[arrLength];
        int[] sums = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            arr1[i] = rand.nextInt(100);
            arr2[i] = rand.nextInt(100);
            sums[i]
        }


        input.close();
    }
}