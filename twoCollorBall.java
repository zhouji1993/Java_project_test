
/*
* func Random set ��Ӧ��
* set ��������Ԫ�ز�������ظ�����ʹ�����־Ϳ��Ա����ظ��ĺ���
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
        mids.append("�����ǣ�"+ mid);
        mids.append("\n�����ǣ�"+blue.nextInt(16));
        System.out.println(mids);
    }
}


