import java.util.Objects;

public abstract class Utilisateur {
    private String Pseudo;
    private String hashMotDePasse;

    public Utilisateur() {
    }

    public Utilisateur(String Pseudo, String hashMotDePasse) {
        this.Pseudo = Pseudo;
        this.hashMotDePasse = hashMotDePasse;
    }

    public String getPseudo() {
        return this.Pseudo;
    }

    public void setPseudo(String Pseudo) {
        this.Pseudo = Pseudo;
    }

    public String getHashMotDePasse() {
        return this.hashMotDePasse;
    }

    public void setHashMotDePasse(String hashMotDePasse) {
        this.hashMotDePasse = hashMotDePasse;
    }

    public Utilisateur Pseudo(String Pseudo) {
        setPseudo(Pseudo);
        return this;
    }

    public Utilisateur hashMotDePasse(String hashMotDePasse) {
        setHashMotDePasse(hashMotDePasse);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Utilisateur)) {
            return false;
        }
        Utilisateur utilisateur = (Utilisateur) o;
        return Objects.equals(Pseudo, utilisateur.Pseudo) && Objects.equals(hashMotDePasse, utilisateur.hashMotDePasse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Pseudo, hashMotDePasse);
    }

    @Override
    public String toString() {
        return "{" +
                " Pseudo='" + getPseudo() + "'" +
                ", hashMotDePasse='" + getHashMotDePasse() + "'" +
                "}";
    }

}
