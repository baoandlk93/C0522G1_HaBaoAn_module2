import java.text.SimpleDateFormat;
import java.util.Date;

class StringToDateExample2 {
    public static void main(String[] args) throws Exception {
        String sDate1 = "12/7/2017";
        String sDate2 = "12-07-2017";
        String sDate3 = "12/7/2017 13:30:50";
        String sDate4 = "12-07-2017 13:30:50";
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat formatter3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat formatter4 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date1 = formatter1.parse(sDate1);
        Date date2 = formatter2.parse(sDate2);
        Date date3 = formatter3.parse(sDate3);
        Date date4 = formatter4.parse(sDate4);
        System.out.println(sDate1 + "\t" + date1);
        System.out.println(sDate2 + "\t" + date2);
        System.out.println(sDate3 + "\t" + date3);
        System.out.println(sDate4 + "\t" + date4);
    }
}