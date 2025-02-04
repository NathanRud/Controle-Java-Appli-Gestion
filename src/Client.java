public class Client implements IObserver{
private String nom;


    public Client(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return  nom ;
    }

    @Override
    public void maj(String statut) {
        System.out.println("Bonjour " + this.nom + ", la commande est " + statut);
    }
}
