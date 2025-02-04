import java.util.ArrayList;
import java.util.List;

public class TransacLogger {
    private List<String> history = new ArrayList<String>();

    public TransacLogger() {
        this.log("Transaction Logger ");
    }

    private String prependLog(String value) {
        StringBuilder result = new StringBuilder();

        result.append("Log n°: ");
        result.append(this.history.size());
        result.append(" => ");
        result.append(value);

        return result.toString();
    }

    public void log(String value) {
        String formattedLog = this.prependLog(value);
        this.history.add(formattedLog);
        System.out.println(formattedLog);
    }

    public List<String> historique() {
        return new ArrayList<>(this.history);
    }

}