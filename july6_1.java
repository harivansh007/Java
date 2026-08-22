// STATIC, NON STATIC VARIABLE

package Oops;

public class july6_1 {

	
	private int empId;
	private String name, city;
	private static String compName;
	
	
	
	
	public july6_1(int empId, String name, String city) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.compName = compName;
	}
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}

	
	public void print() {
		System.out.println("ID is : " + empId);
		System.out.println("Name is : " + name);
		System.out.println("City is : " + city);
		System.out.println("Company Name is : " + compName);
		
	}
	

		public static void main(String[] args) {
			july6_1.compName = "HCL TECH";
			
			july6_1 ashish = new july6_1(3, "asis", "bareill");
			ashish.print();
			july6_1 laksh = new july6_1(5, "laks", "bareill");
			laksh.print();
			july6_1 shruti = new july6_1(5, "shruti", "bareill");
			shruti.print();
			
			
		
		//	System.out.print(july6.compName);     //-------> Static Variable
		//	System.out.print(july6.name);         //-------> Non Static Variable
			
		
		
		
		
		
		
		}
	
	
	
	

}
