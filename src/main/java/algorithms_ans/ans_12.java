package algorithms_ans;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
public class ans_12 {
    public static void main(String[] args){
        int[] a = new int[10];
        for(int i=0; i<10; i++){
            a[i]=9-i;
        }

        for (int i=0; i<10; i++){
            a[i] = a[a[i]];
        }
        for (int i=0; i<10; i++)
            StdOut.print(a[i]);
        StdOut.println();
    }
}
