public class STransacLogger {
    private static TransacLogger instance;

    private STransacLogger() {
    }

    public static TransacLogger getInstance() {
        if(instance == null) {
            instance = new TransacLogger();
        }

        return instance;
    }
}