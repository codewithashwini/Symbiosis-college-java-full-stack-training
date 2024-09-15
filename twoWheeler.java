package hirerchical2;

class twoWheeler extends Vehical{
	String type;
	int no;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public twoWheeler() {
		this.type="swift";
		this.no=1;
	}
	public twoWheeler(int vehicalNo, String vehicalName, String type, int no) {
		super(vehicalNo, vehicalName);
		this.type = type;
		this.no = no;
	}
	@Override
	public String toString() {
		return "twoWheeler [type=" + type + ", no=" + no + "]";
	}
	}
