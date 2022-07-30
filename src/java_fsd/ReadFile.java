package java_fsd;

import java.io.File;   
import java.io.FileNotFoundException;   
import java.util.Scanner;   

public class ReadFile {

	public static void main(String[] args) {  
        try {  
            
            File f1 = new File("E:FileOperationCreate.txt");    
            Scanner dataReader = new Scanner(f1);  
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);  
            }  
            dataReader.close();  
        } catch (FileNotFoundException exception) {  
            System.out.println("Unexcpected error occurred!");  
            exception.printStackTrace();  
        }  
    }  
}
