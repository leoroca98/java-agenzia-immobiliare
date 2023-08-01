public class Box extends Immobile{
    int numPostiAuto;
    public Box(String codice, String indirizzo, String cap, String citta, int superficie) {
        super(codice, indirizzo, cap, citta, superficie);
        this.numPostiAuto = numPostiAuto;

    }

    @Override
    public String toString() {
        return "Box{" +
                "numPostiAuto=" + numPostiAuto +
                '}';
    }
}
