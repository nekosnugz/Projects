public class Test {
    public static void main(String[] args) {
        Classe_itt classe_4G = new Classe_itt("4G");
        Classe_itt classe_4H = new Classe_itt("4H");

        Alunno tizio1 = new Alunno("Tizio", "Tizione", "3 giugno 2008");

        classe_4G.aggiungiAlunno(new Alunno(tizio1));
        // System.out.println(classe_4G.toString());
        
        tizio1.setNome("Tizia");
        tizio1.setCognome("Tiziona");
        tizio1.setDataNascita("5 marzo 403 a.C.");

        classe_4G.aggiungiAlunno(new Alunno(tizio1));
        classe_4H.aggiungiAlunno(new Alunno(tizio1));

        System.out.println(classe_4G.toString());
        System.out.println(classe_4H.toString());
        
        classe_4G.cercaAlunno(tizio1);
        classe_4H.cercaAlunno(tizio1);
        
        classe_4G.eliminaAlunno(tizio1);
        classe_4G.eliminaAlunno(tizio1);
        classe_4H.eliminaAlunno(tizio1);
        
        System.out.println(classe_4G.toString());
        System.out.println(classe_4H.toString());
    }
}