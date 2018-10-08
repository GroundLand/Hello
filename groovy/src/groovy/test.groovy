package groovy

/**
 *
 * @author cln
 * @version $Id: test.java v 0.1 18-10-1 上午11:39 cln Exp $$
 */
class test {
    static void main(String[] args) {
        def str = "Hello World"
        println(str)

        def classes = [String, List, File]

        println classes*.getPackage()*.getName()

    }
}
