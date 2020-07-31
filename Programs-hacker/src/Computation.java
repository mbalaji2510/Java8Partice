
public class Computation {
	
	private static final int MAX_VALUE=20;
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public int sum (int ... args) {
		return MAX_VALUE;
		
	}
	
	public static void main(String[] args) {
		
		Computation c = new Computation();
		int result = c.sum(4,3);
		System.out.println(result);
		
		int result2 = c.sum(3,3,3);
		
		System.out.println(result2);
		
		int result3 = c.sum(234,1);
		System.out.println(result3);
		
		int result4 = c.sum(3,3,2,1,3);
		System.out.println(result4);
	}

}
