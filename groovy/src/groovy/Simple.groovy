/**
 *
 * @author cln
 * @version $Id: Simple.java v 0.1 18-10-11 下午5:10 cln Exp $$
 */
/********************
 * 引用
 ********************/
def map = [:]
firstname = "cl"
map."z-${firstname}" = "zcl"
println map."z-cl"

def strippedFirstNewline = 'line one\nline two\nline three '
println strippedFirstNewline

/********************
 * 异常
 ********************/
def number = 3.14
println "$number.toString()"