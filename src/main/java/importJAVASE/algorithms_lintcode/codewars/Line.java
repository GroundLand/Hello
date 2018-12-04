package importJAVASE.algorithms_lintcode.codewars;

import com.google.common.collect.Lists;

import java.util.List;

public class Line {
    public static String WhoIsNext(String[] names, int n) {

        List<String> strings = Lists.newArrayList(names);
        int i = 0;
        while (i < n - 1) {
            String name = strings.get(0);
            strings.remove(0);
            strings.add(name);
            i++;
        }
        return strings.get(0);
    }
}
