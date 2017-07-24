package jodatime;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;  //Project Structure->modules->source->language level

/**
 * Created by evel on 2017/7/21.
 */
public class MainTest {

    public static Logger logger = LoggerFactory.getLogger(MainTest.class);
    public static void main(String[] args){

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

    }
}
