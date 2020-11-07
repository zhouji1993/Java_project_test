/*
* ʹ��Array ����copyOf
*Arrays��copyOf()�������ص��������µ���������������ı䴫�������е�Ԫ��ֵ��Ҳ����Ӱ��ԭ�������顣
copyOf()�ĵڶ����Ա���ָ��Ҫ�����������鳤�ȣ����������ĳ��ȳ���ԭ����ĳ��ȣ���������Ĭ��ֵ�����磺
*
*
* */


import java.util.Arrays;


public class ArryTest {
    public static final int DEFAULT_ARRAY_COUNT = 16;
    int[] array;
    private int size = 0 ;

    public void initList() {
        array = new  int[DEFAULT_ARRAY_COUNT];

    }

    public  int add( int value) {

        return add(value, size);
    }
    public int add(int value, int position) {

        // ��������λ�ò��Ϸ�����ֱ�ӷ���

        if (position > size || position < 0) {
            System.err.println("Խ����");
            return -1;
        }

        if ((size*1.0 / array.length)>0.8) {
            dilatation();
        }
        // ������λ����
        for (int i = size; i > position; i--) {
            array[i] = array[i - 1];
        }

        array[position] = value;
        size++;

        return 0;
    }
    // ɾ��Ԫ��
    public int remove(int position) {
        if (position > size || position < 0)
            return -1;
        // ����ɾ����ֵ�����������ȴ�����
        int removeValue = array[position];

        for (int i = position; i < size - 1; i++) {
            array[i] = array[i + 1];

        }
        array[size - 1] = 0;
        size--;
        return 0;
    }
    // ���������
    private int[] dilatation() {
        // int[] tempArray = new int[array.length + DEFAULT_ARRAY_COUNT];
        /*
        *
        * ��ѯ�ĵ���֪copyOf ��������ֱ��Array���������ڴ˴�ֱ��ʹ�ö�Ӧ��������
        *
        * */


        array = Arrays.copyOf(array, array.length + DEFAULT_ARRAY_COUNT);

        return array;
    }

    public int size() {

        return size;
    }

    @Override
    public String toString() {
        if (size <= 0) {
            return "[]";
        }
        String resultString = "[";
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                resultString = resultString + array[i] + "]";
            } else {
                resultString = resultString + array[i] + ", ";
            }

        }

        return resultString;
    }

    public static void main(String[] args) {
       /*
       *
       *
       * */



        }



    }
}
