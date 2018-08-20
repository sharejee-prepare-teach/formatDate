import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static String PATTERN = "E MMM dd HH:mm:ss Z yyyy";
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String dateFrom = "Mon Jun 18 00:00:00 IST 2012";
        String dateTo = "Mon Jun 18 00:00:00 IST 2018";
        String dateF = dateFrom.toString();
        String dateT = dateTo.toString();
        Date df = null;
        Date dt = null;

        df = getDateValue(dateF);
        dt = getDateValue(dateT);
        System.out.println("--------DateFrom:------ "+df);
        System.out.println("--------DateTo:------ "+dt);

        String dfs = getDateFormatToSQL(df);
        String dts = getDateFormatToSQL(dt);
        System.out.println("--------DateFrom:------ " + dfs);
        System.out.println("--------DateTo:------ " + dts);

    }

    public static String getDateFormatToSQL(Date date) {
        if (date != null) {
            String dateFormat = new SimpleDateFormat("dd-MMM-yyyy").format(date);
            return dateFormat;
        }
        return null;
    }

    public static Date getDateValue(String dateString) {
        //"Mon Jun 18 00:00:00 IST 2012";
        if (dateString != null) {
            DateFormat formatter = new SimpleDateFormat(PATTERN);
            Date date = null;
            try {
                date = (Date) formatter.parse(dateString);
                return date;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static String getDateFromFormat(String dateString) {
        if (dateString != null) {
            Date date = null;
            date = getDateValue(dateString);
            String dfs = getDateFormatToSQL(date);
            return dfs;
        }
        return null;
    }
}
