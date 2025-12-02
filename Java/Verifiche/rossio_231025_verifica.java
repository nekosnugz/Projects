import java.util.Scanner;
import java.util.Random;

// Funziona tranne segnati
public class rossio_231025_verifica {
    public static void fillArray(int[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) a[i] = rand.nextInt(99) + 1;        
    }

    public static void printArray(int[] a) {
        for (int i : a) System.out.printf("%d ", i);
    }

    public static int arrMin(int[] a) {
        int m = a[0];   // m = minimo
        for (int i : a) m = m > i ? i : m;
        return m;
    }

    public static int arrMax(int[] a) {
        int M = a[0];   // M = massimo
        for (int i : a) M = M < i ? i : M;
        return M;
    }

    public static double arrAvrg(int[] a) {
        double av = 0;  // av = media
        for (int i : a) av += i;
        av /= a.length;
        return av;
    }

    public static int arrSum(int[] a) {
        int s = 0;  // s = somma
        for (int i : a) s += i;
        return s;
    }

    public static int linearSearch(int[] a, int n) {
        for (int i = 0; i < a.length; i++) if (n == a[i]) return i;
        return -1;
    }

    public static void rightShift(int[] a, int n) {
        int temp;
        for (int j = 0; j < n; j++) {
            for (int i = a.length-2; i > 0; i--) {
                temp = a[i-1];
                a[i-1] = a[i];
                a[i] = temp;
            }
            temp = a[0];
            a[0] = a[a.length - 1];
            a[a.length - 1] = temp;
        }
    }

    public static int[] bubbleSort(int[] a) { // Non funziona -> array non viene modificato
        int[] array = a;
        int temp;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j+1]) {
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        return array;
    }

    public static int[] arrMulti3(int[] a) {
        int s = 0; // s = grandezza nuovo array
        int ind = 0; // ind = indice
        int[] res;
        for (int i : a) if (i % 3 == 0 && i % 2 == 0) s++;
        res = new int[s];
        for (int i : a) if (i % 3 == 0 && i % 2 == 0) {
            res[ind++] = i;
        }

        // for (int i : a) if (i % 3 == 0) s++;
        // res = new int[s];
        // for (int i : a) if (i % 3 == 0) {
        //     res[ind++] = i;
        // } -->

        return res;
    }

    public static int binarySearch(int[] a, int n) { // Non funziona -> vedi bubbleSort
        int left = 0;
        int right = a.length - 1;
        int mid;
        
        // for (int i = 0; i < a.length; i++) {
        //     if (a[i] > a[i+1]) return -2;
        // }
        
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i+1]) return -2;
        }

        do {
            mid = (right - left) / 2 + left;
            if (n == a[mid]) return mid;
            else if (n > a[mid]) left = mid + 1;
            else if (n < a[mid]) right = mid - 1;
            System.out.printf("\nLeft: %d\nRight: %d", left, right);
        } while (mid != 1);

        return -1;        
    }

    public static int[] getHigherThan(int[] a, int k) {
        int s = 0; // s = grandezza array risltante
        int ind = 0; // ind = indice
        int[] res;
        for (int i : a) if (i > k) s++;

        res = new int[s];
        for (int i : a) if (i > k) res[ind++] = i;
        // --> manca rimozione dei duplicati

        return res;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size, choice;
        int num, min, max, sum, index;
        double avrg;
        int[] arr, onlyMult3, onlyHigherThanK;

        do {
            System.out.print("\nInserisci un numero maggiore di 20: ");
            size = input.nextInt();
            input.nextLine();

            if (size <= 20) System.out.print("\nIl numero inserito e' minore o uguale a 20, riprovare.");
        } while (size <= 20);

        arr = new int[size];
        fillArray(arr);
        
        do {
            System.out.println("\n\nGestione array");
            System.out.println("1. Visualizza l'array");
            System.out.println("2. Calcola il massimo e il minimo");
            System.out.println("3. Calcola la media e la somma degli elementi dell'array");
            System.out.println("4. Cerca un numero (ricerca lineare)");
            System.out.println("5. Shifta di 'n' posizioni a destra l'array");
            System.out.println("6. Ordina l'array");
            System.out.println("7. Crea e stampa un array solo con numeri multipli di 3");
            System.out.println("8. Cerca un numero (ricerca binaria)");
            System.out.println("9. Crea un array senza elementi minori di un numero dato");
            System.out.println("10. Esci");
            System.out.print("\nScegli un opzione: ");

            choice = input.nextInt();
            input.nextLine();

            // fillArray(arr); -->
            System.out.println();

            switch (choice) {
                case 1: // Visualizza l'array
                    printArray(arr);
                    break;

                case 2: // Calcola il massimo e il minimo
                    min = arrMin(arr);
                    max = arrMax(arr);
                    System.out.printf("\nValore minimo: %d", min);
                    System.out.printf("\nValore massimo: %d", max);
                    break;
                
                case 3: // Calcola la media e la somma degli elementi dell'array
                    avrg = arrAvrg(arr);
                    sum = arrSum(arr);
                    System.out.printf("\nMedia dei valori: %.2f", avrg);
                    System.out.printf("\nSomma dei valori: %d", sum);
                    break;
                    
                case 4: // Cerca un numero (ricerca lineare)
                    System.out.print("\nInserisci un numero da cercare: ");
                    num = input.nextInt();
                    input.nextLine();

                    index = linearSearch(arr, num);
                    
                    if (index == -1) System.out.printf("\nIl numero %d non e' presente nell'array", num);
                    else System.out.printf("\nLa prima occorrenza del numero %d e' nella %d° posizione", num, index + 1);
                    break;

                case 5: // Shifta di 'n' posizioni a destra l'array
                    System.out.print("\nInserisci il numero di posizioni che vuoi shiftare: ");
                    num = input.nextInt();
                    input.nextLine();

                    System.out.print("\nArray: ");
                    printArray(arr);

                    rightShift(arr, num);

                    System.out.printf("\nArray shiftato di %d posizioni a destra: ", num);
                    printArray(arr);
                    break;

                case 6: // Ordina l'array
                    System.out.printf("\nArray prima dell'ordinamento: ");
                    printArray(arr);
                    
                    arr = bubbleSort(arr);
                    
                    System.out.printf("\nArray dopo l'ordinamento: ");
                    printArray(arr);
                    break;

                case 7: // Crea e stampa un array solo con numeri multipli di 3
                    onlyMult3 = arrMulti3(arr);
                    System.out.print("\nArray solo con multipli di 3: ");
                    printArray(onlyMult3);
                    break;

                case 8: // Cerca un numero (ricerca binaria)
                    System.out.print("\nInserisci un numero da cercare: ");
                    num = input.nextInt();
                    input.nextLine();

                    index = binarySearch(arr, num);
                    
                    if (index == -1) System.out.printf("\nIl numero %d non e' presente nell'array", num);
                    else if (index == -2) System.out.print("\nRiordinare l'array prima di chiamare questa funzione");
                    else System.out.printf("\nLa prima occorrenza del numero %d e' nella %d° posizione", num, index+1);
                    break;

                case 9: // Crea un array senza elementi minori di un numero dato
                    System.out.print("\nInserisci un numero filtro: ");
                    num = input.nextInt();
                    input.nextLine();

                    onlyHigherThanK = getHigherThan(arr, num);
                    
                    System.out.printf("\nArray con numeri maggiori di %d: ", num);
                    printArray(onlyHigherThanK);
                    break;

                case 10: // Esci
                System.out.println("\nArrivederci!");
                    break;
                    
                default:
                    System.out.print("\nValore non valido, riprovare");
            }


        } while (choice != 10);


        input.close();
    }
}