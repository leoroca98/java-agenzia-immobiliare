public class Immobile {
    protected String codice;
    protected String indirizzo;
    protected String cap;

    protected String citta;
    protected int superficie;
    protected int personeInteressate;

    public Immobile(String codice, String indirizzo, String cap, String citta, int superficie) {
        this.codice = codice;
        this.indirizzo = indirizzo;
        this.cap = cap;
        this.citta = citta;
        this.superficie = superficie;
        this.personeInteressate = 0;

    }
    public void incrementaPersoneInteressate() {
        personeInteressate++;
    }

    @Override
    public String toString() {
        return "Immobile{" +
                "codice='" + codice + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", cap='" + cap + '\'' +
                ", citta='" + citta + '\'' +
                ", superficie=" + superficie +
                ", personeInteressate=" + personeInteressate +
                '}';
    }
}




