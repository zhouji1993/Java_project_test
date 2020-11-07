/*
*
* 通过日期差计算存在问题，没有再纠结上述问题上
* 将时间格式定义为 yyyy/mm/dd的形式
* 然后对数据进行分别截取然后对数据进行分别的计算
* 然后分别再字符串中截取years month day
* 然后创建循环体最后输出
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

