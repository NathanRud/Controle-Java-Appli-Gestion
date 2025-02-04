public interface ICommandeHandler {

    void setNext(ICommandeHandler next);

    void handleRequest(Commande commande);

}
