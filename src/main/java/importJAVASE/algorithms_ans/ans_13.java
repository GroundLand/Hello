package importJAVASE.algorithms_ans;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
public class ans_13 {
    public static void main(String[] args) {
        int[][] arr2d = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}};
        int max = 0;
        for (int i = 1; i < arr2d.length; i++)
            if (arr2d[i - 1].length > arr2d[i].length) {
                max = arr2d[i - 1].length;
            } else {
                max = arr2d[i].length;
            }


        int[][] result = new int[max + 1][arr2d.length];

            for (int i = 0; i < arr2d.length; i++){
                for (int j = 0; j < arr2d[i].length; j++) {
                    result[j][i] = arr2d[i][j];

                }
            }

        for (int i = 0; i < max+1; i++) {
            for (int j = 0; j < result[i].length; j++) {
                StdOut.print(result[i][j]);
            }
            StdOut.println();
        }

    }
}
