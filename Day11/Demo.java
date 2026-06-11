package basic.Day11;

class Box {
	double height;
	double width;
	double depth;
	
	Box() {
		System.out.println("Constructor called");
		width = 10.0;
		height = 10.0;
		depth = 10.0;
	}
	
	double volume() {
		return width * height * depth;
	}
}
public class Demo {
	public static void main(String args[]) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
	}

}
