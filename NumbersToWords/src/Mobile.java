import java.util.Arrays;
import java.util.Scanner;

public class Mobile {
	//COMPLETE THIS FUNCTION
    private static void process(String[] arr) {
        System.out.println(Arrays.toString(arr));
        for (String string : arr) {
			
		}
        
    }

    //you do not need to edit any code below this line
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            arr[i] = str;
        }
        process(arr);
    }
}
