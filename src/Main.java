public class Main {
    public static void main(String[] args) {

        Commande commande = new Commande.Builder()
                .id(1)
                .addproduits("Ecran", 120.00, "paypal")
                .addproduits("Souris", 100.00, "carte")
                .statut("En attente")
                .build();


        Client client1 = new Client("Toto");
        Client client2 = new Client("Popo");

        commande.ajouterObservateur(client1);
        commande.ajouterObservateur(client2);

        System.out.println(commande.toString());

        TransacLogger transaclogger = STransacLogger.getInstance();

        ICommandeHandler stock = new VerifStock();
        ICommandeHandler paiementHandler = new VerifPaiement();
        ICommandeHandler envoi = new EnvoiCommande();

        stock.setNext(paiementHandler);
        paiementHandler.setNext(envoi);

        stock.handleRequest(commande);
        commande.setStatut("Expédiée");
        transaclogger.historique();
        System.out.println(commande.toString());
    }
}
