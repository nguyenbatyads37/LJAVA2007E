package t3h.ljava2007a.bankService;

public class Customer {
	private String name;
	private String cmnd;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	
	public Customer(String name, String cmnd) {
		super();
		this.name = name;
		this.cmnd = cmnd;
	}
	
	public Customer() {
		super();
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", cmnd=" + cmnd + "]";
	}
}
