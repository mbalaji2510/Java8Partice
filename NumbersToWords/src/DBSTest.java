
public class DBSTest {
	
	static DBSTest t;
	
	static int count =0;
	
	public static void main(String[] args) throws InterruptedException {
		
		DBSTest t1 = new DBSTest();
		
		t1=null;
		
		System.gc();
		
		Thread.sleep(1000);
		
		System.out.println("finalized method called "+count+ "times");
	}
	
	@Override
	protected void finalize() {
		count++;
		t= this;
		
	}

}
