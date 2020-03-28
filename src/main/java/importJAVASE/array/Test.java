package importJAVASE.array;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public class Test {

    public static void main(String args[]) {
        Integer[] arr = {222,22,22};




        char chars2D[][] = { { 'X', 'X', 'X', 'X' }, { 'X', 'O', 'O', 'O' }, { 'X', 'X', 'O', 'X' }, { 'X', 'X', 'O', 'X' } };
        printArray(chars2D);
        solve(chars2D);
        printArray(chars2D);

        int[] array = { 2, 2, 2 };
        Integer[] integers = findLocation(array, 2);
        for (Integer i : integers) {
            System.out.println(i);
        }

    }

    public static void solve(char[][] board) {

    }

    public static Integer[] findLocation(int[] array, int target) {
        //二分查找
        int index = Arrays.binarySearch(array, target);
        int start = index;
        int end = index;
        List<Integer> list = Lists.newArrayList();
        //往前找
        while (start > 0 && array[--start] == target)
            list.add(start);
        //添加
        list.add(index);
        //往后找
        while (end < array.length - 1 && array[++end] == target) {
            list.add(end);
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
