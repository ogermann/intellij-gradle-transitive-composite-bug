package ch.mysign.projectB;

import ch.mysign.projectC.HelloC;
import ch.mysign.projectD.HelloD;

public class HelloB
{
	public static void hello() {
		System.out.println( "hello from B" );
		HelloC.hello();
		HelloD.hello();
	}
}
