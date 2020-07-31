
public class Bike {
	
	void run() {
		System.out.println("runnig");
	}
	
	protected Number speed() {
		System.out.println("Number speed");
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("test");
		Bike b = new splender();
		b.run();
		b.speed();
	}

}

class splender extends Bike {
	void run() {
		System.out.println("Slender bike runing");
	}
	@Override
	public Integer speed() {
		System.out.println("Integer speed");
		return 20;
		
	}
	
}
