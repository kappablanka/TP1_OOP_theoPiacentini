import java.util.ArrayList;
import java.util.Objects;

public class Compilation {
    private String nomCompilation;
    private String styleCompilation;
    private ArrayList<Titre> listeTitres = new ArrayList<>();

    public Compilation() {
    }

    public Compilation(String nomCompilation, String styleCompilation, ArrayList<Titre> listeTitres) {
        this.nomCompilation = nomCompilation;
        this.styleCompilation = styleCompilation;
        this.listeTitres = listeTitres;
    }

    public String getNomCompilation() {
        return this.nomCompilation;
    }

    public void setNomCompilation(String nomCompilation) {
        this.nomCompilation = nomCompilation;
    }

    public String getStyleCompilation() {
        return this.styleCompilation;
    }

    public void setStyleCompilation(String styleCompilation) {
        this.styleCompilation = styleCompilation;
    }

    public ArrayList<Titre> getListeTitres() {
        return this.listeTitres;
    }

    public void setListeTitres(ArrayList<Titre> listeTitres) {
        this.listeTitres = listeTitres;
    }

    public Compilation nomCompilation(String nomCompilation) {
        setNomCompilation(nomCompilation);
        return this;
    }

    public Compilation styleCompilation(String styleCompilation) {
        setStyleCompilation(styleCompilation);
        return this;
    }

    public Compilation listeTitres(ArrayList<Titre> listeTitres) {
        setListeTitres(listeTitres);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Compilation)) {
            return false;
        }
        Compilation compilation = (Compilation) o;
        return Objects.equals(nomCompilation, compilation.nomCompilation)
                && Objects.equals(styleCompilation, compilation.styleCompilation)
                && Objects.equals(listeTitres, compilation.listeTitres);
    }

    @Override
    public String toString() {
        return "{" +
                " nomCompilation='" + getNomCompilation() + "'" +
                ", styleCompilation='" + getStyleCompilation() + "'" +
                ", listeTitres='" + getListeTitres() + "'" +
                "}";
    }

}