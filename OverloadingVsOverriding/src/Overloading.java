
public class Overloading {
	//methods are picked at compile time and overloading is not done on return types
	public int add(int a,int b,int c) {
		return a + b+ c;
	} 
	public int add(int a,int b) {
		return a + b;
	} 
	public static void main(String[] args) {
		Overloading ol = new Overloading();
		System.out.println(ol.add(2,3,4));
		System.out.println(ol.add(2,4));
			
	}
}
