package ch.mysign.projectC;

import ch.mysign.projectD.HelloD;

public class HelloC
{
	public static void hello() {
		System.out.println( "hello from C" );
		System.out.println( "called in C:" );
		HelloD.hello();
	}
}
