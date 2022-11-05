import java.util.ArrayList;
import java.util.Objects;

public class Artist extends Utilisateur {
    private String nom;
    private ArrayList<Titre> listeTitres = new ArrayList<>();
    private ArrayList<Album> listeAlbums = new ArrayList<>();
    private ArrayList<Playlist> listePlaylist = new ArrayList<>();
    private double solde;

    public Artist(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Titre> getListeTitres() {
        return this.listeTitres;
    }

    public void setListeTitres(ArrayList<Titre> listeTitres) {
        this.listeTitres = listeTitres;
    }

    public ArrayList<Album> getListeAlbums() {
        return this.listeAlbums;
    }

    public void setListeAlbums(ArrayList<Album> listeAlbums) {
        this.listeAlbums = listeAlbums;
    }

    public ArrayList<Playlist> getListePlaylist() {
        return this.listePlaylist;
    }

    public void setListePlaylist(ArrayList<Playlist> listePlaylist) {
        this.listePlaylist = listePlaylist;
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
                ", listeTitres='" + getListeTitres() + "'" +
                ", listeAlbums='" + getListeAlbums() + "'" +
                ", listePlaylist='" + getListePlaylist() + "'" +
                "}";
    }

    public void ajouterAlbum(Album album) {
        listeAlbums.add(album);
        for (Titre t : album.getListeTitres()) {
            if (!listeTitres.contains(t)) {
                this.listeTitres.add(t);
            }
        }
    }

    public boolean retirerArgent(double montant) {
        boolean flagValide = false;
        if (montant <= solde) {
            this.solde -= montant;
            flagValide = true;
        }
        return flagValide;
    }

    public void mettreAjourSolde() {
        int somme = 0;
        for (Titre t : listeTitres) {
            somme += t.getSolde();
            t.setSolde(0);
        }
        solde += somme;

    }
}
