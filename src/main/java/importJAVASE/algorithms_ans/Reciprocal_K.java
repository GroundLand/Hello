package importJAVASE.algorithms_ans;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

/**
 * Created by evel on 2017/12/15.
 */
public class Reciprocal_K {
    public static void main(String args[]) {

        //
        //    	 Scanner sc=new Scanner(System.in);
        //
        //    	   System.out.println("Enter your rollno");
        //    	   int rollno=sc.nextInt();
        //    	   System.out.println("Enter your name");
        //    	   String name=sc.next();
        //    	   System.out.println("Enter your fee");
        //    	   double fee=sc.nextDouble();
        //    	   System.out.println("Rollno:"+rollno+" name:"+name+" fee:"+fee);
        //    	   sc.close();

        Queue<String> queue = new Queue<String>();
        Scanner s = new Scanner(System.in);
        Integer k = StdIn.readInt();
        while (!StdIn.hasNextLine()) {
            queue.enqueue(s.next());
        }

        for (int i = 0; i < queue.size() - k; i++) {
            queue.dequeue();
        }
        StdOut.print(queue.dequeue());
        s.close();
    }
}
