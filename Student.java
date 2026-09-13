package javaintro;

public class Student {
	
	static String collegeName;
	int studentID;
	String studentName;
	int studentMarks;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(collegeName);
		collegeName="NRI";
		Student sari = new Student();
		sari.studentID=59;
		sari.studentName="Saritha";
		sari.studentMarks=100;
		System.out.println("CollegeName :" +collegeName);
		System.out.println("StudentID :" +sari.studentID);
		System.out.println("StudentName :" +sari.studentName);
		System.out.println("StudentMarks :" +sari.studentMarks);

	}

}
