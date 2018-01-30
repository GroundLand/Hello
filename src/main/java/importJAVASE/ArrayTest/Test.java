package importJAVASE.ArrayTest;

import com.google.common.collect.Lists;
import org.apache.shiro.util.StringUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public class Test {

    public static void main(String args[]) {
        char chars2D[][] = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'O'}, {'X', 'X', 'O', 'X'}, {'X', 'X', 'O', 'X'}};
        printArray(chars2D);
        solve(chars2D);
        printArray(chars2D);

        String[] strings = {"2","3","3"};
        System.out.println(findLocation(strings,"3"));

    }

    public static void solve(char[][] board) {

    }

    public static Integer[] findLocation(String[] strings, String target) {
        if (!StringUtils.hasLength(target)){
            return null;
        }
        List<Integer> list = Lists.newArrayList();
        for (int i=0;i<strings.length;i++) {
            if (target.equals(strings[i]))
                list.add(i);
        }
        return list.toArray(new Integer[list.size()]);
    }

    public static void printArray(char[][] chars2D) {
        int length = chars2D.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < chars2D[i].length; j++)
                System.out.print(chars2D[i][j] + " ");

            System.out.println();
        }

    }

}
