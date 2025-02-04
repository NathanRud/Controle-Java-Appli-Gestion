public class Crypto implements IMoyenPaiement{
    @Override
    public void payer(double montant) {
        System.out.println(montant + "€ payer par Cryptomonnaie");
    }
}
