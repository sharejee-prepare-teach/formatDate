import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String dateFrom = "Mon Jun 18 00:00:00 IST 2012";
        String dateTo = "Mon Jun 18 00:00:00 IST 2018";
        String dateF = dateFrom.toString();//"Mon Jun 18 00:00:00 IST 2012";
        String dateT = dateTo.toString();
        DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
        DateFormat formatIReportSQL = new SimpleDateFormat("dd/MM/yyyy");
        Date df = null;
        Date dt = null;

        Date df2 = null;
        Date dt2 = null;
        try {
            df = (Date)formatter.parse(dateF);
            dt = (Date)formatter.parse(dateT);
            System.out.println("--------DateFrom:------ "+df);
            System.out.println("--------DateTo:------ "+dt);

            String dfs = new SimpleDateFormat("dd-MM-yyyy").format(df);
            String dts = new SimpleDateFormat("dd-MM-yyyy").format(dt);
            System.out.println("--------DateFrom:------ " + dfs);
            System.out.println("--------DateTo:------ " + dts);

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
