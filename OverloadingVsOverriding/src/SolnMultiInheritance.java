//class X1 implements ConceptInterface{
//
//	@Override
//	public void model() {
//		// TODO Auto-generated method stub
//		System.out.println("in X Benz");
//	}
//	
//}
//class Y1 implements ConceptInterface{
//
//	@Override
//	public void model() {
//		// TODO Auto-generated method stub
//		System.out.println("in Y Lamborgini");
//	}
//	
//} 
class X11 extends ConceptAbstract{
	@Override
	public void model() {
		// TODO Auto-generated method stub
		System.out.println("in X11 Lamborgini");
	}
}
class Y11 extends ConceptAbstract{
	@Override
	public void model() {
		// TODO Auto-generated method stub
		System.out.println("in Y11 Benz");
	}
}

public class SolnMultiInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ConceptInterface ci = new X1();
//		ci.model();
//		ConceptInterface ci2 = new Y1();
//		ci2.model();
		ConceptAbstract ca = new X11();
		ca.model();

		ConceptAbstract ca2 = new Y11();
		ca2.model();
	}

}
