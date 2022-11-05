import java.util.ArrayList;
import java.util.Objects;

public class Playlist {
    private String nomPlaylist;
    private String stylePlaylist;
    private ArrayList<Titre> listeTitres = new ArrayList<>();

    public Playlist() {
    }

    public Playlist(String nomPlaylist, String stylePlaylist, ArrayList<Titre> listeTitres) {
        this.nomPlaylist = nomPlaylist;
        this.stylePlaylist = stylePlaylist;
        this.listeTitres = listeTitres;
    }

    public String getNomPlaylist() {
        return this.nomPlaylist;
    }

    public void setNomPlaylist(String nomPlaylist) {
        this.nomPlaylist = nomPlaylist;
    }

    public String getStylePlaylist() {
        return this.stylePlaylist;
    }

    public void setStylePlaylist(String stylePlaylist) {
        this.stylePlaylist = stylePlaylist;
    }

    public ArrayList<Titre> getListeTitres() {
        return this.listeTitres;
    }

    public void setListeTitres(ArrayList<Titre> listeTitres) {
        this.listeTitres = listeTitres;
    }

    public Playlist nomPlaylist(String nomPlaylist) {
        setNomPlaylist(nomPlaylist);
        return this;
    }

    public Playlist stylePlaylist(String stylePlaylist) {
        setStylePlaylist(stylePlaylist);
        return this;
    }

    public Playlist listeTitres(ArrayList<Titre> listeTitres) {
        setListeTitres(listeTitres);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Playlist)) {
            return false;
        }
        Playlist playlist = (Playlist) o;
        return Objects.equals(nomPlaylist, playlist.nomPlaylist)
                && Objects.equals(stylePlaylist, playlist.stylePlaylist)
                && Objects.equals(listeTitres, playlist.listeTitres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomPlaylist, stylePlaylist, listeTitres);
    }

    @Override
    public String toString() {
        return "{" +
                " nomPlaylist='" + getNomPlaylist() + "'" +
                ", stylePlaylist='" + getStylePlaylist() + "'" +
                ", listeTitres='" + getListeTitres() + "'" +
                "}";
    }

}
