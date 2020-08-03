
public class BaseDBS {
	
	private int data;
	
	public BaseDBS() {
		data = 5;
	}
	
	public int getData() {
		return this.data;
	}

}

class Derived extends BaseDBS
{
	private int data;
	
	public Derived() {
		data = 6;
		
	}
	
	private int getData() {
		return data;
		
	}
}
