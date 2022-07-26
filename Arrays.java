package java_fsd;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5]; 
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);  
		
		int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
		for(int i=0;i<3;i++){  
		 for(int j=0;j<3;j++){  
		   System.out.print(arr[i][j]+" ");  
		 }  
		 System.out.println();  
		}  

	}

}
