import java.util.ArrayList;
import java.util.Objects;

public class Album {
    private String nomAlbum;
    private String styleAlbum;
    private ArrayList<Titre> listeTitres = new ArrayList<>();

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

    public ArrayList<Titre> getListeTitres() {
        return this.listeTitres;
    }

    public void setListeTitres(ArrayList<Titre> listeTitres) {
        this.listeTitres = listeTitres;
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
                && Objects.equals(listeTitres, album.listeTitres);
    }

    @Override
    public String toString() {
        return "{" +
                " nomAlbum='" + getNomAlbum() + "'" +
                ", styleAlbum='" + getStyleAlbum() + "'" +
                ", listeTitres='" + getListeTitres() + "'" +
                "}";
    }

}
