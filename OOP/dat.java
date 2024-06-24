import java.util.*;
import java.util.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class dat  {

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("The date is "+d);

        LocalDate d1 = LocalDate.now();
        System.out.println("The date is "+d1);

        LocalDateTime d2 = LocalDateTime.now();
        System.out.println("The date is "+d2);

        String d3 = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(d2);
        System.out.println("The date is "+d3);


    }
  
    
}
