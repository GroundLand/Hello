package algorithms_ans;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
public class ans_16 {
    public static String exR1(int n){
        if(n<=0) return "";
        return exR1(n-3)+n+exR1(n-2)+n;
    }

    public static int mystery(int a,int b){
        if (b==0) return 0;
        if (b%2==0) return mystery(a+a,b/2);
        return mystery(a+a,b/2)+a;
    }
    public static void main(String[] args){
        StdOut.println(exR1(6));
        StdOut.println(mystery(2,25));
        StdOut.println(mystery(3,11));
    }
}
