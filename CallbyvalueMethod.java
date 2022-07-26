package java_fsd;

public class CallbyvalueMethod {
	
	int change(int b) 
	  { 
	    ++b; 
	    return b; 
	  } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 CallbyvalueMethod obj = new CallbyvalueMethod(); 
	     int a = 20; 
	     int x = obj.change(a); 
	     System.out.println("Value of a after passing: " +a); 
	     System.out.println("Value of x after modifying: " +x); 
		

	}

}
