/*
*
*
*
*
*
* */
import java.util.Scanner;
import java.util.Calendar;
import java.text.*;

public class DateToDays {

    public static void main(String[] args) {
        System.out.println("请输入一个日期，格式为yyyy/mm/dd");
        Scanner date = new Scanner(System.in);
        DateFormat formats = new SimpleDateFormat("yyyy/mm/dd");
        String years = date.substring(0,3);
        Date nows = null;
        Date now0 = null;

        nows = formats.parse(date);
        years = years + "01/01";
        now0 = formats.parse(years);
        String betweendays = (nows - now0);
        System.out.println(betweendays)
    }

}