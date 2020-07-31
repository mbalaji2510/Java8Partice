
public class PrimeEx1 {
	
	public static void main(String[] args) {
		
		int num=0;
		String primeNum="";
		
		for(int i=1; i<=100 ; i++) {
			
			int counter=0;
			
			for(num =i; num>=1; num--) {
				
				if(i%num ==0) {
					
					counter = counter+1;
					
				}
			}
			
			if(counter==2) {
				primeNum = primeNum +i+"  ";
				
			}
			
		}
		
		System.out.println(primeNum);
	}

}
