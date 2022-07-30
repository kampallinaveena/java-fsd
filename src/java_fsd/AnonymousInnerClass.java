package java_fsd;

abstract class Person{  
	  abstract void emp();  
	}  

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Person p=new Person(){  
			  void emp(){
				  System.out.println("emp is working");
				  }  
			  };
			  p.emp();  

	}

}
