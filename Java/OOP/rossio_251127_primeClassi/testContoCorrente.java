public class testContoCorrente {
    public static void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente("Melchiorre", "50067", 305.63);
        ContoCorrente conto2 = new ContoCorrente("Ezechiele", "78923", 7891.34);

        conto1.visualizzaSaldo();
        conto2.visualizzaSaldo();

        conto1.deposita(127.62);
        conto2.preleva(60);

        conto1.visualizzaSaldo();
        conto2.visualizzaSaldo();

        try {
            conto1.preleva(23497.32);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        conto1.visualizzaSaldo();
        conto2.visualizzaSaldo();


    }
}