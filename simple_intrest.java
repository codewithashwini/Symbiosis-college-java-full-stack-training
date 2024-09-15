import java.util.*;
public class simple_intrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double year,principle;
		float intrest;
		System.out.println("Enter the Year:");
		year=sc.nextInt();
		System.out.println("Enter the Price:");
		principle=sc.nextInt();
		System.out.println("Enter the Intrest:");
		intrest=sc.nextFloat();
		double Total_simple_intrest=(principle*year*intrest)/100;
		System.out.println("Total_simple_intrest:"+Total_simple_intrest);
}

}
