public class EnvoiCommande implements ICommandeHandler {
    @Override
    public void setNext(ICommandeHandler next) {
    }

    @Override
    public void handleRequest(Commande commande) {
        System.out.println("Commande envoyée");
    }
}
