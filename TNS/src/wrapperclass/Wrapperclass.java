package wrapperclass;

public class Wrapperclass {
	
	public static void main(String[] args) {
		// byte -> Byte
        byte b = 10;
        Byte byteObj = b;   
        byte bVal = byteObj; 
        System.out.println("byte:");
        System.out.println("Autoboxing: " + byteObj + " | Unboxing: " + bVal);

        // short -> Short
        short s = 20;
        Short shortObj = s;
        short sVal = shortObj;
        System.out.println("short:");
        System.out.println("Autoboxing: " + shortObj + " | Unboxing: " + sVal);

        // int -> Integer
        int i = 30;
        Integer intObj = i;
        int iVal = intObj;
        System.out.println("int:");
        System.out.println("Autoboxing: " + intObj + " | Unboxing: " + iVal);

        // long -> Long
        long l = 40000L;
        Long longObj = l;
        long lVal = longObj;
        System.out.println("long:");
        System.out.println("Autoboxing: " + longObj + " | Unboxing: " + lVal);

        // float -> Float
        float f = 3.14f;
        Float floatObj = f;
        float fVal = floatObj;
        System.out.println("float:");
        System.out.println("Autoboxing: " + floatObj + " | Unboxing: " + fVal);

        // double -> Double
        double d = 99.99;
        Double doubleObj = d;
        double dVal = doubleObj;
        System.out.println("double:");
        System.out.println("Autoboxing: " + doubleObj + " | Unboxing: " + dVal);

        // char -> Character
        char c = 'A';
        Character charObj = c;
        char cVal = charObj;
        System.out.println("char:");
        System.out.println("Autoboxing: " + charObj + " | Unboxing: " + cVal);

        // boolean -> Boolean
        boolean bool = true;
        Boolean boolObj = bool;
        boolean boolVal = boolObj;
        System.out.println("boolean:");
        System.out.println("Autoboxing: " + boolObj + " | Unboxing: " + boolVal);

	}

}
