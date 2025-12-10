import java.util.Scanner;
import java.util.Random;

public class es7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Esercizio 7: Genera due array ordinati, uniscili (fai il merge) in uno nuovo ordinato.
        int num, temp;
		int[] nums1, nums2, merged;
		
		System.out.print("\nInserisci un numero: ");
		num = input.nextInt();
		input.nextLine();
		
		nums1 = new int[num];
		nums2 = new int[num];
		merged = new int[num*2];
		
		for (int i = 0; i < num; i++) {
            nums1[i] = rand.nextInt(100);
            nums2[i] = rand.nextInt(100);
            merged[i] = nums1[i];
            merged[nums1.length + i - 1] = nums2[i];
        }

        for (int i = 0; i < merged.length; i++) {
            for (int j = 0; j < merged.length; j++) {
                if (merged[i] < merged[j]) {
                    temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }

        System.out.print("\nArray 1: ");
        for (int i : nums1) System.out.printf("%d ", i);

        System.out.print("\nArray 2: ");
        for (int i : nums2) System.out.printf("%d ", i);
        
        System.out.print("\nUnione di array ordinato: ");
        for (int i : merged) System.out.printf("%d ", i);

        input.close();
    }
}