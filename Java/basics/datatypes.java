public class datatypes {
    public static void main(String[] args) {
        // Esercizio 1: Dichiara una variabile intera, assegnale il valore 42 e stampala.
        int num = 42;
        System.out.println("La variabile \"num\" vale " + num + ".");

        // Esercizio 2: Dichiara tre variabili: una stringa con il tuo nome, un intero con la tua età, un double con la tua altezza. Stampale tutte.
        String name = "Orlando";
        int age = 16;
        double height = 1.85f;
        System.out.println(String.format("Sono %s, ho %d anni e sono alto %.2f metri.", name, age, height)); // String.format() e' simile al printf di C

        // Esercizio 3: Dichiara due variabili carattere e stampale una accanto all'altra.
        char char1 = 'o', char2 = 'r';
        System.out.println(String.format("I caratteri sono %c%c", char1, char2));

        // Esercizio 4: Dichiara una variabile boolean con valore true e una con valore false. Stampale
        boolean isTrue = true, isFalse = false;
        System.out.println(String.format("Variabile con valore true: %b;\nVariabile con valore false: %b", isTrue, isFalse));

        // Esercizio 5: Dichiara una variabile intera senza inizializzarla, poi assegnale un valore e stampala
        int notInit;
        notInit = 4;
        System.out.println(String.format("Variabile \"notInit\": %d", notInit));

        // Esercizio 6: Dichiara due variabili double, assegna loro i valori 3.14 e 2.71, poi stampale con una descrizione.
        double pi = 3.14f, e = 2.71;
        System.out.println(pi + " : Pi greco, rapporto tra una circonferenza e il suo diametro.");
        System.out.println(e + " : Numero di Nepero, ottenuto dall'espressione (1 + 1/n)^n, dove n tende all'infinito.");

        // Esercizio 7: Crea variabili per memorizzare il titolo di un libro, l'autore, l'anno di pubblicazione e il prezzo. Stampale in formato ordinato.
        String bookName = "Divina Commedia", author = "Durante Alighieri";
        int releaseDate = 1472;
        double bookPrice = 24.99f;
        System.out.println(String.format("Libro: %s\nAutore: %s\nAnno di pubblicazione: %d\nPrezzo: %.2f", bookName, author, releaseDate, bookPrice));

        // Esercizio 8: Dichiara una variabile char per memorizzare un voto (A, B, C, D, F) e una String per il commento. Stampale.
        char grade = 'B';
        String gradeComment = "Attenzione alle frazioni!";
        System.out.println(String.format("Voto : %c\nCommento: %s", grade, gradeComment));

        // Esercizio 9: Dichiara tre variabili intere sulla stessa riga e assegna loro valori diversi. Stampale.
        int num1 = 26, num2 = 9, num3 = 2008;
        System.out.println(String.format("Numero 1: %d\nNumero 2: %d\nNumero 3: %d", num1, num2, num3));

    }
}
