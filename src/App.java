import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Artist daftPunk = new Artist("Daft Punk");
        Original somethingAboutUs = new Original(150, "something about us", "electro", LocalDate.of(2001, 1, 1),
                daftPunk, 0);
    }
}
