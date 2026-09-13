package javaintro;

public class Institute {
	static String trainerName1;
	static String trainerName2;
	String empname;
	int emptID;
	String empdes;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trainerName1);
		
		trainerName1 ="Sunitha";
		trainerName1 ="Saradha";
		
		System.out.println("Trainer_Name_1:"+ trainerName1);
		System.out.println("Trainer_Name_2:"+ trainerName2);
		
		Institute it=new Institute();
		it.empname="Saritha";
		it.emptID=12;
		it.empdes="SE";
		System.out.println("Employee_Name :"+ it.empname);
		System.out.println("Employee_T_ID :"+ it.emptID);
		System.out.println("Employee_Des :"+ it.empdes);
		
		Institute ku=new Institute();
		ku.empname="Kinnu";
		ku.emptID=29;
		ku.empdes="SE";
		System.out.println("Employee_Name :"+ ku.empname);
		System.out.println("Employee_T_ID :"+ ku.emptID);
		System.out.println("Employee_Des :"+ ku.empdes);
		
		Institute bs=new Institute();
		bs.empname="Bhanu Sri";
		bs.emptID=28;
		bs.empdes="SE";
		System.out.println("Employee_Name :"+ bs.empname);
		System.out.println("Employee_T_ID :"+ bs.emptID);
		System.out.println("Employee_Des :"+ bs.empdes);
		
		Institute s=new Institute();
		s.empname="Sunitha";
		s.emptID=19;
		s.empdes="SE";
		System.out.println("Employee_Name :"+ s.empname);
		System.out.println("Employee_T_ID :"+ s.emptID);
		System.out.println("Employee_Des :"+ s.empdes);
		
		Institute la=new Institute();
		la.empname="Likhitha";
		la.emptID=29;
		la.empdes="SE";
		System.out.println("Employee_Name :"+ la.empname);
		System.out.println("Employee_T_ID :"+ la.emptID);
		System.out.println("Employee_Des :"+ la.empdes);
		
		

	}

}
