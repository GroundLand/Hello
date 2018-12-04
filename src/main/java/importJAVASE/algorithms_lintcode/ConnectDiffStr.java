package importJAVASE.algorithms_lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evel on 2017/11/13.
 */
public class ConnectDiffStr {
    public static void main(String args[]) {

    }

    public List<String> missingString(String str1, String str2) {
        // Write your code here
        if (str1 == null && str2 == null)
            return null;
        if (str1 == "" && str2 == "")
            return null;
        String[] strs1 = str1.split(" ");
        String[] strs2 = str2.split(" ");
        List<String> list = new ArrayList<>();
        //   int max = Math.max(strs1.length(),strs2.length());
        for (int i = 0; i <= strs1.length; i++) {
            for (int j = 0; j <= strs2.length; j++) {
                if (!strs1[i].equals(strs2[j])) {
                    list.add(strs1[i]);
                }
            }
        }
        return list;
    }
}
