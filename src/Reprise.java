
import java.time.LocalDate;
import java.util.Objects;

public class Reprise extends Titre {
    private Artist artistReprenant;

    public Reprise(int duree, String nomTitre, String styleTitre, LocalDate dateSortie, Artist artist, double solde,
            Artist artistReprenant) {
        super(duree, nomTitre, styleTitre, dateSortie, artistReprenant);
        this.artistReprenant = artistReprenant;
    }

    public Artist getArtistReprenant() {
        return this.artistReprenant;
    }

    public void setArtistReprenant(Artist artistReprenant) {
        this.artistReprenant = artistReprenant;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Reprise)) {
            return false;
        }
        Reprise reprise = (Reprise) o;
        return Objects.equals(artistReprenant, reprise.artistReprenant);
    }

}
