package java_fsd;

class A {
   
    protected void display() {
        System.out.println("Java Programming");
    }
}
public class ProtectedAccessSpecifiers extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   A a = new A();
       a.display();

	}

}
