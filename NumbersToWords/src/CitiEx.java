import java.io.FileNotFoundException;

public class CitiEx {
	public static void main(String[] args) {
		if(("Welocome").trim()==("Welocome").trim()) {
			
			System.out.println("tst");
			
			//throw new ArrayIndexOutOfBoundsException(0);
			
			//throw new FileNotFoundException();
			//throw new NullPointerException("Dat is null");
			String temp[]= {"rrr,rrr,55555"};
	
			try {
			for (int i = 0; i < temp.length; i++) {
				
				System.out.println( temp.length);
			}	
			}
			
			catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
			}
}
}
}