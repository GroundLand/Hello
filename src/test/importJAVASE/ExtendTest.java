package importJAVASE;

import importJAVASE.extend.InstrumentedHashSet;
import importJAVASE.extend.Parent;
import importJAVASE.extend.Son;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by evel on 2017/8/15.
 */
public class ExtendTest {

    @Test
    public void InstrumentedHashSetTest() {
        InstrumentedHashSet<String> set = new InstrumentedHashSet<String>();
        set.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        System.out.println(set.getAddCount());
    }

    @Test
    public void ParentAndSonTest() {
        Parent son = new Son();
        son.overrideme();
    }
}
