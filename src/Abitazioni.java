public class Abitazioni extends Immobile{
    int numVani;
    int numBagni;
    public Abitazioni(String codice, String indirizzo, String cap, String citta, int superficie) {
        super(codice, indirizzo, cap, citta, superficie);
        this.numVani = numVani;
        this.numBagni = numBagni;
     }

    @Override
    public String toString() {
        return "Abitazioni{" +
                "numVani=" + numVani +
                ", numBagni=" + numBagni +
                '}';
    }
}

