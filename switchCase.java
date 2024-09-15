package swap_no;
import java.util.*;
public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char alpha;
		String username="hffh",password;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter char value");
		alpha=sc.next().charAt(4);
		System.out.println("Char AT "+alpha);
		
		if(alpha=='a'|| alpha=='o'|| alpha =='u' || alpha=='i'||alpha=='e');{
		System.out.println("char is vowel");
		}
		{
			System.out.println("not vowel");
		}
	}

}
