package test.groovy

import java.lang.invoke.DirectMethodHandle.StaticAccessor;

class GroovyDemo {
     static void main (def args) {
		 def mylist = [1, 2, "Lars", 4]
		 mylist.each {println it}
	 }
}
