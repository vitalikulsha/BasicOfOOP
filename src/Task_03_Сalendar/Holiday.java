package Task_03_Сalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Holiday {
    public static DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    public static List<Calendar> HOLIDAY_LIST = new ArrayList<Calendar>() {
        {
            this.add(new GregorianCalendar(Calendar.YEAR, Calendar.JANUARY, 1));
            this.add(new GregorianCalendar(Calendar.YEAR, Calendar.JANUARY, 2));
            this.add(new GregorianCalendar(Calendar.YEAR, Calendar.JANUARY, 7));
            this.add(new GregorianCalendar(Calendar.YEAR, Calendar.JANUARY, 1));
            this.add(new GregorianCalendar(Calendar.YEAR, Calendar.MAY, 1));
            this.add(new GregorianCalendar(Calendar.YEAR, Calendar.MAY, 9));
            this.add(new GregorianCalendar(Calendar.YEAR, Calendar.JULY, 3));
            this.add(new GregorianCalendar(Calendar.YEAR, Calendar.NOVEMBER, 7));
            this.add(new GregorianCalendar(Calendar.YEAR, Calendar.DECEMBER, 25));
        }
    };
}
