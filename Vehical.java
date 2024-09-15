package hirerchical2;

public class Vehical {
	int vehicalNo;
	String vehicalName;
	public Vehical(int vehicalNo, String vehicalName) {
		this.vehicalNo = vehicalNo;
		this.vehicalName = vehicalName;
	}
	public Vehical() {
		this.vehicalName="BMW";
		this.vehicalNo=2089;
	}
	public int getVehicalNo() {
		return vehicalNo;
	}
	public String getVehicalName() {
		return vehicalName;
	}
	@Override
	public String toString() {
		return "Vehical [vehicalNo=" + vehicalNo + ", vehicalName=" + vehicalName + "]";
	}
}
