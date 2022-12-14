import java.util.Objects;

public class Client extends Utilisateur {
    private String typeAbbonement;
    private int dureeEcoute = 0;
    private double soldeDue = 0;
    private double prixAbonnementPar5minutes;

    public Client(String typeAbbonement, String pseudo, String hashMotDePasse) {
        super(pseudo, hashMotDePasse);
        this.typeAbbonement = typeAbbonement;
        if (typeAbbonement == "normal") {
            this.prixAbonnementPar5minutes = 0.02;
        } else if (typeAbbonement == "premium") {
            this.prixAbonnementPar5minutes = 0.03;
        }
    }

    public String getTypeAbbonement() {
        return this.typeAbbonement;
    }

    public void setTypeAbbonement(String typeAbbonement) {
        this.typeAbbonement = typeAbbonement;
    }

    public int getDureeEcoute() {
        return this.dureeEcoute;
    }

    public void setDureeEcoute(int dureeEcoute) {
        this.dureeEcoute = dureeEcoute;
    }

    public double getSoldeDue() {
        return this.soldeDue;
    }

    public void setSoldeDue(double soldeDue) {
        this.soldeDue = soldeDue;
    }

    public Client typeAbbonement(String typeAbbonement) {
        setTypeAbbonement(typeAbbonement);
        return this;
    }

    public Client dureeEcoute(int dureeEcoute) {
        setDureeEcoute(dureeEcoute);
        return this;
    }

    public Client soldeDue(double soldeDue) {
        setSoldeDue(soldeDue);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Client)) {
            return false;
        }
        Client client = (Client) o;
        return Objects.equals(typeAbbonement, client.typeAbbonement) && dureeEcoute == client.dureeEcoute
                && soldeDue == client.soldeDue;
    }

    @Override
    public String toString() {
        return "{" +
                " typeAbbonement='" + getTypeAbbonement() + "'" +
                ", dureeEcoute='" + getDureeEcoute() + "'" +
                ", soldeDue='" + getSoldeDue() + "'" +
                "}";
    }

    public void ecoute(Titre titre) {
        this.dureeEcoute += titre.getDuree();
        this.soldeDue += (titre.getDuree() / 300) * prixAbonnementPar5minutes;
        titre.estEcoute(prixAbonnementPar5minutes);
        System.out.println(this.getPseudo() + "?? ??couter le titre:" + titre.getNomTitre());
    }

    public void ecoute(Playlist playlist) {
        for (Titre t : playlist.getListeTitres()) {
            t.estEcoute(prixAbonnementPar5minutes);
        }
        System.out.println(this.getPseudo() + "?? ??couter la playlist:" + playlist.getNomPlaylist());
    }

    public void ecoute(Album album) {
        for (Titre t : album.getListeTitres()) {
            t.estEcoute(prixAbonnementPar5minutes);
        }
        System.out.println(this.getPseudo() + "?? ??couter la playlist:" + album.getNomAlbum());
    }

}