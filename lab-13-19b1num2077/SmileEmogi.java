

import java.awt.Color;

import acm.graphics.GPolygon;
/**
 * 
 * @author lhamaa
 * тус класс нь Emogi классын дэд класс бөгөөд инээж буй дүрслэл харуулна.
 *
 */
public class SmileEmogi extends Emogi{
	GPolygon m;
	public SmileEmogi(int w, int h) {
		super(w,h);
		setEyeColor(Color.LIGHT_GRAY);
		setColor(Color.YELLOW);
		m=new GPolygon();		
		m.addVertex(w/10*3, h/3*2);
		m.addArc(w/5*2, h/4, 180, 180);
		m.setFillColor(Color.RED);
		m.setFilled(true);
		add(m);
	}
}
