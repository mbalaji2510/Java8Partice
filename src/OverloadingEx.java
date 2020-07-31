
public class OverloadingEx {
	
	public static void gfg(String s) {
		System.out.println("string");
	}
	
	public static void gfg(Object obj) {
		System.out.println("object");
	}
	
	public static void main(String[] args) {
		
		gfg(null);
		
	}

}
