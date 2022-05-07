import java.util.Comparator;
import java.util.Date;

public class RecordComparator implements Comparator<Record> {
    public int compare(Record rec1, Record rec2)
    {
        Date date1 = rec1.getDate();
        Date date2 = rec2.getDate();

        if (date1.compareTo(date2) < 0) return -1;
        else if (date1.compareTo(date2) > 0) return 1;
        else return 0;
    }
}