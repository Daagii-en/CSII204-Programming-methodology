
import acm.graphics.GCompound;

import acm.graphics.GPolygon;

public class GStar extends GCompound {
	GPolygon line;
	int w=40, h=40;
	public GStar(double STAR_SIZE) {
		// TODO Auto-generated constructor stub
		GPolygon line=new GPolygon();
		line.addVertex(w/2,0);
		line.addVertex(w/2+w/5, h/2-h/8);
		line.addVertex(w, h/2-h/8);
		line.addVertex(w/2+w/4, h/2+h/6);
		line.addVertex(w/2+w/4+w/5, h);
		line.addVertex(w/2, h/2+h/4);
		line.addVertex(w/2-w/4-w/5, h);
		line.addVertex(w/2-w/4, h/2+h/6);
		line.addVertex(0, h/2-h/8);
		line.addVertex(w/2-w/5,h/2-h/8);
		add(line);
	}
}
