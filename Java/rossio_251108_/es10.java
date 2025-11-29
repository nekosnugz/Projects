// Esercizio 10: Scrivi un programma che simula prelievo bancomat gestendo importi non validi e saldo insufficiente.

import java.util.Scanner;
import java.util.Random;

public class es10 {
	public static double generateBalance(double max) {
		Random r = new Random();
		return r.nextDouble() * max;
	}

	public static boolean tryWithdraw(double b, double w) {
		return w <= b;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double balance = generateBalance(10000);
		double withdraw;
		boolean canWithdraw;
		
		System.out.print("Bancomat");
		System.out.printf("\nSaldo corrente: €%.2f", balance);
		System.out.print("\nInserisci somma da prelevare: €");
		withdraw = input.nextDouble();

		try {
			canWithdraw = tryWithdraw(balance,withdraw);
			if (canWithdraw) {
				balance -= withdraw;
				System.out.printf("\nPrelievo di €%.2f riuscito!", withdraw);			
				System.out.printf("\nSaldo residuo: €%.2f", balance);			
			} else throw new Exception("Non puoi prelevare più di quanto hai sul tuo conto!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			input.close();
		}
	}
}
