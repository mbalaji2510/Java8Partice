
public class A {
	
	public void display() {
		System.out.println("from parent method");
	}
	
	public void printData () {
		System.out.println("From parent method::printdata");
	}
	
	public static void main(String[] args) {
	
	// if possible ways for override
	// 1. create subclass object
	B b = new B();
	b.display();
	b.printData();
	//2 . create super class obect
	A a = new A();
	a.display();
	a.printData();
	
	//3 create subclass to super class - getting casting issue not posible
	//B b1 = new A();
	A a1 = new B();
	a1.display();
	a1.printData();
	
	
}

}

 class B extends A {
	 
	 public void display() {
			System.out.println("from Child method");
		}
		
		public void printData () {
			System.out.println("From Child method::printdata");
		} 
	
		/*public static void main(String[] args) {
			
			// if possible ways for override
			// 1. create subclass object
			B b = new B();
			b.display();
			b.printData();
		}*/
}
