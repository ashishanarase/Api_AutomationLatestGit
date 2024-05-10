package twenty24;

public class May8 implements MayInterFace8, MayInterface{
	
	public void method1 () {
		System.out.println("Method1 without arg");
	}
	
	public void method1 (int a) {
		System.out.println("Method1 with arg");
	}
	
	public static void main (String [] args) {
		May8 objRef = new May8 ();
		objRef.method1();
		objRef.method1(10);
		
	}
}
