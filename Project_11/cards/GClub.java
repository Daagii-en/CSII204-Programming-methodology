package cards;


import acm.graphics.*;

public class GClub extends GCompound {

	public GClub(double width, double height) {
		double d=width/2;
		double d2=height/3;
		GOval o1=new GOval((width-width/2)/2,0,d, d);
		GOval o2=new GOval(0,d2,d, d);
		GOval o3=new GOval(width/2,d2,d, d);
		add(o1);
		add(o2);
		add(o3);
		o1.setFilled(true);
		o2.setFilled(true);
		o3.setFilled(true);
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
