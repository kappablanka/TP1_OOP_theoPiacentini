import java.util.Date;

public class Remix extends Titre {
    public Artist artisteRemixant;

    public Remix(int duree, String nomTitre, String styleTitre, Date dateSortie, Artist artist, double solde,
            Artist artisteRemixant) {
        super(duree, nomTitre, styleTitre, dateSortie, artisteRemixant, solde);
        this.artisteRemixant = artisteRemixant;
    }

}
