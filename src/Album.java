import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Album {
    private String nomAlbum;
    private String styleAlbum;
    private ArrayList<Titre> listeTitres = new ArrayList<>();
    private LocalDate dateSortie;
    private Artist artist;

    public Album(String nomAlbum, String styleAlbum, LocalDate dateSortie, Artist artist) {
        this.nomAlbum = nomAlbum;
        this.styleAlbum = styleAlbum;
        this.dateSortie = dateSortie;
        this.artist = artist;
        this.artist.getListeAlbums().add(this);
    }

    public Album() {
    }

    public Album(String nomAlbum, String styleAlbum, ArrayList<Titre> listeTitres, LocalDate dateSortie,
            Artist artist) {
        this.nomAlbum = nomAlbum;
        this.styleAlbum = styleAlbum;
        this.listeTitres = listeTitres;
        this.dateSortie = dateSortie;
        this.artist = artist;
    }

    public String getNomAlbum() {
        return this.nomAlbum;
    }

    public void setNomAlbum(String nomAlbum) {
        this.nomAlbum = nomAlbum;
    }

    public String getStyleAlbum() {
        return this.styleAlbum;
    }

    public void setStyleAlbum(String styleAlbum) {
        this.styleAlbum = styleAlbum;
    }

    public ArrayList<Titre> getListeTitres() {
        return this.listeTitres;
    }

    public void setListeTitres(ArrayList<Titre> listeTitres) {
        this.listeTitres = listeTitres;
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

    public Album nomAlbum(String nomAlbum) {
        setNomAlbum(nomAlbum);
        return this;
    }

    public Album styleAlbum(String styleAlbum) {
        setStyleAlbum(styleAlbum);
        return this;
    }

    public Album listeTitres(ArrayList<Titre> listeTitres) {
        setListeTitres(listeTitres);
        return this;
    }

    public Album dateSortie(LocalDate dateSortie) {
        setDateSortie(dateSortie);
        return this;
    }

    public Album artist(Artist artist) {
        setArtist(artist);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Album)) {
            return false;
        }
        Album album = (Album) o;
        return Objects.equals(nomAlbum, album.nomAlbum) && Objects.equals(styleAlbum, album.styleAlbum)
                && Objects.equals(listeTitres, album.listeTitres) && Objects.equals(dateSortie, album.dateSortie)
                && Objects.equals(artist, album.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomAlbum, styleAlbum, listeTitres, dateSortie, artist);
    }

    @Override
    public String toString() {
        return "{" +
                " nomAlbum='" + getNomAlbum() + "'" +

                ", artist='" + getArtist() + "'" +
                "}";
    }

    public void ajouterTitre(Titre titre) {
        this.listeTitres.add(titre);
    }

}
