interface Writer{
	public abstract void write();
}
class Pen implements Writer{
	@Override
	public void write() {
		System.out.println("I'm pen");
	}
}
class Other{
	public void show() {
		System.out.println("in Other");
	}
	// if for suppose both Other class and Writer interface has same method write then will there be any ambiguity? No 
	public void write() {
		System.out.println("these are other writers");
	}//
}
class Pencil extends Other implements Writer{
	@Override
	public void write() {
		System.out.println("I'm pencil");
	}
}
class Something{
	public void writer(Writer w) {
		w.write();
	}
}
public class SolnMultiInheritenceWriter {

	public static void main(String[] args) {
		Something s = new Something();
		Pen p = new Pen();
		s.writer(p);
		Pencil pc =  new Pencil(); //if pencil class needs other class methods then it can extend unlike when extending abstract class
		s.writer(pc);
		pc.show();
	}

}
