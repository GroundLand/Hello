package importJAVASE.collection;

import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;

/**
 * Created by evel on 2017/7/24.
 */
public class IteratorList {
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 2)
                iterator.remove();
        }

        System.out.println(list);
    }
}
