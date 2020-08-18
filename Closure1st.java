// http://www.iqool.de/Was-ist-eine-Closure.html

import java.io.*;

interface Concat {
	public String exec( String a, String b );
};

interface Say { 
	public String exec ( String str );
};

class Closure1st {

	public static void main( String[] args ) {

		Concat s = ( s1, s2 ) -> s1 +" " +s2;
		System.out.println( s.exec( "Fahr nicht so schnell", "mein kleiner Freund" ));
	
		Say b = ( str ) -> str +" mein Lieber";
		System.out.println( b.exec( "Santam Bayalam" ) );
	}
	
}
