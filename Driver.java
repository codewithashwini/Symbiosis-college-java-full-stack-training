package hirerchicalinheritance;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Person p1=new Person();
			System.out.println("person details");
			System.out.println(p1);
			//dynamic allocation of  a memory for a parent to the child
			Person p;
			p=new Person("ashu");
			 if (p instanceof Person) {
				System.out.println("person details"+p);	
			}
			 
			 p=new Employee(12,"IT");
			 if(p instanceof Employee) {
				 System.out.println("employee details"+p);
			 }
	}

}
