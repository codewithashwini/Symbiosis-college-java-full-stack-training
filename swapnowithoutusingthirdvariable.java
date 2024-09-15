package swap_no;

public class swapnowithoutusingthirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
        int b = 10;

        System.out.println("Before swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        a = a + b; 
        b = a - b; 
        a = a - b; 
        
        System.out.println("After swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

	}

}
