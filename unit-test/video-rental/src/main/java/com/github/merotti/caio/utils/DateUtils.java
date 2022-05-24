package com.github.merotti.caio.utils;

import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;

public class DateUtils {

    public static Date addDays(Date date, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(DAY_OF_MONTH, days);
        return calendar.getTime();
    }

    public static Date getDateWithDaysDifference(int days) {
        return addDays(new Date(), days);
    }

    public static Date getDate(int day, int month, int year){
        Calendar calendar = Calendar.getInstance();
        calendar.set(DAY_OF_MONTH, day);
        calendar.set(MONTH, month - 1);
        calendar.set(YEAR, year);
        return calendar.getTime();
    }

    public static boolean isSameDate(Date date1, Date date2) {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return (calendar1.get(DAY_OF_MONTH) == calendar2.get(DAY_OF_MONTH))
                && (calendar1.get(MONTH) == calendar2.get(MONTH))
                && (calendar1.get(YEAR) == calendar2.get(YEAR));
    }

    public static boolean checkDayOfWeek(Date date, int dayOfWeek) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(DAY_OF_WEEK) == dayOfWeek;
    }

}
