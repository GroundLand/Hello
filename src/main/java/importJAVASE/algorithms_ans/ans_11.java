package importJAVASE.algorithms_ans;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
public class ans_11 {
    public static void main(String[] args) {
        Boolean[][] blo = { { true, true, false },
                { false, true, true },
                { true, false, false },
                { true, false, true } };
        String s = "";
        for (int i = 0; i < blo.length; i++) {
            for (int j = 0; j < blo[i].length; j++) {

                if (blo[i][j] == true) {
                    s += "*";
                } else {
                    s += "-";
                }

            }
            s += "\n";
        }

    }
}
