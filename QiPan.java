

/*
*
*
* 直接建立一个字符型的数组，然后用数组的length作为循环体中循环次数
*
* */


public class QiPan {
    private  char[] midarry= {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    int size = midarry.length;
    StringBuffer midstr= new StringBuffer();
    public static final char plain=' ';
    public QiPan(){
        for (int i = 0 ; i < size  ; i++ ){
            for (int j = 0;j <size ;j++){
                if (i==0 & j==0 ){
                    midstr.append(" ");
                }
                if (j==0 & i!=0){
                    midstr.append("\n"+midarry[i]);

                }
                if (i==0 & j!=0){
                    midstr.append(" "+midarry[j]);
                }
                if (i!=0 & j!=0){
                    midstr.append(" +");
                }

            }
        }
        System.out.println(midstr);
    }



    public static void main(String[] args) {
        new QiPan();
    }



}
