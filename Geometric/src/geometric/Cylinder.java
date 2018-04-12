package geometric;

public class Cylinder extends Prism{

	double radius;

	public Cylinder(int height, double radius) {
		super(height);
		this.radius = radius;
	}
	
	public double getBaseArea(){
		return radius*radius*Math.PI;
	}

	public String toString() {
		return "Cylinder radius: " + radius + ", height: " + getHeight();
	}
	
}
