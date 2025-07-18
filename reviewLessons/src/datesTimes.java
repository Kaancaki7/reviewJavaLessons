import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class datesTimes {

    public static void main(String[] args) {


        //LocalDate , LocalTime , LocalDateTime , UTC timestamp

        LocalDate date = LocalDate.now(); //şuanın tarihini verir
        LocalTime time = LocalTime.now();  //şuanın zamanını verir
        LocalDateTime dateTime = LocalDateTime.now();  //şuanın zamanını ve tarihini verir.

        //UTC timestamp
        Instant instant = Instant.now();  //utc askeri zaman

        System.out.println(date + " / " + time);
        System.out.println(dateTime);

        System.out.println(instant);

        //Custom format
        LocalDateTime dateTime1 = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); //tarihin hangi formatta yazılmasını istediğini seçersin
        String newDateTime = dateTime1.format(formatter);

        System.out.println(newDateTime);

        //*********************************************************************************************************

        LocalDate date1 = LocalDate.of(2025, 12, 31);
        LocalDateTime dateTime2 = LocalDateTime.of(2025, 12, 31, 23 , 59, 59);
        LocalDateTime dateTime3 = LocalDateTime.of(2026, 1, 1, 0 , 0, 7);

        System.out.println(date1);
        System.out.println(dateTime2);

        if(dateTime2.isBefore(dateTime3)){
            System.out.println(dateTime2 + " is earlier than " + dateTime3);
        }
        else if(dateTime2.isAfter(dateTime3)){
            System.out.println(dateTime2 + " is later than " +  dateTime3);
        }
        else if(dateTime2.isEqual(dateTime3)){
            System.out.println(dateTime2 + " is equal to " + dateTime3);
        }

    }
}
