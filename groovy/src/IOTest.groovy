/**
 *
 * @author cln
 * @version $Id: IOTest.java v 0.1 18-10-6 上午11:17 cln Exp $$
 */
class IOTest {
    static void main(String[] args) {
        def number = 0;
        new File('/home/c/Documents/io1.txt').eachLine {
            line ->
                number++
                println("$number: $line")
        }

        def customers = new XmlSlurper().parse(new File('customer.xml'))
        customers.each {
            customer ->
                println customers.@name
        }
    }
}
