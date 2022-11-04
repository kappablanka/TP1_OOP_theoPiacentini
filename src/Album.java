import java.util.Objects;

public class Album {
    private String nomAlbum;
    private String styleAlbum;

    public Album(String nomAlbum, String styleAlbum) {
        this.nomAlbum = nomAlbum;
        this.styleAlbum = styleAlbum;
    }

    public Album() {
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Album)) {
            return false;
        }
        Album album = (Album) o;
        return Objects.equals(nomAlbum, album.nomAlbum) && Objects.equals(styleAlbum, album.styleAlbum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomAlbum, styleAlbum);
    }

    @Override
    public String toString() {
        return "{" +
                " nomAlbum='" + getNomAlbum() + "'" +
                ", styleAlbum='" + getStyleAlbum() + "'" +
                "}";
    }

}
