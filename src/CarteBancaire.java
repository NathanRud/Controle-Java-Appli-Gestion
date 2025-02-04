public class CarteBancaire implements IMoyenPaiement {
    @Override
    public void payer(double montant) {
        System.out.println(montant+"€ par carte bancaire.");
    }
}
