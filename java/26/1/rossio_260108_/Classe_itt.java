public class Classe_itt {
    private Alunno[] alunni;
    private String nome;
    private int numAlunni = 0, maxAlunni = 30;
    private static int numClassi = 0;

    public Classe_itt(String nome) {
        this.nome = nome;
        this.alunni = new Alunno[maxAlunni];
        numClassi++;
    }

    public Alunno[] getAlunni() {
        return alunni;
    }

    public void aggiungiAlunno(Alunno a) {
        if (numAlunni < maxAlunni) this.alunni[numAlunni++] = a;
    }

    public String getNome() {
        return this.nome;
    }

    public int getNumAlunni() {
        return this.numAlunni;
    }

    public static int getNumClassi() {
        return numClassi;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




}