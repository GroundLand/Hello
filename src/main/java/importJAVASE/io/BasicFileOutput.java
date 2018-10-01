package importJAVASE.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created by Administrator on 2017/6/8 0008.
 */
public class BasicFileOutput {
    static String file = "BasicFileOutput.out";
    public static void main(String args[]) throws IOException{
        String string = "127025483_429.txt   127092784_121.txt  127229888_3.txt    127613093_1.txt    13872201_957.txt  14023747_1.txt    200006_992.txt       24982422398_1369.txt     601245_1492.txt  io.txt\n"
                + "127037971_432.txt   127110147_605.txt  127239371_311.txt  127789890_501.txt  13881053_403.txt  14024308_264.txt  200179_1593.txt      25033311057_2.txt        625897_517.txt\n"
                + "127046672_520.txt   127115466_186.txt  127300329_338.txt  127822735_99.txt   13943280_296.txt  14049678_216.txt  23854007135_183.txt  300188_2887.txt          8130652_382.txt\n"
                + "127051155_1656.txt  127133284_769.txt  127322000_1.txt    127888737_179.txt  13996193_86.txt   14052138_652.txt  24747377529_2.txt    352002634722721_283.txt  io1.txt\n"
                + "127087919_21.txt    127167595_474.txt  127545790_144.txt  13870200_286.txt   14006729_559.txt  14054009_102.txt  24907842389_12.txt   352399919197213_122.txt  io2.txt\n";
    }
}
