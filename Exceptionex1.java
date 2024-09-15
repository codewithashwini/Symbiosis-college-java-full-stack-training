package exceptionhandling;

public class Exceptionex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=0;
		try {
			int c=a/b;
			System.out.println("c:" +c);
			int d=a+b;
			System.out.println("d:" +d);
			int e=a-b;
			System.out.println("e:" +e);


		}
		catch(Exception e) {
			System.out.println("divided by zero not possible");
			System.out.println(e.getMessage());
		}
	} 

}
