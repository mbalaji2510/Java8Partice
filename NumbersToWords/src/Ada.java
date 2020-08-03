import java.util.Collection;

public class Ada {

	public static void main(String[] args) {
		
		Collection<String> collection = null;
		
		collection.add("foo");
		collection.forEach(System.out::println);
		
		
		
	}
}
