interface Demo1{
	public default void show() {
		System.out.println("in Demo1 ");
	}
	//static methods can't be overriden in implementation classes
	public static void schoolName() {
		System.out.println("Xavier ");
	}
}
interface Demo2{
	public default void show() {
		System.out.println("in Demo2 ");
	}
}
//we get error Duplicate default methods named show with the parameters () and () are inherited from the types Demo1 and Demo as its amibigious
//is to own Implement the method show in this class as well that will override the default methods
class DemoImpl2 implements Demo2,Demo1{
	@Override
	public void show() {
		Demo2.super.show();// is using super keyword calling the show mtd from interface you want
	}
}
class DemoImpl1 implements Demo2,Demo1{
	@Override
	public void show() {
		System.out.println("in implementation class overriden");
	}
}
public class DiamondProblem {
	public static void main(String[] args) {
		DemoImpl1 d1 = new DemoImpl1();
		DemoImpl2 d2 = new DemoImpl2();
		d1.show();
		d2.show();
		Demo1.schoolName();
	}
}
