/*
 * now if we have a class B whose whole purpose is to extend class A and override show () 
 * method then we no need to create B class other than this we can use Ambigious class 
 * */
class Ambi{
	public void show() {
		System.out.println("in A");
	}
}
interface AmbiInf{
	public abstract void show();
}
public class AnonymousClass {
	public static void main(String[] args) {
		Ambi a = new Ambi();
		a.show();
		Ambi a1 =  new Ambi() {
			public void show() {
				System.out.println("in B");
			}
		};
		a1.show(); //is Ambigious class i.e class with no name
		//ambigious class is also possible with interfaces from java 8
		AmbiInf aif = new AmbiInf() {
			
			@Override
			public void show() {
				System.out.println("this is ambigious class of interface");
			}
		};
		aif.show();
	}
}
