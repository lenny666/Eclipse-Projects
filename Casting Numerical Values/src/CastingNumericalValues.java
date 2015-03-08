
public class CastingNumericalValues {

	public static void main(String[] args) {
		
		// Casting = converting one type into another (from long to int for example)

		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23355;
		
		float floatValue = 8834.3f; // add f to the end of the number or it thinks its double
		float floatValue2 = (float) 99.3;
		double doubleValue = 32.4;
		
		System.out.println(Byte.MAX_VALUE);
		
		intValue = (int)longValue; // (int) says that i "really" want to do this (even though it may end badly... if long is too long)
		
		System.out.println(intValue);
		
		doubleValue = intValue; // works cuz there is less potential for things to go wrong
		System.out.println(doubleValue);
		
		intValue = (int)floatValue; //it doesn't round... it just chops the end off
		System.out.println(intValue);
		
		
		// The following won't work as we excpect it to!!
		// 128 is too big for a byte.
		byteValue = (byte) 128;
		System.out.println(byteValue);
	}

}
