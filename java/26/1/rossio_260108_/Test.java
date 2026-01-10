public class Test {
    public static void Main(String[] args) {
        Classe_itt classe_4G = new Classe_itt("4G");
        Classe_itt classe_4H = new Classe_itt("4H");

        Alunno tizio1 = new Alunno("Tizio", "Tizione", "3 giugno 2008");

        classe_4G.aggiungiAlunno(tizio1);
        
        tizio1.setNome("Tizia");
        tizio1.setCognome("Tiziona");
        tizio1.setDataNascita("5 marzo 403 a.C.");

        classe_4H.aggiungiAlunno(tizio1);
    }
}