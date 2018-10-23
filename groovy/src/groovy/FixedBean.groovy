import groovy.transform.Immutable

/**
 *
 * @author cln
 * @version $Id: FixedBook.java v 0.1 18-10-18 下午8:03 cln Exp $$
 */
@Immutable
class FixedBook {
    String title
}

def gina = new FixedBook('Groovy in Action')
def regine = new FixedBook(title: 'Groovy in Action')

assert gina.getTitle() == 'Groovy in Action'
assert gina == regine

try {
    gina.title = "Oops"
    assert false, "should not reach here"
} catch (Exception e) {
    println "something is wrong:$e.message"
}



