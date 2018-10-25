package lombok;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author cln
 * @version $Id: LTest.java v 0.1 18-10-23 上午10:40 cln Exp $$
 */
@Slf4j
public class LTest {

    public static void main(String args[]) {
        //可以用val
        val paper = new Paper("yellow");   //使用构造函数

        log.info("颜色为: {}", paper.getColor());

        //使用setter方法
        paper.setColor("blue");

        log.info("使用其toString方法： {}", paper);

    }
}
