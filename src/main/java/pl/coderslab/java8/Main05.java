package pl.coderslab.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Main05 {
    public static void main(String[] args) {

        //LocalDate now = LocalDate.now();
        LocalDate now = LocalDate.of(2021, 2, 6);
        System.out.println(now);

        DayOfWeek dayOfWeek = now.getDayOfWeek();
        int year = now.getYear();
        System.out.println(dayOfWeek);
        Month month = now.getMonth();
        int monthInt = month.getValue();
        int daysOfMonth = now.lengthOfMonth();
        System.out.println(month);
        System.out.println(daysOfMonth);
        int dayOfWeekInt = now.getDayOfWeek().getValue();
        System.out.println(dayOfWeekInt);
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth);
        int lastDayOfMonth = (daysOfMonth - dayOfMonth) % 7 + dayOfWeekInt % 7;
        System.out.println(lastDayOfMonth);

        DayOfWeek lastDayOfCurrentMonth = LocalDate.of(year, monthInt, daysOfMonth).getDayOfWeek();
        System.out.println(lastDayOfCurrentMonth);

        DayOfWeek firstDayOfNextMonth =
                LocalDate
                .of(year + (int) Math.floor(monthInt + 1) / 12,
                        (monthInt + 1) % 12,
                        1)
                .getDayOfWeek();
        System.out.println(firstDayOfNextMonth);


    }
}
