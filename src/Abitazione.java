public class Abitazione extends Immobile {
    private int numVani;
    private int numBagni;

    public Abitazione(String codice, String indirizzo, String cap, String citta, int superficie, int numVani, int numBagni) {
        super(codice, indirizzo, cap, citta, superficie);
        this.numVani = numVani;
        this.numBagni = numBagni;
    }

    @Override
    public String toString() {
        return "Abitazione{" +
                "numVani=" + numVani +
                ", numBagni=" + numBagni +
                '}';
    }
}