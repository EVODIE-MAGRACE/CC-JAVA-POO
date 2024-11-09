public class Client {
    private String nom;
    private String ville;
    private Compte comptePrive;
    private Compte compteEpargne;

    public Client(String nom, String ville, double soldePrive, double soldeEpargne) {
        this.nom = nom;
        this.ville = ville;
        this.comptePrive = new Compte(soldePrive, 0.01);
        this.compteEpargne = new Compte(soldeEpargne, 0.02);
    }

    public void afficherSoldes() {
        System.out.println("Client " + nom + " de " + ville);
        System.out.println("Compte privé: " + comptePrive.getSolde() + " francs");
        System.out.println("Compte d'épargne: " + compteEpargne.getSolde() + " francs");
    }

    public void appliquerInterets() {
        comptePrive.appliquerInteret();
        compteEpargne.appliquerInteret();
    }
}
