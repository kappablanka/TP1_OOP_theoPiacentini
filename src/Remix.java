import java.time.LocalDate;
import java.util.ArrayList;

public class Remix extends Titre {
    private Artist artisteRemixant;
    private Titre chansonOriginal;

    public Remix(int duree, String nomTitre, String styleTitre, LocalDate dateSortie, Artist artist,
            Artist artisteRemixant, Titre chansonOriginal) {
        super(duree, nomTitre, styleTitre, dateSortie, artist);
        this.artisteRemixant = artisteRemixant;
        this.chansonOriginal = chansonOriginal;
    }

    public Remix(int duree, String nomTitre, String styleTitre, LocalDate dateSortie, Artist artist,
            ArrayList<Artist> featuring, Artist artisteRemixant, Titre chansonOriginal) {
        super(duree, nomTitre, styleTitre, dateSortie, artist, featuring);
        this.artisteRemixant = artisteRemixant;
        this.chansonOriginal = chansonOriginal;
    }

    public void estEcoute(double prixAbonnementPar5minutes) {
        double part = (float) this.getDuree() / 300 * prixAbonnementPar5minutes * 2 / 3
                / (2 + this.getFeaturings().size());
        this.getArtist().ajouterSolde(part);
        this.artisteRemixant.ajouterSolde(part);
        for (Artist a : this.getFeaturings()) {
            a.ajouterSolde(part);
        }
    }

    public Artist getArtisteRemixant() {
        return this.artisteRemixant;
    }

    public void setArtisteRemixant(Artist artisteRemixant) {
        this.artisteRemixant = artisteRemixant;
    }

    public Titre getChansonOriginal() {
        return this.chansonOriginal;
    }

    public void setChansonOriginal(Titre chansonOriginal) {
        this.chansonOriginal = chansonOriginal;
    }

}
