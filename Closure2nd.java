// https://de.wikipedia.org/wiki/Closure_(Funktion)

import java.util.function.*;

class Closure2nd {

	static IntBinaryOperator ua = (x, y) -> x +y;
	
	/* ''Schönfinkeln */
	static IntFunction<IntUnaryOperator> ca = x -> y -> x +y;

	public static void main(String[] args){
		System.out.println(ua.applyAsInt(3, 9));
		System.out.println(ca.apply(3).applyAsInt(5));
	}
}
