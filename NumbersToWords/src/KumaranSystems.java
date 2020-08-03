import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class KumaranSystems {
	
	
		
		private static final String filename = "input.txt";
	     
	    public static void main(String[] args) {
	    	File file = new File("scores.dat");
	        System.out.println(file.exists());
	        try {
				Scanner scan = new Scanner(file);
				System.out.println("test");
				System.out.println("test2");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        catch(Exception e) {
	        	e.printStackTrace();
	        	System.out.println("main exception");
	        }
	        
	        System.out.println("testing erwrrw");
	    }
}
