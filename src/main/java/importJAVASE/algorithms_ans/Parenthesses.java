package importJAVASE.algorithms_ans;

import edu.princeton.cs.algs4.Stack;

/**
 * Created by evel on 2017/12/12.
 */
public class Parenthesses {
    public static void main(String[] args) {
        String str = "{[(][()]}";
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('(' == c || '{' == c || '[' == c) {
                stack.push(c);
            }
            if (stack.isEmpty()) {
                System.out.println(false);
                return;
            }
            if ('}' == c)
                stack.pop();
            if (']' == c)
                stack.pop();
            if (')' == c)
                stack.pop();

        }
        //如果此处str为args,则判断该值是否为空
        if (stack.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
