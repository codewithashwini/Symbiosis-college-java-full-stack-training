package exceptionhandling;

public class example2one_try_multi_catch {
	public static void method1() {
		
	}
	public static void method2() {
	//multi catch example
	try	{
		int a=10;
		int b=10/a;
		System.out.println("B:"+b);
		int c[]= {1,2,3,4,5};
		c[1]=15;
		System.out.println("c[15]"+c[1]);
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	catch (ArrayIndexOutOfBoundsException e1) {
		System.out.println(e1.getMessage());
	}
	catch (Exception e2) {
		// TODO: handle exception
		System.out.println(e2.getMessage());
		//two ways write exception without writing multiple catch 
		//catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method2();
	}

}
