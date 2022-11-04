import java.util.Objects;

public class Playlist {
    private String nomPlaylist;
    private String stylePlaylist;

    public Playlist() {
    }

    public Playlist(String nomPlaylist, String stylePlaylist) {
        this.nomPlaylist = nomPlaylist;
        this.stylePlaylist = stylePlaylist;
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Playlist)) {
            return false;
        }
        Playlist playlist = (Playlist) o;
        return Objects.equals(nomPlaylist, playlist.nomPlaylist)
                && Objects.equals(stylePlaylist, playlist.stylePlaylist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomPlaylist, stylePlaylist);
    }

    @Override
    public String toString() {
        return "{" +
                " nomPlaylist='" + getNomPlaylist() + "'" +
                ", stylePlaylist='" + getStylePlaylist() + "'" +
                "}";
    }

}
