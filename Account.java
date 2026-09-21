package javaintro;

public class Account {
	int accno;
	String name;
	int salary;
	static int accnogenerator=1;
	
	public static void main(String[] args){
		Account s=new Account();
		s.name="saritha";
		s.salary=100000;
		System.out.println(s.name +" "+ accnogenerator + " "+s.salary);
		Account r=new Account();
		r.name="sunitha";
		r.salary=70000;
		System.out.println(r.name + "  "+accnogenerator +" "+ r.salary);
		Account a=new Account();
		a.name="sunitha";
		a.salary=90000;
		System.out.println(a.name + "  "+accnogenerator +" "+ a.salary);
		
		
		
	}
	{
		accnogenerator++;
		accno = accnogenerator;
		
	}
}
