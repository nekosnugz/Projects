import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class playlist {

    private static void add(String temp1, String temp2, String temp3, String[] arr1, String[] arr2, String[] arr3) {
        try {
            int index = -1;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i].isEmpty()) {
                    index = i;
                    break;
                }
            }

            if (index == -1) throw new ArrayStoreException("Max arguments reached");

            arr1[index] = temp1;
            arr2[index] = temp2;
            arr3[index] = temp3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void remove(char choice, String toRemove, String[] arr1, String[] arr2, String[] arr3) {
        boolean canBeRemoved = false;
        int index = -1;
        switch (choice) {
            case 'a':
            case '1':
                for (int i = 0; i < arr1.length; i++) {
                    if (toRemove.equals(arr1[i])) {
                        index = i;
                        canBeRemoved = true;
                        break;
                    }
                }
                break;
            case 'b':
            case '2':
                for (int i = 0; i < arr1.length; i++) {
                    if (toRemove.equals(arr2[i])) {
                        index = i;
                        canBeRemoved = true;
                        break;
                    }
                }
                break;
            case 'c':
            case '3':
                for (int i = 0; i < arr1.length; i++) {
                    if (toRemove.equals(arr3[i])) {
                        index = i;
                        canBeRemoved = true;
                        break;
                    }
                }
                break;
        }

        if (!canBeRemoved) System.out.print("\nDoesn't exist");
        else {
            arr1[index] = null;
            arr2[index] = null;
            arr3[index] = null;
        }
    }

    public static void shift(int clear, String[] arr) {
        for (int i = clear; i < arr.length - 1; i++) {
            String temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void shaw(String[] arr1, String[] arr2, String[] arr3) {
        int[] index = new int[arr1.length];

        for (int i = 0; i < index.length; i++) index[i] = i;
        
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].isEmpty()) break;
            System.out.printf("%s-%s-%s\n", arr1[i], arr2[i], arr3[i]);
        }
        System.out.println();
    }

    public static void save(String filename, String[] arr1, String[] arr2, String[] arr3) {
        try (FileWriter file = new FileWriter(new File(filename), false)) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i].isEmpty()) break;
                file.append(arr1[i] + "-" + arr2[i] + "-" +  arr3[i] + "\n");
            }
        } catch (IOException e) {
            System.out.println("Save error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void load(String filename, String[] arr1, String[] arr2, String[] arr3) {
        String[] rep1, rep2, rep3;
        int i = 0;
        rep1 = new String[arr1.length];
        rep2 = new String[arr1.length];
        rep3 = new String[arr1.length];

        try (Scanner file = new Scanner(new File(filename))) {
            while (file.hasNextLine()) {
                String[] get = file.nextLine().trim().split("-");
                if (get.length != 3) throw new Exception("File not correctly formatted");
                rep1[i] = get[0];
                rep2[i] = get[2];
                rep3[i++] = get[2];
            }

            arr1 = rep1;
            arr2 = rep2;
            arr3 = rep3;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAX_LENGTH = 10;
        String[] attr1 = new String[MAX_LENGTH];
        String[] attr2 = new String[MAX_LENGTH];
        String[] attr3 = new String[MAX_LENGTH];

        char choice = ' ';
        char choice2;
        String temp1, temp2, temp3;


        while (true) {
            System.out.println("a. add");
            System.out.println("b. remove");
            System.out.println("c. show");
            System.out.println("d. save");
            System.out.println("e. load");
            System.out.println("f. exit");
            System.out.print("\nchoice = ");
            choice = input.nextLine().trim().toLowerCase().charAt(0);

            try {
                switch (choice) {
                    case 'a':
                    case '1':
                        System.out.print("\nAttribute 1: ");
                        temp1 = input.nextLine().trim().replace("-", "_");

                        System.out.print("\nAttribute 2: ");
                        temp2 = input.nextLine().trim().replace("-", "_");

                        System.out.print("\nAttribute 3: ");
                        temp3 = input.nextLine().trim().replace("-", "_");

                        add(temp1, temp2, temp3, attr1, attr2, attr3);

                        break;

                    case 'b':
                    case '2':
                        System.out.print("\nRemove by attribute 1, 2 or 3? ");
                        choice2 = input.nextLine().toLowerCase().trim().charAt(0);

                        System.out.print("\nContent: ");
                        temp1 = input.nextLine().trim();

                        remove(choice2, temp1, attr1, attr3, attr3);
                        break;

                    case 'c':
                    case '3':
                        shaw(attr1, attr3, attr3);
                        break;

                    case '4':
                    case 'd':
                        System.out.print("\nFilename: ");
                        temp1 = input.next().trim();
                        if (temp1.isEmpty()) throw new InputMismatchException("Empty filename");
                        save(temp1, attr1, attr2, attr3);
                        break;

                    case 'e':
                    case '6':
                        System.out.print("\nFilename: ");
                        temp1 = input.next().trim();
                        if (temp1.isEmpty()) throw new InputMismatchException("Empty filename");
                        load(temp1, attr1, attr2, attr3);
                        break;

                    case 'f':
                    case '7':
                        System.out.print("\nGoodbye\n");
                        break;

                    default:
                        throw new InputMismatchException("Option not available");
                }
                if (choice == 'f' || choice == '7') break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        }

        input.close();
    }
}
