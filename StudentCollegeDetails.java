package javaintro;

public class StudentCollegeDetails {
	 static int Marks;
	 static String Name;
	 static int Rollno;
	
	
	static {
		System.out.println("NRI");
	}
	{
		System.out.println("Student Object Created!!");
	}
	public static void main(String[] args) {
		dis();
		StudentCollegeDetails t = new StudentCollegeDetails();
				t.Name="Saritha";
				t.Marks=100;
				t.Rollno=459;

		t.display();
		StudentCollegeDetails st= new StudentCollegeDetails();
		st.Name="Kinnu";
		st.Marks=100;
		st.Rollno=420;
		st.dis1();
	}

	
	void display() {
		
		System.out.println("Student Name :" + Name);
		System.out.println("Student Rollno :" + Rollno);
		System.out.println("Student Marks:" + Marks);
	}
	static void dis() {
		System.out.println("College Address: Agiripalli, Vij");
	}
	void dis1() {
		
		System.out.println("Student Name :" + Name);
		System.out.println("Student Rollno :" + Rollno);
		System.out.println("Student Marks:" + Marks);
	}
}
