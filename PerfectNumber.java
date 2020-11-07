/*
*
* 编程找出1000以内的所有完数并打印出来。
* 所谓完数就是一个数恰好等于它的因子之和，如：6=1＋2＋3
*
*
* 循环 1 ~ 1000
* 然后对每个数字进行质因数分解，然后把质因数相加
*
*
* */
public class PerfectNumber {
    public static void main(String[] args){
        for ( int a = 1 ; a < 1000 ; a++){   // 创建整个数组
            int s = 0 ;
            for ( int i = 1 ; i < a ; i++){
                if(a % i == 0 ){   // 对数字进行快速分解
                    s += i; //对数字的结果进行相加

                }

            }
            if ( s == a){
                System.out.println("perfect：" + a); //确定元素然后输出
            }
        }

    }



}