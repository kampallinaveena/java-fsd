package java_fsd;

import java.io.IOException;

public class Throws {
	
	void testMethod(int num) throws IOException, ArithmeticException{ 
	     if(num==1){
	        throw new IOException("IOException Occurred");
	     }
	     else{
	        throw new ArithmeticException("ArithmeticException occurred");
	  } 
	}
	
	  public static void main(String args[]){ 
	   try{ 
	
	     Throws obj=new Throws(); 
	     obj.testMethod(1); 
	   }
	   catch(Exception ex){
	     System.out.println(ex);
	    } 
	  
	  }
}
