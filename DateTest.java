/*
*
* ͨ�����ڲ����������⣬û���پ�������������
* ��ʱ���ʽ����Ϊ yyyy/mm/dd����ʽ
* Ȼ������ݽ��зֱ��ȡȻ������ݽ��зֱ�ļ���
* Ȼ��ֱ����ַ����н�ȡyears month day
* Ȼ�󴴽�ѭ����������
*
*
*
* */
import java.text.*;
import java.util.Scanner;
public class DateTest {


    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Scanner sc = new Scanner(System.in);
        String dates = sc.next();
        int years = Integer.parseInt(dates.substring(0,4));
        int Month = Integer.parseInt(dates.substring(6,7));
        int days =Integer.parseInt(dates.substring(8));
        int[] daysa = {31 , 0 , 31 ,30 ,31 ,30 ,31,31,30,31,30,31};
        int midmonth = 0;
        int date_days = days;
        while (  midmonth <= Month){
            if (daysa[midmonth] == 0) {
                if ((years % 400 ==0 ) & (years % 4 == 0)){
                    date_days =  date_days + 29;
                }else {
                    date_days = date_days + 28;
                }
            }
            date_days = date_days + daysa[midmonth];
            midmonth++;
        }
        System.out.println(date_days);

    }

}

