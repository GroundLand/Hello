package importJAVASE;

import org.junit.Test;

public class FreeTest {
    @Test
    public void freeTest() {
        System.out.println(System.currentTimeMillis());
        final float x = 1.1f;
        final float z = 1.23f;
        float y = x;
        for (int j = 0; j < 0000000; j++) {
            y *= x;
            y /= z;
            y += 0.1f;
            y -= 0.1f;
        }

        System.out.println(System.currentTimeMillis());

    }
}
