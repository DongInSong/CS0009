import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class test {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2014, 5, 25);
        LocalDate date2 = LocalDate.of(2014, 8, 22);
        int a = date1.getDayOfMonth();
        int b = date2.getDayOfMonth();

        if(a==b){
            System.out.println("SAME");
        }
        else System.out.println("NO");
    }
}
