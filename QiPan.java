

/*
*
*
* 我的思路就是直接將
*
* */


public class QiPan {
    private  char[] midarry= {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    int size = midarry.length;
    StringBuffer midstr= new StringBuffer();
    public static final char plain=' ';
    public QiPan(){
        System.out.println(midarry);
        char[][] board = new char[size][size];
        for (int i = 0 ; i < size  ; i++ ){
            for (int j = 0;j <size ;j++){
//                System.out.println(midstr);
                if (i==0 & j==0 ){
//                    board[i][j]=plain;
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
