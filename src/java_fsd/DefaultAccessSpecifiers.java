package java_fsd;

class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 



public class DefaultAccessSpecifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 


	}

}
