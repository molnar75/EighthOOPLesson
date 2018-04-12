package geometric.main;

import geometric.Cuboid;
import geometric.Cylinder;
import geometric.Prism;

public class Main {
	public static void main(String[] args) {
		Cuboid cuboid = new Cuboid(30, 10, 10);
		Cylinder cylinder = new Cylinder(20, 5);
		
		System.out.println(cuboid);
		System.out.println("Cuboid area: " + cuboid.getBaseArea());
		
		System.out.println(cylinder);
		System.out.println("Cylinder area: " + cylinder.getBaseArea());
		
		if(cylinder.hasBiggerVolumeThan(cuboid)){
			System.out.println("Cylinder volume is bigger\n");
		}else{
			System.out.println("Cuboid volume is bigger\n");
		}
		
		PrismData data = new PrismData(5);
		Prism cuboid1 = new Cuboid(28, 4, 8);
		Cylinder cylinder1 = new Cylinder(4, 3);
		Prism cylinder2 = new Cylinder(10, 4);
		
		data.setPrism(0, cuboid1);
		data.setPrism(2, cylinder1);
		data.setPrism(4, cylinder2);
		
		for(int i=0; i < data.getTheNumberOfElements(); i++){
			System.out.println(data.getPrismByIndex(i));
		}
		
		System.out.println("Avarage volume: " + data.getAvarageVolume());
		System.out.println("Number of cylinder: " + data.getNumberOfCylinder());
		
	}
}
