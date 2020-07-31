import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingNumHacker {

	public static void main(String[] args) {

		List<Integer> toSortArray = new ArrayList<>();

		toSortArray = Arrays.asList(2, 5, 6, 35, 63, 2);

		List<Integer> result = sort(toSortArray);
		System.out.println("Final result is " + result);
		List<Integer> result1 = sort1(toSortArray);
		System.out.println("Final result is " + result1);

		
	}

	
	private static List<Integer> sort1(List<Integer> toSortArray) {
		// TODO Auto-generated method stub
		Integer[] sort = (Integer[]) toSortArray.toArray();
		int temp;
		for(int i=0; i<sort.length; i++) {
			for( int j=i+1; j<sort.length; j++) {
				if(sort[i]>sort[j]) {
					temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;
					
					
				}
			}
		}
		
		List<Integer> result = Arrays.asList(sort);
		for (Integer sortData : sort) {
			
			System.out.println(sortData);
		}
		return result;
	}


	private static List<Integer> sort(List<Integer> toSortArray) {
		// TODO Auto-generated method stub
		List<Integer> result = new ArrayList<>();
		System.out.println(toSortArray);

		Set<Integer> ascData = new TreeSet<>(toSortArray);
		System.out.println(ascData);
		result.addAll(ascData);
		return result;
	}
}
