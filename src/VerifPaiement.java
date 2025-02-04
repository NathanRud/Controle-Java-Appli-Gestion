public class VerifPaiement implements ICommandeHandler{
    private ICommandeHandler next;

    @Override
    public void setNext(ICommandeHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(Commande commande) {
        System.out.println("Verification du paiement de la commande " + commande.getId());
        if (next != null) {next.handleRequest(commande);}
    }
}
