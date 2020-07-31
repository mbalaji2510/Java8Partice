
public class AddingTwoNum {
	
	public static void main(String[] args) {
		float f1=123.00000f;           
	       float f2=124.00000f; 
		int result = addNumbers(f1,f2);
		
		System.out.println(result);
	}

	public static int addNumbers(float a, float b) {
		int result = (int) Math.floor(a+b);
		return result;
		}
}
