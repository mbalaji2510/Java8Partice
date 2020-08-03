import java.util.Arrays;
import java.util.stream.Stream;

public class AltEx2 {
	public static void main(String[] args) {
		
		String stringArr[] = {"Sandal","Teak","Pine"};
		
		Stream<String> stringStream =Arrays.stream(stringArr);
		
		stringStream.forEach(e->e + "Wood").filter(e->e.equals);
	}

}
