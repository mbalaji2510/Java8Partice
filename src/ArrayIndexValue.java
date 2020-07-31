import java.util.Arrays;

public class ArrayIndexValue {
	
	public static void main(String[] args) {
		
		int [] myArray = {1,3,4,5,6};
		int n=5;
		int result = findIndex(myArray,n);
		int result2 = findIndex1(myArray,n);
		System.out.println(result);
		
		System.out.println(result2);
		
		
		
	}

	private static int findIndex1(int[] myArray, int n) {
		int result2 = 0;
		for(int i=0; i<myArray.length; i++) {

			if(myArray[i] == n) {

				result2 =i;
			}
			
	}
		return result2;
	}
	private static int findIndex(int[] myArray, int n) {
		// TODO Auto-generated method stub
		int result =Arrays.binarySearch(myArray, n);
		return result;
	}

}
