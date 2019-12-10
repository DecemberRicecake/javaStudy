import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class llsl {
    public static void main(String[] args) {
        Date d =  new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(d);

        System.out.println(sdf1.format(d));

        String time = "2019-08-28 10:57:54";
        try {
            System.out.println(sdf1.parse(time));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
