package Oops;
public class july6_2 {

	private int empId;
	private String name, city;
	private static final String compName = "HCL TECH";        //using final works like : value is finalized here and will not be change by anyway
		
	public july6_2(int empId, String name, String city) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
		
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

	
	public void print() {
		System.out.println("ID is : " + empId);
		System.out.println("Name is : " + name);
		System.out.println("City is : " + city);
		System.out.println("Company Name is : " + compName);
		
	}
	

		public static void main(String[] args) {
		//	july6_2.compName = "HCL TECH";      //---------> see this become an error here
			
			july6_2 ashish = new july6_2(3, "asis", "bareill");
			ashish.print();
			july6_2 laksh = new july6_2(5, "laks", "bareill");
			laksh.print();
			july6_2 shruti = new july6_2(5, "shruti", "bareill");
			shruti.print();
			
		
		
		
		
		
		}
	
	

	
	
}
