
public class App {

	public static void main(String[] args) {
		
		byte byteValue = 20;	// 8 bits
		short shortValue = 55;	// 16 bits
		int intValue = 888;		// 32 bits
		long longValue =23555;	// 64 bits
		
		float floatValue = 234.6f;	// need f...
		float floatValue2 = (float) 432.6;	// need f...
		double doubleValue = 34.5;	// default double..
		
		System.out.println(Byte.MAX_VALUE);
		
		intValue = (int) longValue;
		System.out.println(intValue);	
		
		doubleValue = (int) intValue;
		System.out.println(doubleValue);
		
		intValue = (int) floatValue;
		System.out.println(intValue);	
		
		intValue = (int) Math.round(floatValue);
		System.out.println(intValue);
		
		byteValue = (byte) 128;
		System.out.println(byteValue);	// wraps around
		
	}

}
