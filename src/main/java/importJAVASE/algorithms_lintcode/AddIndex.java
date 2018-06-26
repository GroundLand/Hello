package importJAVASE.algorithms_lintcode;

import java.util.Arrays;

public class AddIndex {

    public static void main(String[] args){
        int a[]={2,2,6,0};
        int[] result=doSomething(a,9);
        System.out.println(Arrays.toString(result));


    }
    public static int[] doSomething(int[] a,int target){
        int[] resutl={0,0};
        for (int i=0;i<a.length;i++){
            for (int j=i;j<a.length;j++){
                if (a[i]+a[j]==target)
                {
                    resutl[0]=i;
                    resutl[1]=j;
                    return resutl;
                }
            }
        }
        return resutl;
    }
}
