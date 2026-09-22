package javaintro;

public class Methodcalling {
	static int x = h1();
	static int  h1() {
		System.out.println("method1 calling()");
		Methodcalling a= new Methodcalling();
		a.h2();
		return 0;
	}
	  int h3() {
			System.out.println("method3 calling()");
			h4();
			return 0;
		}


	public static void main(String[] args) {
		System.out.println("main method calling");
		// TODO Auto-generated method stub
	
	}
	 int h2() {
		System.out.println("method2 calling()");
		Methodcalling b= new Methodcalling();
		b.h3();
		return 0;
	}
	 static int  h4() {
		 h5();
			System.out.println("method4 calling()");
			return 0;
		}
	 static int h5() {
			System.out.println("method5 calling()");
			return 0;
		}
	 

}
