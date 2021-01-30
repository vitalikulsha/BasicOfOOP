package Task_03_Сalendar;

import java.text.ParseException;

import static Task_03_Сalendar.DatabaseHoliday.*;

/*
Задача 3.
Создать класс Календарь с внутренним классом,
с помощью объектов которого можно хранить информацию о выходных и праздничных днях.
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        MyCalendar myCalendar = new MyCalendar("01-01-2021", "31-12-2021");
        MyCalendar.WeekendAndHoliday weekendAndHoliday = myCalendar.new WeekendAndHoliday();
        weekendAndHoliday.calcNumberWeekend(myCalendar.getStartDay(), myCalendar.getEndDay());
        weekendAndHoliday.calcNumberHoliday(myCalendar.getStartDay(), myCalendar.getEndDay());
        System.out.println("Временной интервал от " + df.format(myCalendar.getStartDay().getTime()) +
                " до " + df.format(myCalendar.getEndDay().getTime()) + ':');
        System.out.println("количество выходных дней - " + weekendAndHoliday.getNumberWeekend());
        System.out.println("количество праздничных дней - " + weekendAndHoliday.getNumberHoliday());
    }
}
