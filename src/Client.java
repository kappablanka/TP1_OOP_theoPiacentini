import java.util.Objects;

public class Client extends Utilisateur {
    private String typeAbbonement;

    public Client() {
    }

    public Client(String typeAbbonement) {
        this.typeAbbonement = typeAbbonement;
    }

    public String getTypeAbbonement() {
        return this.typeAbbonement;
    }

    public void setTypeAbbonement(String typeAbbonement) {
        this.typeAbbonement = typeAbbonement;
    }

    public Client typeAbbonement(String typeAbbonement) {
        setTypeAbbonement(typeAbbonement);
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
        return Objects.equals(typeAbbonement, client.typeAbbonement);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(typeAbbonement);
    }

    @Override
    public String toString() {
        return "{" +
                " typeAbbonement='" + getTypeAbbonement() + "'" +
                "}";
    }

}