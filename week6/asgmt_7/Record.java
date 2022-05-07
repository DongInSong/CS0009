import java.util.Date;

public class Record {
    String type;
    Date date;
    int amount;

    public Record(String type, Date today, int amount) {
        this.type = type;
        this.date = today;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }
}