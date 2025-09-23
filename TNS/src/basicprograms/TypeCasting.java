package basicprograms;

public class TypeCasting {

	public static void main(String[] args) {
		
		 // Typecasting (explicit)
		
	     //float->int
	     float k=23.7f;
	     int u = (int)k;
	     System.out.println(" float  to int " + u);
	     
	     
        //  int → byte 
        int i2 = 130;
        byte b2 = (byte) i2;
        System.out.println(" int to byte  = " + b2);
        
        
        //  long → short
        long l2 = 40000;
        short s2 = (short) l2; 
        System.out.println(" long to short = " + s2);

      
        // double -> int
        
        double dou =45.78;
        int c = (int) dou;
        System.out.println(" double to int = " +c );
        
      
        //  int → char 
        int num = 66;
        char ch2 = (char) num; 
        System.out.println(" int to char " + ch2);
        
       
        //  double → float 
        double d4 = 45.6789;
        float f2 = (float) d4;
        System.out.println(" double to float = " + f2);
 
        
       
	}
    
}
