
public class reminder_without_r_o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int dividend = 20; 
        int divisor = 2;  
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }
        int quotient = dividend / divisor;
        int largestMultiple = quotient * divisor;
        int remainder = dividend - largestMultiple;
        
        System.out.println("The remainder of " + dividend + " divided by " + divisor + " is: " + remainder);
	}

}
