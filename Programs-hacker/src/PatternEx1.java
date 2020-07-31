
public class PatternEx1 {
	
	public static void main(String[] args) {
		
		int num=5;
		
		for(int i=1; i<=num; i++) {
			//System.out.println(i);
			for(int j=1; j<=i; j++) {
				
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		System.out.println("resverse part");
		
		for(int rev= num; rev>=1; rev--) {
			for(int k=1; k<=rev; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
