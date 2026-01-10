public class Alunno {
    private String nome, cognome, dataNascita;
    private static int numAlunni = 0;

    public Alunno(String nome, String cognome, String dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        numAlunni++;
    }

    public Alunno(Alunno alunno) {
        this(alunno.nome, alunno.cognome, alunno.dataNascita);
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public int getNumAlunni() {
        return numAlunni;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setDataNascita(String annoNascita) {
        this.dataNascita = annoNascita;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " - Cognome: " + this.cognome + " - Data di nascita: " + this.dataNascita;
    }

    public boolean compare(Alunno cmp) {
        return this.nome == cmp.nome && this.cognome == cmp.cognome && this.dataNascita == cmp.dataNascita;
    }

}