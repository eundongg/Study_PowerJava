class Box{
	int width;
	int length;
	int height;
	double getVolume() {
		return (double)width*length*height; 
	}
}
public class BoxTest {

	public static void main(String[] args) {
		Box b;
		b = new Box();
		b.width = 20;
		b.length = 20;
		b.height = 30;
		
		System.out.println("the width, length, height of the box are "+ b.width +", "+ b.length+", "+b.height);
		System.out.println("the volume of the box is " + b.getVolume());

	}

}
