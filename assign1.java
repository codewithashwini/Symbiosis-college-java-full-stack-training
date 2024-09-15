package exceptionh;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super (message);
	}
}
class InvalidLocationException extends Exception{
	public InvalidLocationException(String message) {
		super (message);
	}
}	
	

public class assign1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter Employee Name:");
			String empName=sc.nextLine();
			System.out.println("Enter employee Address:");
			String address=sc.nextLine();
			System.out.println("Enter employee age:");
			int age=sc.nextInt();
			
			if(age<68 || age>80) {
				throw new InvalidAgeException("Invalid age: Age must be betn 68 and 80");
				
			}
			System.out.println("Enter Employee location:");
			String location =sc.nextLine();
			
			if(!location.equalsIgnoreCase("pune") && !location.equalsIgnoreCase("mumbai") && !location.equalsIgnoreCase("banglore")) {
				throw new InvalidLocationException("Invalid Location: must be pune,mumbai,or banglore");
			}
			
			System.out.println("\n Employee Details");
			System.out.println("Name:"+empName);	
			System.out.println("Address:"+address);
			System.out.println("Age:"+age);
			System.out.println("Location:"+location);
		}catch (InvalidAgeException e) {
			// TODO: handle exception
			System.out.println("Error:"+e.getMessage());
		}
		catch(InvalidLocationException e) {
			// TODO: handle exception
			System.out.println("Error:"+e.getMessage());
		}finally {
			sc.close();
		}

	}
			

}
