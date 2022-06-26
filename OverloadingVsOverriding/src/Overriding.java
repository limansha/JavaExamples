class SuperA{
	public void show() {
		System.out.println("in Super Class A");
	}
}
class SubClassA extends SuperA{
	@Override
	public void show() {
		System.out.println("in Sub Class A");
	}
}

public class Overriding {

	public static void main(String[] args) {
		// method is picked at runtime and method in sub class override method in super class
		SuperA a = new SuperA();
		a.show();
		SuperA a2 = new SubClassA();
		a2.show();
	}
}
