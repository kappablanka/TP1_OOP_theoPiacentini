import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Titre {
    private int duree;
    private String nomTitre;
    private String styleTitre;
    private LocalDate dateSortie;
    private Artist artist;
    private ArrayList<Artist> featurings = new ArrayList<>();

    public Titre(int duree, String nomTitre, String styleTitre, LocalDate dateSortie, Artist artist) {
        this.duree = duree;
        this.nomTitre = nomTitre;
        this.styleTitre = styleTitre;
        this.dateSortie = dateSortie;
        this.artist = artist;
    }

    public Titre(int duree, String nomTitre, String styleTitre, LocalDate dateSortie, Artist artist,
            ArrayList<Artist> featuring) {
        this(duree, nomTitre, styleTitre, dateSortie, artist);
        this.featurings = featuring;
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

    public LocalDate getDateSortie() {
        return this.dateSortie;
    }

    public void setDateSortie(LocalDate dateSortie) {
        this.dateSortie = dateSortie;
    }

    public Artist getArtist() {
        return this.artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public ArrayList<Artist> getFeaturings() {
        return this.featurings;
    }

    public void setFeaturings(ArrayList<Artist> featurings) {
        this.featurings = featurings;
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

    public Titre dateSortie(LocalDate dateSortie) {
        setDateSortie(dateSortie);
        return this;
    }

    public Titre artist(Artist artist) {
        setArtist(artist);
        return this;
    }

    public Titre featurings(ArrayList<Artist> featurings) {
        setFeaturings(featurings);
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
                && Objects.equals(artist, titre.artist) && Objects.equals(featurings, titre.featurings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duree, nomTitre, styleTitre, dateSortie, artist, featurings);
    }

    @Override
    public String toString() {
        return "{" +
                " duree='" + getDuree() + "'" +
                ", nomTitre='" + getNomTitre() + "'" +
                ", styleTitre='" + getStyleTitre() + "'" +
                ", dateSortie='" + getDateSortie() + "'" +
                ", artist='" + getArtist() + "'" +
                ", featurings='" + getFeaturings() + "'" +
                "}";
    }

    public abstract void estEcoute(double prixAbonnementPar5minutes);

}
