
public class Test4 {
	
	class A {
		 void display() {
			 
			 System.out.println("display method ::parent");
			 
		 }
		 
		 void print() {
			 System.out.println("print menthod :: parent");
		 }
	}
	
	class B extends A {
		
		void display() {
			 
			 System.out.println("display method ::child");
			 
		 }
		 
		 void print() {
			 System.out.println("print menthod :: chid");
		 }
		 
		//B b = (B) new A();
		
	}
	
	public static void main(String[] args) {
		
		
	}

}
