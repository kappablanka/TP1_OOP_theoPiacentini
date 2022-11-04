import java.sql.Date;
import java.util.Objects;

public class Titre {
    private int duree;
    private String nomTitre;
    private String styleTitre;
    private Date dateSortie;

    public Titre() {
    }

    public Titre(int duree, String nomTitre, String styleTitre, Date dateSortie) {
        this.duree = duree;
        this.nomTitre = nomTitre;
        this.styleTitre = styleTitre;
        this.dateSortie = dateSortie;
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

    public Date getDateSortie() {
        return this.dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Titre)) {
            return false;
        }
        Titre titre = (Titre) o;
        return duree == titre.duree && Objects.equals(nomTitre, titre.nomTitre)
                && Objects.equals(styleTitre, titre.styleTitre);
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
