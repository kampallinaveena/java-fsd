package java_fsd;

class B {
    
    public void display() {
        System.out.println("Welcome to Java .");
        System.out.println("Java Programming Language");
    }
}


public class PublicAccessSpecifiers extends B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicAccessSpecifiers a = new PublicAccessSpecifiers ();
        a.display();

	}

}
