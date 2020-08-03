public class HclTest {
	 static int add(int i,int j) {
		return i+j;
	}
}

 class HclTestSub extends HclTest {
	public static void main(String[] args) {
		short s = 9;
		System.out.println(add(s,6));
	}
	
}