package swap_no;

public class Employee {
	int empCode;
	String empName,address;
	public Employee(int empCode,String empName, String address) {
		this.empCode=empCode;
		this.empName=empName;
		this.address=address;
	}
	
	public void show() {
		System.out.println("Employee code:"+empCode);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee address:"+address);
		
	}
	public static void main(String [] args) {
		Employee[]  empList=new Employee[2];
		empList[0]=new Employee(13, "pooja", "UK");
		empList[1]=new Employee(10, "jaca", "USA");
		empList[0].show();
		empList[1].show();



	}
	
}
