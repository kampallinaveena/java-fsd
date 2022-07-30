package java_fsd;

public class MemberInnerClass {
	
	private int data=30;  
	 class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberInnerClass obj=new MemberInnerClass();  
		  MemberInnerClass.Inner in=obj.new Inner();  
		  in.msg();  
		 

	}

}
