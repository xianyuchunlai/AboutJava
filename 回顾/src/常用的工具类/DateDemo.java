package 常用的工具类;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {


        Date date = new Date();
        System.out.println(date.toString());

        long l = System.currentTimeMillis();
        System.out.println(l);

        DateFormat df = new SimpleDateFormat("yyyy,MM,DD  hh:mm:ss");
        String time = df.format(l);
        System.out.println(time);


    }
}
