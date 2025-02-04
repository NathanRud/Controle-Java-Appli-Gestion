public class VerifStock implements ICommandeHandler{
    private ICommandeHandler next;

    @Override
    public void setNext(ICommandeHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(Commande commande) {
        System.out.println("Recherche dans les stocks pour la commande " + commande.getId());
        if (next != null) {next.handleRequest(commande);}
    }
}
