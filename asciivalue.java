import java.util.*;
public class asciivalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	       System.out.print("Enter a character: ");
	        char character = scanner.next().charAt(0);

	        int asciiValue = (int) character;
	        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);
	        scanner.close();
	}

}
