import java.util.ArrayList;
import java.util.List;

public class AgenziaImmobiliare {
    private List<Immobile> listaImmobili;

    public AgenziaImmobiliare() {
        listaImmobili = new ArrayList<>();
    }

    public void aggiungiImmobile(Immobile immobile) {
        listaImmobili.add(immobile);
    }

    public Immobile cercaImmobilePerCodice(String codice) {
        for (Immobile immobile : listaImmobili) {
            if (immobile.codice.equals(codice)) {
                return immobile;
            }
        }
        return null;
    }

    public Immobile immobileConMaggioreInteresse() {
        Immobile immobileMaggioreInteresse = null;
        int maxInteressati = 0;

        for (Immobile immobile : listaImmobili) {
            if (immobile.numPersoneInteressate > maxInteressati) {
                maxInteressati = immobile.numPersoneInteressate;
                immobileMaggioreInteresse = immobile;
            }
        }

        return immobileMaggioreInteresse;
    }
}