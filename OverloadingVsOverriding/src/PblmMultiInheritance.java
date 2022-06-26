class X{
	public void model() {
		System.out.println("Benz");
	}
}
class Y{
	public void model() {
		System.out.println("Lamborgini");
	}
}
//class Abc extends X,Y{ } gives error 
public class PblmMultiInheritance {

	public static void main(String[] args) {
		//class Abc inherits X and Y classes
	//	Abc a = new Abc();
	//	a.model(); //ambigious to pick which model so that's why java doesn't allow multiple inheritance thus can be achieved using Interfaces
	}

}
