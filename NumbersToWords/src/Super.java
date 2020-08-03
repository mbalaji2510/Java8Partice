
public class Super {
	public String test="";
	 static void dispaly() {
		System.out.println("Display data from super class");
	}
	public static void main(String[] args) {
		SubCalss sub = new SubCalss();
		sub.dispaly();
		//sub.printData();
		//Super obj = new Super();
		
		//obj.dispaly();
		
	}
}

class SubCalss extends Super{
	public String test="";
	 static void dispaly() {
			System.out.println("Display data from sub class");
		}
	void printData() {
		System.out.println("print data");
	}
	
}