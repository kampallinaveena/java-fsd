package java_fsd;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();  
		   map.put(1,"Mango");  
		   map.put(2,"Apple");    
		   System.out.println("Iterating Hashmap : ");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		  
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  System.out.println("\nIterating HashTable : ");  
		  for(Map.Entry m:hm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
		  
		  TreeMap<Integer,String> map1=new TreeMap<Integer,String>();    
	      map1.put(100,"Amit");    
	      map1.put(102,"Ravi");    
	      map1.put(101,"Vijay");    
	      map1.put(103,"Rahul");    
	      System.out.println("\nIterating TreeMap : ");  
	      for(Map.Entry m:map1.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }    
		
	}

}
