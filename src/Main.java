public class Main {
    public static void main(String[] args) {
        AgenziaImmobiliare agenzia = new AgenziaImmobiliare();

        Box box1 = new Box("B001", "Via Roma 1", "00100", "Roma", 20, 1);
        Abitazione abitazione1 = new Abitazione("A001", "Via Napoli 2", "00100", "Roma", 100, 4, 2);
        Villa villa1 = new Villa("V001", "Via Milano 3", "00100", "Roma", 200, 6, 4, 500);

        agenzia.aggiungiImmobile(box1);
        agenzia.aggiungiImmobile(abitazione1);
        agenzia.aggiungiImmobile(villa1);

        // Test del metodo reimpostaSuperfici per Villa (overload)
        villa1.reimpostaSuperfici(250, 600);

        // Test del metodo incrementaPersoneInteressate per Villa
        villa1.incrementaPersoneInteressate();
        villa1.incrementaPersoneInteressate();
        villa1.incrementaPersoneInteressate();

        // Test dei metodi toString() delle classi
        System.out.println("Descrizione Box:");
        System.out.println(box1);

        System.out.println("Descrizione Abitazione:");
        System.out.println(abitazione1);

        System.out.println("Descrizione Villa:");
        System.out.println(villa1);

        // Test del metodo cercaImmobilePerCodice
        String codiceCerca = "A001";
        Immobile immobileTrovato = agenzia.cercaImmobilePerCodice(codiceCerca);
        if (immobileTrovato != null) {
            System.out.println("Immobile trovato con codice " + codiceCerca + ":");
            System.out.println(immobileTrovato);
            System.out.println("Nessun immobile trovato con codice " + codiceCerca + ".");
        }
    }
}