package swap_no;

public class StaticBlock {
	private int section;//non static or instance variable
	private static  int srno;//static or class variable

	//static block
	static {
		System.out.println("-------------without static block------------");
		srno=1000;
	}
	//static method
	static void display() {
		System.out.println("Serial No:"+srno);
	}
	//default constructor
	StaticBlock(){
		System.out.println("-----without default constructor--------");
		srno++;
		section++;
		
	}
	@Override
	public
	String toString() {
		return "MyClass [Serial no "+srno+",section="+section+"]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock o1=new StaticBlock();
		System.out.println(o1);
		//static method with class name
		StaticBlock.display();
		StaticBlock o2=new StaticBlock();
		System.out.println(o2);
		StaticBlock.display();
		StaticBlock o3=new StaticBlock();
		System.out.println(o3);
		StaticBlock.display();


		
	}

}
