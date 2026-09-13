package javaintro;
public class Gc {
	@Override
	protected void finalize() {
		System.out.println("final method called....");
	}
	void hello() {
		System.out.println("hello");
		Gc p4=new Gc();//out of scope
	}
	public static void main(String[] args) {
		Gc p1=new Gc();
		Gc p2=new Gc();
		Gc p3=new Gc();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		p1=null;// nullifying
		p2=p3;//reassign
		new Gc();
		System.gc();
		new Gc().hello();//anonymous
		
	}
}

