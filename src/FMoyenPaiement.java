public class FMoyenPaiement {
    public static IMoyenPaiement getMoyenPaiement(String type) {
        switch (type) {
            case "paypal":
                return new Paypal();
            case "carte":
                return new CarteBancaire();
            case "crypto" :
                return new Crypto();
            default:
                return null;
        }
    }
}
