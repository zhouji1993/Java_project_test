/*
* 使用Array 方法copyOf
*Arrays的copyOf()方法传回的数组是新的数组对象，所以您改变传回数组中的元素值，也不会影响原来的数组。
copyOf()的第二个自变量指定要建立的新数组长度，如果新数组的长度超过原数组的长度，则保留数组默认值，例如：
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

        // 如果插入的位置不合法，则直接返回

        if (position > size || position < 0) {
            System.err.println("越界了");
            return -1;
        }

        if ((size*1.0 / array.length)>0.8) {
            dilatation();
        }
        // 数组移位操作
        for (int i = size; i > position; i--) {
            array[i] = array[i - 1];
        }

        array[position] = value;
        size++;

        return 0;
    }
    // 删除元素
    public int remove(int position) {
        if (position > size || position < 0)
            return -1;
        // 将待删除的值保存起来，等待返回
        int removeValue = array[position];

        for (int i = position; i < size - 1; i++) {
            array[i] = array[i + 1];

        }
        array[size - 1] = 0;
        size--;
        return 0;
    }
    // 数组的扩容
    private int[] dilatation() {
        // int[] tempArray = new int[array.length + DEFAULT_ARRAY_COUNT];
        /*
        *
        * 查询文档得知copyOf 方法可以直接Array进行扩容在此处直接使用对应方法即可
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
