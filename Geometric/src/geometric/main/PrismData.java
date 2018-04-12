package geometric.main;

import geometric.Cylinder;
import geometric.Prism;

public class PrismData {

	Prism [] prismArray;

	public PrismData(int numberOfElements) {
		super();
		prismArray = new Prism[numberOfElements];
	}
	
	public void setPrism(int index, Prism prism){
		prismArray[index] = prism;
	}
	
	public int getTheNumberOfElements(){
		return prismArray.length;
	}
	
	public Prism getPrismByIndex(int index){
		return prismArray[index];
	}
	
	public int getNumberOfNotNulls(){
		int counter = 0;
		for(int i=0; i<prismArray.length; i++){
			if(prismArray[i] != null){
				counter++;
			}
		}
		return counter;
	}
	
	public double getAvarageVolume(){
		double avarage = 0;
		for(int i=0; i<prismArray.length; i++){
			if(prismArray[i] != null){
				avarage = avarage + prismArray[i].getVolume();
			}
		}
		return avarage/getNumberOfNotNulls();
	}
	
	public int getNumberOfCylinder(){
		int counter = 0;
		for(int i=0; i<prismArray.length; i++){
			if(prismArray[i] instanceof Cylinder){
				counter++;
			}
		}
		return counter;
	}
	
}
