package geometric;

public class Cuboid extends Prism {

	private double a;
	private double b;
	
	public Cuboid(int height, double a, double b) {
		super(height);
		this.a = a;
		this.b = b;
	}
	
	public double getBaseArea(){
		return a*b;
	}

	public String toString() {
		return "Cuboid a: " + a + ", b: " + b + ", height: " + getHeight();
	}
	
	
}
