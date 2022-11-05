import java.sql.Date;
import java.util.Objects;

public abstract class Titre {
    private int duree;
    private String nomTitre;
    private String styleTitre;
    private Date dateSortie;
    private Artist artist;
    private double solde;

    public Titre() {
    }

    public Titre(int duree, String nomTitre, String styleTitre, Date dateSortie, Artist artist, double solde) {
        this.duree = duree;
        this.nomTitre = nomTitre;
        this.styleTitre = styleTitre;
        this.dateSortie = dateSortie;
        this.artist = artist;
        this.solde = solde;
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

    public Artist getArtist() {
        return this.artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public double getSolde() {
        return this.solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Titre duree(int duree) {
        setDuree(duree);
        return this;
    }

    public Titre nomTitre(String nomTitre) {
        setNomTitre(nomTitre);
        return this;
    }

    public Titre styleTitre(String styleTitre) {
        setStyleTitre(styleTitre);
        return this;
    }

    public Titre dateSortie(Date dateSortie) {
        setDateSortie(dateSortie);
        return this;
    }

    public Titre artist(Artist artist) {
        setArtist(artist);
        return this;
    }

    public Titre solde(double solde) {
        setSolde(solde);
        return this;
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
                && Objects.equals(styleTitre, titre.styleTitre) && Objects.equals(dateSortie, titre.dateSortie)
                && Objects.equals(artist, titre.artist) && solde == titre.solde;
    }

    @Override
    public int hashCode() {
        return Objects.hash(duree, nomTitre, styleTitre, dateSortie, artist, solde);
    }

    @Override
    public String toString() {
        return "{" +
                " duree='" + getDuree() + "'" +
                ", nomTitre='" + getNomTitre() + "'" +
                ", styleTitre='" + getStyleTitre() + "'" +
                ", dateSortie='" + getDateSortie() + "'" +
                ", artist='" + getArtist() + "'" +
                ", solde='" + getSolde() + "'" +
                "}";
    }

}
