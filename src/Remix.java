import java.time.LocalDate;

public class Remix extends Titre {
    private Artist artisteRemixant;

    public Remix(int duree, String nomTitre, String styleTitre, LocalDate dateSortie, Artist artist,
            Artist artisteRemixant) {
        super(duree, nomTitre, styleTitre, dateSortie, artist);
        this.artisteRemixant = artisteRemixant;
    }

    public Remix(int duree, String nomTitre, String styleTitre, LocalDate dateSortie, Artist artist,
            ArrayList<Artist> featuring, Artist artisteRemixant) {
        super(duree, nomTitre, styleTitre, dateSortie, artist, featuring);
        this.artisteRemixant = artisteRemixant;
    }

    public void estEcoute(double prixAbonnementPar5minutes) {
        setSolde(this.getDuree() / 300 * prixAbonnementPar5minutes * 2 / 3
                / (1 + this.getFeaturings().size()));
        for (Artist a : this.getFeaturings()) {
            a.setSolde(this.getSolde() + a.getSolde());
        }
    }

    public Artist getArtisteRemixant() {
        return this.artisteRemixant;
    }

    public void setArtisteRemixant(Artist artisteRemixant) {
        this.artisteRemixant = artisteRemixant;
    }

}
