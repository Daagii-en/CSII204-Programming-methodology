package cards;

import java.awt.Color;

import acm.graphics.GPolygon;

public class GDiamonds extends GPolygon{

	public GDiamonds(double width, double height) {
		
		addVertex(0, height/2);
		addEdge(width/2, -height/2);
		addEdge(width/2, height/2);
		addEdge(-width/2, height/2);
		addEdge(-width/2, -height/2);
		setFillColor(Color.red);
		setFilled(true);
		setLocation(width, height);
	}

}
