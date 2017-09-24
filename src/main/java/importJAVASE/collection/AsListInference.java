package importJAVASE.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Snow{}

class Power extends  Snow{}

class Light extends Power{}

class Heavy extends Power{}

class Crusty extends Snow{}

class Slush extends Snow{}

public class AsListInference {
    public static void main(String[] args){
        List<Snow> snow1 = Arrays.asList(new Crusty(),new Slush(),new Heavy());
        List<Snow> snow2 = Arrays.asList(new Light(),new Heavy());
        //error  Collections.addAll(snow1,snow2);
    }
}
