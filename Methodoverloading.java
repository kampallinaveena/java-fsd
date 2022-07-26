package java_fsd;

public class Methodoverloading {
	
	 void area(int a)
	    {
	        System.out.println("the area of the square is "+Math.pow(a, 2)+" sq units");
	    }
	    void area(int w, int h)
	    {
	        System.out.println("the area of the rectangle is "+w*h+" sq units");
	    }
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Methodoverloading ob = new Methodoverloading();
		   ob.area(5);
		   ob.area(11,12);

	}

}
