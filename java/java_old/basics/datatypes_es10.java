public class datatypes_es10 {
    public static void main(String[] args) {
        // Esercizio 10: Crea un programma che simula una carta d'identità: dichiara variabili per nome, cognome, età, codice fiscale (String) e stampale in formato carta d'identità
        String name = "Orlando", surname = "Rossi", taxID = "RSSRND08P26B729S";
        int age = 16;
        System.out.println(String.format("Codice Fiscale: %s", taxID));
        System.out.println(String.format("Cognome: %s", surname));
        System.out.println(String.format("Nome: %s", name));
        System.out.println(String.format("Eta': %d", age));
        
    }
}
