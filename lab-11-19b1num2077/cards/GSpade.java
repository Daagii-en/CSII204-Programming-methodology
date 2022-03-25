package cards;

import acm.graphics.GCompound;
import acm.graphics.GPolygon;

public class GSpade extends GCompound{
	public GSpade(double width, double height) {
		double w=width/2;
		double h=height*3/5;
		GPolygon body=new GPolygon();
		body.addVertex(0, h);
		body.addEdge(w, -h);
		body.addEdge(w, h);
		body.addArc(w, w, 0, -180);
		body.addArc(w, w, 0, -180);
		body.setFilled(true);
		add(body);
		double d=width/2;
		GPolygon base=new GPolygon();
		base.setLocation(d, height/3*2);
		base.addArc(d*2, height/3*2, 0, -90);
		base.addEdge(2*d, 0);
		base.addArc(d*2, height/3*2, -90, -90);
		base.setFilled(true);
		//base.addArc(arcWidth, arcHeight, start, sweep);
		add(base);

	}

}
