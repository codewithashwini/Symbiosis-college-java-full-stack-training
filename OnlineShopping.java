package swap_no;

import java.util.Scanner;

public class OnlineShopping {
	private static int custId=100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String username,password,choice;
		do {
		System.out.println("welcome to system");
		
		System.out.println("Do you want to Continue (yes/no)");
		choice=sc.nextLine();
		
		System.out.println("Enter Your Username:");
		username=sc.nextLine();
		System.out.println("Enter Your Password:");
		password=sc.nextLine();
		if(username.equals(password) && password.equals(username)) {
			System.out.println("Welcome to the system : your customer Id is:"+custId);
			custId++;
			
			
		}
		else {
			System.out.println("Invalid Username and Password");
			
		}
		System.out.println("Do you want to Add more(yes/no)");
		choice=sc.nextLine();
		}while(choice.equalsIgnoreCase("yes"));
		System.out.println("no stop");
		sc.close();
			
	}

}
