package edu.austincc.chapter2;

public class ConversionsExamples {
	
	private static void prepostDemos() {
		
		int x = 0;
		
		int y = ++x;
		System.out.println(y);
		
		int z = x++;
		System.out.println(z);
		
		System.out.println(x);
		
		System.out.println("------------\n\n");
		
		int i;
		for (i = 0; i < 7; i++) {
			System.out.println(i);
		}
		System.out.println("I is: " + i);
		
		System.out.println("-----------\n\n");
		
		int p = 0;
		while ( p < 7) {
			
			System.out.println(p++);
		}
		System.out.println("P is: " + p);
		
		int a = 5;
		a += 10;  // Shortuct syntax for a = a + 10;
		System.out.println(a );
		
		int b = 5;
		b *= 10;  // Shortuct syntax for a = a * 10;
		System.out.println(b );
		
		System.out.println( 5 / 3);
		
	}
	
	public static void main(String[] args) {
		
		byte x = 10;
		
		System.out.println(x);
		
		int y = (int)x;
	
		System.out.println(y);
		
		x = downCastIntToByteSafely(x);
		System.out.println(x);
		
		long z = 100000000;
		long q = 100_000_000;
		int r = 0_____14_13;
		int p = 0b111;
		long m = 10L;
		int o = 0xFF;
		
		System.out.println(p);
		System.out.println(r);
		System.out.println( z == q );
		
		
		// 11 >>> 01
		System.out.println(p >>> 1);
		
		System.out.println(o);
		System.out.println(o >>> 9);

		
		// Print character D
		char foo = 'D';
		System.out.println(foo);
		
		// D is character code 68 - see http://www.asciitable.com/
		// Add 1 to our character causes it to convert to an int
		// Prints out 69
		System.out.println(foo + 1);
		
		// To convert back to a char, do that addition then cast back to char
		char bar =  (char) (foo + 1);
		System.out.println(bar);
		
		
		char t = '\u0122';
		System.out.println(t);
		
		
		char s = (char)-122;
		System.out.println("s is: " + s);
		
		
		prepostDemos();
		
	}

	private static byte downCastIntToByteSafely(int value) {
	
		if (value >= -128 && value <= 127 ) {
			return (byte)value;
		} else {
			throw new ClassCastException("Integer value out of range for a safe cast to a byte");
		}
	

	}

}
