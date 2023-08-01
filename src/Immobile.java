public class Immobile {
    protected String codice;
    protected String indirizzo;
    protected String cap;
    protected String citta;
    protected int superficie;
    protected int numPersoneInteressate;

    public Immobile(String codice, String indirizzo, String cap, String citta, int superficie) {
        this.codice = codice;
        this.indirizzo = indirizzo;
        this.cap = cap;
        this.citta = citta;
        this.superficie = superficie;
        this.numPersoneInteressate = 0;
    }

    public void incrementaPersoneInteressate() {
        numPersoneInteressate++;
    }

    public void reimpostaSuperfici(int nuovaSuperficie) {
        this.superficie = nuovaSuperficie;
    }

    @Override
    public String toString() {
        return "Immobile{" +
                "codice='" + codice + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", cap='" + cap + '\'' +
                ", citta='" + citta + '\'' +
                ", superficie=" + superficie +
                ", numPersoneInteressate=" + numPersoneInteressate +
                '}';
    }
}
