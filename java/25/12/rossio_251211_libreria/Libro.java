public class Libro {
    private String titolo, autore;
    private int anno, pagine;
    private double prezzo;
    private boolean disponibile;

    public Libro(String titolo, String autore, int anno, int pagine, double prezzo, boolean disponibile) {
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
        this.pagine = pagine;
        this.disponibile = disponibile;
    }

    public Libro(String titolo, String autore, int anno, int pagine, double prezzo) {
        this(titolo, autore, anno, pagine, prezzo, true);
    }


    public Libro(String titolo, String autore, int anno) {
        this(titolo, autore, anno, 0, 0, true);
    }

    public Libro(String titolo, String autore) {

    }
    
    public Libro(Libro libro) {
        this(libro.titolo, libro.autore, libro.anno, libro.pagine, libro.prezzo, libro.disponibile);
    }
    

    public Libro() {
        this("", "", 0, 0, 0, false);
    }

    public String getTitolo() {
        return this.titolo;
    }

    public String getAutore() {
        return this.autore;
    }

    public int getAnno() {
        return this.anno;
    }

    public int getPagine() {
        return this.pagine;
    }

    public double getPrezzo() {
        return this.prezzo;
    }

    public boolean getDisponibile() {
        return this.disponibile;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setAnno(int anno) {
        if (validaAnno(anno)) this.anno = anno;;
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    @Override
    public String toString() {
        return "Titolo: " + this.titolo + " - Autore: " + this.autore + " - Anno: " + this.anno + " - Pagine: "
        + this.pagine + " - Prezzo: $" + this.prezzo + " - Disponibile : " + ((this.disponibile) ? "Sì" : "No");
    }

    public void presta() {
        if (this.disponibile) this.disponibile = false;
        else System.out.println("Il libro è già stato prestato");
    }

    public void restituisci() {
        if (!this.disponibile) this.disponibile = true;
        else System.out.println("Il libro è già stato restituito");
    }

    public void applicaSconto(double percentuale) {
        this.prezzo -= this.prezzo * percentuale;
    }

    public boolean confrontaAnno(Libro libro) {
        return this.anno >= libro.anno;
    }

    public void stampaDatiCompleti() {
        System.out.println(this.toString());
    }

    private boolean validaAnno(int anno) {
        return anno >= 1450 && anno <= 2025;
    }


}