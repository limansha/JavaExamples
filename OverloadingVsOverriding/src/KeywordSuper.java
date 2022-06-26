class A{
	public A() {
		System.out.println("in default Constructor of A");
	}
	public A(int n) {
		System.out.println("in  A value "+n);
	}
	public void print() {
		System.out.println("in A");
	}
}
class B extends A{
	public B() {
		super(5);
		System.out.println("in default constructor of B");
	}
	public void printed() {
		System.out.println("in B");
		super.print();
	}
}
public class KeywordSuper {

	public static void main(String[] args) {
		A a = new B(); //prints both the constructors as by default B has super(); before adding super(5) in constructor of B
		a.print();
		//a.printed(); error
		B b = new B();
		b.print();
		b.printed();
	}

}
