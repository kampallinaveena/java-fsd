package java_fsd;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("Methods of Strings");
		
		String sl=new String("Hello World");
		System.out.println(sl.length());
		
		String s1="Language";  
		System.out.println(s1.substring(2,4)); //substring
		
		String s11="hello";  
		String s12="helo";    
		System.out.println(s11.compareTo(s12));//comparison
		
		String s111="";  
		String s112="Language";   
		System.out.println(s111.isEmpty());  
		System.out.println(s112.isEmpty()); //empty
		
		String p1="HELLO stRIng";  
		String p1lower=p1.toLowerCase();  
		System.out.println(p1lower);  //LowerCase
		
		String m1="Welcome to String";  
		String replaceString=m1.replace('t','e');
		System.out.println(replaceString); //replace
		
		String s3="javalanguage";    
		String s4="JAVALANGUAGE";  
		System.out.println(s3.equals(s4));//equal
		
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		StringBuffer s=new StringBuffer("java language");
		s.append("practice programs");//append method
		System.out.println(s);

		s.insert(0, 'c');
		System.out.println(s);//insert

		StringBuffer sb=new StringBuffer("java");
		sb.replace(0, 2, "jAv");
		System.out.println(sb);//replace

		sb.delete(0, 1);
		System.out.println(sb);//delete
		
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("java");
		sb1.append("language");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "programming"));

		System.out.println(sb1.reverse());
				
			
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		String str = "Java"; 
	
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");//conversion
        System.out.println(sbr); 
          
        
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("language"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);           

	}

}
