package java_fsd;

public class ParameterConstructor {
	
	 int studentYear;
	  String studentName;

	  public ParameterConstructor(int year, String name) {
	    studentYear = year;
	    studentName = name;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterConstructor s1 = new ParameterConstructor(2022, "ABC");
		    System.out.println(s1.studentYear + " " +s1.studentName);

	}

}
