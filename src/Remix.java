import java.time.LocalDate;

public class Remix extends Titre {
    public Artist artisteRemixant;

    public Remix(int duree, String nomTitre, String styleTitre, LocalDate dateSortie, Artist artist,
            Artist artisteRemixant) {
        super(duree, nomTitre, styleTitre, dateSortie, artist);
        this.artisteRemixant = artisteRemixant;
    }

}
