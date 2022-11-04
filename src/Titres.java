import java.util.Objects;

public class Titres {
    private int duree;
    private String nomTitre;
    private String styleTitre;

    public Titres() {
    }

    public Titres(int duree, String nomTitre, String styleTitre) {
        this.duree = duree;
        this.nomTitre = nomTitre;
        this.styleTitre = styleTitre;
    }

    public int getDuree() {
        return this.duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getNomTitre() {
        return this.nomTitre;
    }

    public void setNomTitre(String nomTitre) {
        this.nomTitre = nomTitre;
    }

    public String getStyleTitre() {
        return this.styleTitre;
    }

    public void setStyleTitre(String styleTitre) {
        this.styleTitre = styleTitre;
    }

    public Titres duree(int duree) {
        setDuree(duree);
        return this;
    }

    public Titres nomTitre(String nomTitre) {
        setNomTitre(nomTitre);
        return this;
    }

    public Titres styleTitre(String styleTitre) {
        setStyleTitre(styleTitre);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Titres)) {
            return false;
        }
        Titres titres = (Titres) o;
        return duree == titres.duree && Objects.equals(nomTitre, titres.nomTitre)
                && Objects.equals(styleTitre, titres.styleTitre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duree, nomTitre, styleTitre);
    }

    @Override
    public String toString() {
        return "{" +
                " duree='" + getDuree() + "'" +
                ", nomTitre='" + getNomTitre() + "'" +
                ", styleTitre='" + getStyleTitre() + "'" +
                "}";
    }

}
