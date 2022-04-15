import java.time.*;
import java.util.Calendar;

public class asgmt_5_4 {

    public static void main(String args[]) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        Calendar today = Calendar.getInstance();

        System.out.println(today.get(Calendar.YEAR));
        System.out.println(today.get(Calendar.MONTH)); 
        System.out.println(today.get(Calendar.DATE));
        System.out.println(today.get(Calendar.DAY_OF_WEEK)); 

        System.out.println(date); 
        System.out.println(time);
        System.out.println(dateTime); 
        System.out.println(zonedDateTime);
    }
}
