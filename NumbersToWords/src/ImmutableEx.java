import java.util.ArrayList;
import java.util.List;

public class ImmutableEx {
	
	public static void main(String[] args) {
		
		String s = "sachin";
		s.concat("T");
		System.out.println(s);
		
		List<String> dummyData = new ArrayList<String>();
		
		dummyData.add("bala1");
		dummyData.add("bala2");
		dummyData.add("bala3");
		dummyData.add("bala4");
		dummyData.add("bala5");
		String variableName[] = null;
		variableName = new String[dummyData.size()];
		for(int i=0; i<5; i++) {
			//variableName = new String[dummyData.size()];
			variableName[i] = dummyData.get(0);
			System.out.println(variableName[i]);
		}
		
		testData(variableName);
		
	}

	private static void testData(String[] variableName) {
		// TODO Auto-generated method stub
		
		System.out.println(variableName.length);
		System.out.println(variableName);
		
	}

}
