package utilities;
// The purpose of creating this is to manipulate date
// lots of question coming from this as dates need to be updated as per requirements
// by doing this it will automatically


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
    public static String returnNextMonth() {

        // Creating date object
        Date dNow = new Date();

        //Creating calendar object for Gregorian Calendar
        Calendar calendar = new GregorianCalendar();

        // Set calendar date to current date
        calendar.setTime(dNow);

        // Create object of SSimple date format
        // Defining Date Format to - example : (Dec - 2021)
        SimpleDateFormat sdf = new SimpleDateFormat("MMM-yyyy");

        // Incrementing the current month
        calendar.add(Calendar.MONTH, 1);

        // Generating the date based on the specified format
        String date = sdf.format(calendar.getTime());
        return date;
    }

}
