import java.util.Objects;

public class Reprise extends Titre {
    private Artist artistReprenant;

    public Reprise() {
    }

    public Reprise(Artist artistReprenant) {
        this.artistReprenant = artistReprenant;
    }

    public Artist getArtistReprenant() {
        return this.artistReprenant;
    }

    public void setArtistReprenant(Artist artistReprenant) {
        this.artistReprenant = artistReprenant;
    }

    public Reprise artistReprenant(Artist artistReprenant) {
        setArtistReprenant(artistReprenant);
        return this;
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

    @Override
    public int hashCode() {
        return Objects.hashCode(artistReprenant);
    }

    @Override
    public String toString() {
        return "{" +
                " artistReprenant='" + getArtistReprenant() + "'" +
                "}";
    }

}
