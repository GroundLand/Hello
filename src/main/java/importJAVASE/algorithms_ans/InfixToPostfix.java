package importJAVASE.algorithms_ans;

import edu.princeton.cs.algs4.Stack;

/**
 * Created by evel on 2017/12/13.
 */
public class InfixToPostfix {
    private boolean isDigitl(char c) {
        if (c >= '0' && c <= '9')
            return true;
        return false;
    }

    private boolean isOpera(char c) {
        if (c == '+' || c == '-' || c == '/' || c == '*')
            return true;
        return false;
    }

    private int getPriority(char c) {
        switch (c) {
            case '#':
                return -1;
            case '(':
            case ')':
                return 0;
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;
            default:
                return -1;
        }
    }

    public String postInfix(char[] expres) {
        int i = 0;
        Stack<Character> dataStack = new Stack();
        Stack<Character> opreStack = new Stack();

        opreStack.push('#');
        for (char expre : expres) {

            if (isDigitl(expre)) {
                dataStack.push(expre);
            } else if (isOpera(expre)) {
                if (getPriority(expre) <= getPriority(opreStack.peek())) {
                    dataStack.push(opreStack.pop());
                }
                opreStack.push(expre);
            } else if (expre == '(') {
                opreStack.push(expre);
            } else if (expre == ')') {
                while (opreStack.peek() != '(') {
                    dataStack.push(opreStack.pop());
                }
                //去除多余的括号
                opreStack.pop();
            }
            i++;
        }

        while (opreStack.peek() != '#') {
            dataStack.push(opreStack.pop());
        }
        opreStack.pop();
        while (!dataStack.isEmpty()) {
            opreStack.push(dataStack.pop());
        }
        String str = "";
        while (!opreStack.isEmpty()) {
            str += opreStack.pop();
        }
        System.out.println(str);
        return str;
    }

    public void evaluePostinfox(char[] suffixs) {
        Stack<Integer> stack = new Stack<>();
        for (char suff : suffixs) {
            if (isDigitl(suff)) {
                stack.push(Character.getNumericValue(suff));
            } else if (isOpera(suff)) {
                int passive = stack.pop();
                int positive = stack.pop();
                switch (suff) {
                    case '+':
                        stack.push(positive + passive);
                        continue;
                    case '-':
                        stack.push(positive - passive);
                        continue;
                    case '*':
                        stack.push(positive * passive);
                        continue;
                    case '/':
                        stack.push(positive / passive);
                        continue;
                }
            }
        }
        System.out.println(stack.toString());
    }

    public static void main(String[] args) {
        char[] c = "5+((1+2)*4)-3".toCharArray();
        InfixToPostfix obj = new InfixToPostfix();
        String str = obj.postInfix(c);
        obj.evaluePostinfox(str.toCharArray());
    }
}
