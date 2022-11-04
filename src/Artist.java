import java.util.Objects;

public class Artist extends Utilisateur {
    public String nom;

    public Artist() {
    }

    public Artist(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Artist)) {
            return false;
        }
        Artist artist = (Artist) o;
        return Objects.equals(nom, artist.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nom);
    }

    @Override
    public String toString() {
        return "{" +
                " nom='" + getNom() + "'" +
                "}";
    }

}
