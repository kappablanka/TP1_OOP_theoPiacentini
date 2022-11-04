import java.util.Objects;

public class Compilation {
    private String nomCompilation;
    private String styleCompilation;

    public Compilation() {
    }

    public Compilation(String nomCompilation, String styleCompilation) {
        this.nomCompilation = nomCompilation;
        this.styleCompilation = styleCompilation;
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

    public Compilation nomCompilation(String nomCompilation) {
        setNomCompilation(nomCompilation);
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
                && Objects.equals(styleCompilation, compilation.styleCompilation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomCompilation, styleCompilation);
    }

    @Override
    public String toString() {
        return "{" +
                " nomCompilation='" + getNomCompilation() + "'" +
                ", styleCompilation='" + getStyleCompilation() + "'" +
                "}";
    }
}