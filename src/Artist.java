import java.util.ArrayList;
import java.util.Objects;

public class Artist extends Utilisateur {
    private String nom;
    private ArrayList<Titre> listeTitres = new ArrayList<>();
    private ArrayList<Album> listeAlbums = new ArrayList<>();
    private ArrayList<Playlist> listePlaylist = new ArrayList<>();
    private double solde = 0;

    public Artist() {
    }

    public Artist(String nom, String pseudo, String hashMotDePasse) {
        super(pseudo, hashMotDePasse);
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

    public double getSolde() {
        return this.solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Artist nom(String nom) {
        setNom(nom);
        return this;
    }

    public Artist listeTitres(ArrayList<Titre> listeTitres) {
        setListeTitres(listeTitres);
        return this;
    }

    public Artist listeAlbums(ArrayList<Album> listeAlbums) {
        setListeAlbums(listeAlbums);
        return this;
    }

    public Artist listePlaylist(ArrayList<Playlist> listePlaylist) {
        setListePlaylist(listePlaylist);
        return this;
    }

    public Artist solde(double solde) {
        setSolde(solde);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Artist)) {
            return false;
        }
        Artist artist = (Artist) o;
        return Objects.equals(nom, artist.nom) && Objects.equals(listeTitres, artist.listeTitres)
                && Objects.equals(listeAlbums, artist.listeAlbums)
                && Objects.equals(listePlaylist, artist.listePlaylist) && solde == artist.solde;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, listeTitres, listeAlbums, listePlaylist, solde);
    }

    @Override
    public String toString() {
        return "{" +
                " nom='" + getNom() + "'" +
                ", solde='" + getSolde() + "'" +
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
        } else {
            System.out.println("Erreur solde trop petit ! solde = " + this.solde);
        }
        return flagValide;
    }

    public void ajouterSolde(double valeur) {
        this.solde = valeur;
    }
}
