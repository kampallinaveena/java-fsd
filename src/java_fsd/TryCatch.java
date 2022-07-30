package java_fsd;

public class TryCatch {
	
	public static void main(String args[]) {
	      int val1, val2;
	      try {
	         val1 = 0;
	         val2 = 25 / val1;
	         System.out.println(val2);
	      }
	      catch (ArithmeticException e) { 
	         System.out.println("ArithmeticException :: Divide by Zero!");
	      }
	      System.out.println("Outside try-catch Block :: End of the code.");
	   }

}
