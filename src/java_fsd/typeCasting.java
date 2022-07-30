package java_fsd;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 byte i = 50;
		    short j = i;
		    int k = j;
		    long l = k;
		    float m = l;
		    double n = m;
		    System.out.println("Implicit type casting: ");
		    System.out.println("byte value : "+i);
		    System.out.println("short value : "+j);
		    System.out.println("int value : "+k);
		    System.out.println("long value : "+l);
		    System.out.println("float value : "+m);
		    System.out.println("double value : "+n);
		    
		    double d = 75.0;
			float f = (float) d;
			
			System.out.println("Explicit type casting: ");
			System.out.println("double value : "+d);
			System.out.println("float value : "+f);
			
	}

}
