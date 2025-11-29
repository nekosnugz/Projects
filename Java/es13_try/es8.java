// Esercizio 8: Scrivi un gestore di menu che gestisce scelte non valide senza far crashare il programma.

import java.util.InputMismatchException;
import java.util.Scanner;

public class es8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		char choice;

		do {
			System.out.print("\nMenu");
			System.out.print("\n1. Opzione a");
			System.out.print("\n2. Opzione b");
			System.out.print("\n3. Opzione c");
			System.out.print("\n4. Opzione d");
			System.out.print("\n5. Opzione e");
			System.out.print("\n6. Opzione f: esci");
			System.out.print("\nFai una scelta: ");

			choice = input.next().charAt(0);
			try {
                switch (choice) {
					case 'a':
					case 'A':
					case '1':
						System.out.print("\nHai scelto l'opzione a");
						break;
					
					case 'b':
					case 'B':
					case '2':
						System.out.print("\nHai scelto l'opzione b");
						break;
					

					case 'c':
					case 'C':
					case '3':
						System.out.print("\nHai scelto l'opzione c");
						break;
					

					case 'd':
					case 'D':
					case '4':
						System.out.print("\nHai scelto l'opzione d");
						break;
					

					case 'e':
					case 'E':
					case '5':
						System.out.print("\nHai scelto l'opzione e");
						break;
					

					case 'f':
					case 'F':
					case '6':
						System.out.print("\nHai scelto l'opzione f");
						System.out.print("\nArrivederci");
						break;
					default:
						throw new InputMismatchException("\nValore non valido, riprovare");
			}
            } catch (Exception e) {
				System.out.println(e);
			}
		} while (choice != 'f' || choice != 'F' || choice != '6');
        
        input.close();	
    }
}