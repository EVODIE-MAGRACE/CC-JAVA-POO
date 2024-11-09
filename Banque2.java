public class Banque2 {
    public static void main(String[] args) {
        Client client1 = new Client("Pedro", "Genève", 1000.0, 2000.0);
        Client client2 = new Client("Alexandra", "Lausanne", 3000.0, 4000.0);

        System.out.println("Données avant le bouclage des comptes:");
        client1.afficherSoldes();
        client2.afficherSoldes();

        client1.appliquerInterets();
        client2.appliquerInterets();

        System.out.println("\nDonnées après le bouclage des comptes:");
        client1.afficherSoldes();
        client2.afficherSoldes();
    }
}
