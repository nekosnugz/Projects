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

    @Override
    public String toString() {
        String res = "Nome classe: " + this.nome + " - Numero alunni: " + this.numAlunni + "\nAlunni: ";
        for (Alunno a : this.alunni) {
            if (a == null) break;
            res += "\n\t" + a.toString();
        }
        return res;
    }

    public boolean cercaAlunno(Alunno alunno) {
        for (Alunno a : alunni) {
            if (alunno.equals(a)) {
                System.out.println("L'alunno è presente nella classe " + this.nome);
                return true;
            }
        }

        System.out.println("L'alunno non esiste nella classe " + this.nome);
        return false;
    }

    public void eliminaAlunno(Alunno alunno) {
        for (int i = 0; i < this.numAlunni; i++) {
            if (this.alunni[i] != null && this.alunni[i].compare(alunno)) {
                System.out.println("Alunno eliminato");
                this.alunni[i] = null;
                for (; i < this.numAlunni - 1; i++) this.alunni[i] = this.alunni[i + 1];
                this.numAlunni--;
            }
        }
    }
}