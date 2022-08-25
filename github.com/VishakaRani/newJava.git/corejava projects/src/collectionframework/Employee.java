package collectionframework;

public class Employee {
	private int eid;
	private String ename;
	public Employee(int eid,String ename) {
		this.eid = eid;
		this.ename = ename;
	}
	
	public String toString() {
		return "Employee [eid=" + eid + ".ename=" + ename + "]";
	}

}
