package javaintro;

public class Employee {
	static String CompanyName;
	String empname;
	int empID;
	int salary;
	static {
		System.out.println("Company Name : DELL");
	}
	{
		System.out.println("vibe alone");
	}

	public static void main(String[] args) {
		Employee oops =new Employee();
		CompanyName="HP";
		System.out.println(CompanyName);
		oops.empname="sunitha";
		oops.empID=19;
		oops.salary=2005;
		System.out.println("empname:" + oops.empname);
		System.out.println("empID:" + oops.empID);
		System.out.println("salary:" + oops.salary);
	

		Employee via=new Employee();
		CompanyName="AMAZON";
		System.out.println(CompanyName);
		via.empname="Priyanka";
		via.empID=10;
		via.salary=2004;
		System.out.println("empname:" + via.empname);
		System.out.println("empID:" + via.empID);
		System.out.println("salary:" + via.salary);
	
		Employee hyd=new Employee();
		CompanyName="GOOGLE";
		System.out.println(CompanyName);
		hyd.empname="amulya";
		hyd.empID=28;
		hyd.salary=2005;
		System.out.println("empname:" + hyd.empname);
		System.out.println("empID:" + hyd.empID);
		System.out.println("salary:" + hyd.salary);
	}
}
