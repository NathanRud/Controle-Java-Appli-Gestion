import java.util.ArrayList;
import java.util.List;

public class Commande {
    private int id;
    private List<String> produits;
    private double prixTotal;
    private String statut;
    private List<IObserver> observateurs = new ArrayList<>();
    private String moyenpaiement;

    private Commande (Builder builder) {
    this.id = builder.id;
    this.produits = builder.produits;
    this.prixTotal = builder.prixTotal;
    this.statut = builder.statut;
    this.moyenpaiement = builder.moyenpaiement;
    }

    public void ajouterObservateur (IObserver o) {
        observateurs.add(o);
    }

    public void notifObs(){
        for (IObserver o : observateurs) {
            o.maj(this.statut);
        }
    }

    public void setStatut(String statut) {
        this.statut = statut;
        notifObs();
    }

    public int getId() {
        return id;
    }

    public List<String> getProduits() {
        return produits;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public String getStatut() {
        return statut;
    }

    public static class Builder {
        private int id;
        private List<String> produits = new ArrayList<>();
        private double prixTotal = 0.0;
        private String statut;
        private String moyenpaiement;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder addproduits(String produit, double prix,String moyenpaiement) {
            this.produits.add(produit);
            this.prixTotal += prix;
            this.moyenpaiement = moyenpaiement;
            return this;
        }




        public Builder statut(String statut) {
            this.statut = statut;
            return this;
        }

        public Commande build() {
            return new Commande(this);
        }
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", produits=" + produits +
                ", prixTotal=" + prixTotal +
                ", statut='" + statut + '\'' +
                ", observateurs=" + observateurs +
                ", moyenpaiement='" + moyenpaiement + '\'' +
                '}';
    }
}
