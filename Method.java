package javaintro;

public class Method {
	
	static void show() {
		welcome();
		System.out.println("method1 calling");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		show();
		Method t=new Method();
		t.display();
		System.out.println("main method ended");

	}
	 
	void display() {
		System.out.println("method2 calling");
		dis();
	}
	static void welcome() {
		System.out.println("method3 calling");
	}
	void dis() {
		System.out.println("method4 calling");
	}

}
