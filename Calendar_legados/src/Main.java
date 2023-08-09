import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        System.out.println("Acrescentando horas na data usando o calendar:");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
//        calendar.add(Calendar.HOUR_OF_DAY, 4);
//        d = calendar.getTime();

        System.out.println("recebendo datas:");

        int minutes = calendar.get(Calendar.MINUTE);
        int month = 1 + calendar.get(Calendar.MONTH);// precisa do 1 porque começa a contar do 0
        System.out.println("Minutes: " + minutes);
        System.out.println("MONTH " + month);




        System.out.println(sdf.format(d));



    }
}