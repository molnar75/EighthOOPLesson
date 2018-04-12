package colorable.point;

import java.awt.Color;

import colorable.Colorable;

public class ColorablePoint extends Point implements Colorable {

	//Egy ősosztálya lehet egy classnak d bármennyi interfacet implementálhat
	private Color color;

	public ColorablePoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	public String toString() {
		return "ColorAblePoint color: " + color;
	}

	public Color getColor() {
		return color;
	}


	public void setColor() {
		// TODO Auto-generated method stub
	}
	
	
	
}
