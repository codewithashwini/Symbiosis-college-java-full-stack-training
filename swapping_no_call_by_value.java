package swap_no;
import java.util.*;
public class swapping_no_call_by_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value of n1 and n2");
		Scanner sc=new Scanner(System.in);
		//variable declaration
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("before swapping numbers:"+n1+" "+n2);
		//swapping logic
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After swapping:"+n1+""+n2);
	}

}
