
public class Employee {

	private Integer Eid;
	private String Ename;
	private Integer Sal;
	private String Role;
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getSal() {
		return Sal;
	}
	public void setSal(int sal) {
		Sal = sal;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public Employee(int eid, String ename, int sal, String role) {
		
		this.Eid = eid;
		this.Ename = ename;
		this.Sal = sal;
		this.Role = role;
	}
	
	/*@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee temp=(Employee) obj;
			if(this.Eid==temp.Eid && this.Ename.equals(temp.Ename) && this.Sal==temp.Sal && this.Role.equals(temp.Role)) 
				return true;
			}
			return false;
		
	}*/
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee temp=(Employee) obj;
			if(this.Eid==temp.Eid && this.Ename.equals(temp.Ename)) 
				return true;
			}
			return false;
		
	}
	
	
	
	
	
	
	@Override
	public int hashCode() {
		//System.out.println(this.Eid.hashCode()+","+this.Ename.hashCode()+","+this.Sal.hashCode()+","+this.Role.hashCode());
		return (this.Eid.hashCode()+this.Ename.hashCode());
		
	}
	public Employee() {
		
	}
	
	
	
	/*public int hashCode() {
		//System.out.println(this.Eid.hashCode()+","+this.Ename.hashCode()+","+this.Sal.hashCode()+","+this.Role.hashCode());
		return (this.Eid.hashCode()+this.Ename.hashCode()+this.Sal.hashCode()+this.Role.hashCode());
		
	}*/
	
	
	
}
