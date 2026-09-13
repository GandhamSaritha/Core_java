package javaintro;

public class Cricketer {
	static int countryID;
	static String countryName;
	int jerseyNo;
	String cricketername;
	public static void main(String[] args) {
		System.out.println(countryID);
		System.out.println(countryName);
		
		countryID=91;
		countryName="India";
		
		Cricketer msd=new Cricketer();
		msd.jerseyNo=7;
		msd.cricketername="Mahendra Singh Dhoni";
		System.out.println("countryID :" + countryID);
		System.out.println("CountryName :" + countryName);
		System.out.println("Cricketer_jersey_No. :" + msd.jerseyNo);
		System.out.println("Cricketer_cricketer_Name :" + msd.cricketername);
		
		Cricketer vk=new Cricketer();
		vk.jerseyNo=18;
		vk.cricketername="Virat Kohli";
		System.out.println("countryID :" + countryID);
		System.out.println("CountryName :" + countryName);
		System.out.println("Cricketer_jersey_No. :" + vk.jerseyNo);
		System.out.println("Cricketer_cricketer_Name :" + vk.cricketername);
		
		countryID=92;
		countryName="India";
		
		Cricketer rs=new Cricketer();
		rs.jerseyNo=59;
		rs.cricketername="Rohit Sherma";
		System.out.println("countryID :" + countryID);
		System.out.println("CountryName :" + countryName);
		System.out.println("Cricketer_jersey_No. :" + rs.jerseyNo);
		System.out.println("Cricketer_cricketer_Name :" + rs.cricketername);
		

	}

}
