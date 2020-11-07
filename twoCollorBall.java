
/*
* func Random set 的应用
* set 数据类型元素不会出现重复所以使用这种就可以避免重复的红球
*
* */


import java.util.Random;
import java.util.Set;
import java.util.TreeSet;



public class twoCollorBall {

    public static void main(String[] args) {
        Random red = new Random();
        Random blue = new Random();
        Set<Integer> mid = new TreeSet<>();
        int midVar= 1;
        while (mid.size() <6){
            mid.add(red.nextInt(33));
            midVar++;
        }
        StringBuffer mids= new StringBuffer();
        mids.append("红球是："+ mid);
        mids.append("\n蓝球是："+blue.nextInt(16));
        System.out.println(mids);
    }
}


