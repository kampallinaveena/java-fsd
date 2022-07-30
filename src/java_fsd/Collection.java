package java_fsd;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ArrayList");
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ravi"); 
		list.add("Vijay");  
		System.out.println(list);  
		
		  System.out.println("\n");
	      System.out.println("Vector");
	      Vector<String> v=new Vector<String>();  
	      v.add("Ayush");  
	      v.add("Amit");  
	      System.out.println(v);  
	      
	      
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> al=new LinkedList<String>();  
	      al.add("Ravi");  
	      al.add("Vijay");
	      System.out.println(al);  
			
	      System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<String> set=new HashSet<String>();  
	       set.add("Ravi");  
	       set.add("Vijay"); 
	       System.out.println(set);
	       
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<String> set1=new LinkedHashSet<String>();  
	       set1.add("Ravi");  
	       set1.add("Vijay"); 
	       System.out.println(set1);

	}

}
