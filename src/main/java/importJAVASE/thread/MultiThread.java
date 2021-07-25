package importJAVASE.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class MultiThread {

    public static void main(String[] args) {
        ThreadMXBean mxBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = mxBean.dumpAllThreads(false,false);

        for (ThreadInfo info:threadInfos){
            System.out.println(info.getThreadName());
        }



    }
}
