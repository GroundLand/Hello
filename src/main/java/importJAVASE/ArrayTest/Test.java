package importJAVASE.ArrayTest;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public class Test {

        public static void main(String args[]){
            char chars2D[][] = {{'X','X','X','X'},{'X','O','O','O'},{'X','X','O','X'},{'X','X','O','X'}};
            printArray(chars2D);
            solve(chars2D);
            printArray(chars2D);


        }
        public static void solve(char[][] board) {
            
        }

        public static void printArray(char[][] chars2D){
            int length = chars2D.length;
            for(int i=0; i<length; i++){
                for(int j=0; j< chars2D[i].length; j++)
                    System.out.print(chars2D[i][j]+" ");

                System.out.println();
            }

        }

}
