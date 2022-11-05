
import java.time.LocalDate;
import java.util.ArrayList;

public class Reprise extends Titre {
    private Artist artistReprenant;

    public Reprise(int duree, String nomTitre, String styleTitre, LocalDate dateSortie, Artist artist,
            Artist artistReprenant) {
        super(duree, nomTitre, styleTitre, dateSortie, artist);
        this.artistReprenant = artistReprenant;
    }

    public Reprise(int duree, String nomTitre, String styleTitre, LocalDate dateSortie, Artist artist,
            ArrayList<Artist> featuring, Artist artistReprenant) {
        super(duree, nomTitre, styleTitre, dateSortie, artist, featuring);
        this.artistReprenant = artistReprenant;
    }

    public void estEcoute(double prixAbonnementPar5minutes) {
        double part = (float) this.getDuree() / 300 * prixAbonnementPar5minutes * 2 / 3
                / (2 + this.getFeaturings().size());
        this.getArtist().ajouterSolde(part);
        this.artistReprenant.ajouterSolde(part);
        for (Artist a : this.getFeaturings()) {
            a.ajouterSolde(part);
        }
    }

    public Artist getArtistReprenant() {
        return this.artistReprenant;
    }

    public void setArtistReprenant(Artist artistReprenant) {
        this.artistReprenant = artistReprenant;
    }

}
