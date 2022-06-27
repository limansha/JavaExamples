//Normal Interface  have more than one mtd declared
interface Animal{
	public void eat();
	public void sleep();
}
//Functional interface used for lambda Expressions - has only one mtd declared and any number of default methods defined(from java 8)
@FunctionalInterface
interface Funtn{
	void show();
	public default void msg() {
		System.out.println("its a default mtd so the mtd is defined in interface works from java 8");
	}
}
// Marker Interfaces --means interfaces does not having any methods - serializable interface


class Demo implements Animal{
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat to live");
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleep to rest");
	}
}
class Fun implements Funtn{
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("its a functional interface which can be written in lambda expression");
	}
}
public class TypesOfInterfaces {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.eat();
		d.sleep();
		Fun f = new Fun();
		f.show();
		f.msg(); 
		//no need to create Fun class for implementing Funtn interface rather can use anonymous class in java syntax
		Funtn f1 = new Funtn() {
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("in functional interface in anonymous class");
			}
		};
		f1.show();
		f1.msg();
		//lambda Expression
		Funtn f2 = () -> System.out.println("this is lambda Expression for method show()");
		f2.show();
		f1.msg();
		//because of default keyword and defining methods in interfaces we again encounter ambiguity problem called diamond problem
	}

}
