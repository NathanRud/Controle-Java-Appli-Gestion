public class Paypal implements IMoyenPaiement{
    @Override
    public void payer(double montant) {
        System.out.println(montant + "€ par Paypal");
    }
}
