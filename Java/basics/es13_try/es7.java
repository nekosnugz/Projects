// Esercizio 7: Crea un convertitore di temperature che gestisce input non numerici e continua finché l'utente non inserisce 'quit'.

import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class es7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command;
		char unit;
		double temperature, converted;
		
        do {
            System.out.print("\nInsert a temperature without unit or type 'quit' to exit...");
            command = input.nextLine().trim();

            try {
				if (command.equals("quit")) System.out.print("Goodbye");
				else {
					temperature = Double.parseDouble(command);

					System.out.print("\nConvert to Celsius or Fahrenheit? (c/f) ");
					unit = input.next().toLowerCase().charAt(0);
					input.nextLine();

					if (unit == 'c') {
						converted = (temperature - 32) * 5 / 9;
						System.out.printf("\n%.2f°f -> %.2f°C", temperature, converted);
					} else if (unit == 'f') {
						converted = temperature * 9 / 5 + 32;
						System.out.printf("\n%.2f°C -> %.2f°f", temperature, converted);
					} else throw new InputMismatchException();
				}
			} catch (InputMismatchException e) {
				System.out.println(e);
			} catch (IllegalFormatException e) {
				System.out.println("Insert a number!\nIf you inserted a decimal number, try swapping ',' with '.' or viceversa.");
			}

		} while (command.equals("quit"));
		
        input.close(); 
    }
}