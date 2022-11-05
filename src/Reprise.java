
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
        setSolde(this.getDuree() / 300 * prixAbonnementPar5minutes * 2 / 3
                / (1 + this.getFeaturings().size()));
        for (Artist a : this.getFeaturings()) {
            a.setSolde(this.getSolde() + a.getSolde());
        }
    }

    public Artist getArtistReprenant() {
        return this.artistReprenant;
    }

    public void setArtistReprenant(Artist artistReprenant) {
        this.artistReprenant = artistReprenant;
    }

}
