import java.time.LocalDate;
import java.util.ArrayList;

public class Original extends Titre {
    public Original(int duree, String nomTitre, String styleTitre, LocalDate dateSortie, Artist artist) {
        super(duree, nomTitre, styleTitre, dateSortie, artist);
    }

    public Original(int duree, String nomTitre, String styleTitre, LocalDate dateSortie, Artist artist,
            ArrayList<Artist> featuring) {
        super(duree, nomTitre, styleTitre, dateSortie, artist, featuring);
    }

    public void estEcoute(double prixAbonnementPar5minutes) {
        setSolde(this.getDuree() / 300 * prixAbonnementPar5minutes * 2 / 3
                / (1 + this.getFeaturings().size()));
        for (Artist a : this.getFeaturings()) {
            a.setSolde(this.getSolde() + a.getSolde());
        }
    }
}