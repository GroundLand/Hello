package importJAVASE.algorithms_lintcode;

/**
 * Created by evel on 2017/11/14.
 */
public class Reverse {

    public static void main(String[] args){
        isPalindrome(11);
    }
    public static boolean isPalindrome(int num) {
        // write your code here
        String numStr = String.valueOf(num);
        String reverStr = reverse(numStr);
        if(numStr !=null &&numStr.equals(reverStr)){
            return true;
        }
        return false;

    }
    public static String reverse(String str){
        if(str == null && str.length() <=1){
            return str;
        }

        return reverse(str.substring(1))+str.charAt(0);
    }
}
