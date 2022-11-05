import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Artist daftPunk = new Artist("Daft Punk", "daft", "1234");
        Original somethingAboutUs = new Original(150, "something about us", "electro", LocalDate.of(2001, 1, 1),
                daftPunk);
        System.out.println("somethingAboutUs = " + somethingAboutUs + "\n");
        System.out.println("daftPunk = " + daftPunk + "\n");

        Album discovery = new Album("Discovery", "electro", LocalDate.of(2002, 1, 1), daftPunk);
        discovery.ajouterTitre(somethingAboutUs);

        System.out.println("discovery = " + discovery + "\n");
        System.out.println("daftPunk = " + daftPunk + "\n");

        Client client1 = new Client("normal", "user", "exampleMDP");
        System.out.println("client1 = " + client1 + "\n");
        client1.ecoute(somethingAboutUs);
        System.out.println("client1 = " + client1 + "\n");
        System.out.println("somethingAboutUs = " + somethingAboutUs + "\n");
        System.out.println("daftPunk = " + daftPunk + "\n");

        Artist justice = new Artist("Justice", "just", "1234");
        Remix remixSomething = new Remix(300, "something about us", "electro", LocalDate.of(2001, 1, 1),
                daftPunk, justice, somethingAboutUs);
        client1.ecoute(remixSomething);
        System.out.println("client1 = " + client1 + "\n");
        System.out.println("daftPunk = " + daftPunk + "\n");
        System.out.println("justice = " + justice + "\n");
        client1.ecoute(remixSomething);
        client1.ecoute(remixSomething);
        client1.ecoute(remixSomething);
        System.out.println("client1 = " + client1 + "\n");
        System.out.println("daftPunk = " + daftPunk + "\n");
        System.out.println("justice = " + justice + "\n");

    }
}
