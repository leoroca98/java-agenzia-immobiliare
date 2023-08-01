public class Villa extends Abitazione {
    private int superficieGiardino;

    public Villa(String codice, String indirizzo, String cap, String citta, int superficie, int numVani, int numBagni, int superficieGiardino) {
        super(codice, indirizzo, cap, citta, superficie, numVani, numBagni);
        this.superficieGiardino = superficieGiardino;
    }

    public void reimpostaSuperfici(int nuovaSuperficie, int nuovaSuperficieGiardino) {
        this.superficie = nuovaSuperficie;
        this.superficieGiardino = nuovaSuperficieGiardino;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "superficieGiardino=" + superficieGiardino +
                '}';
    }
}
