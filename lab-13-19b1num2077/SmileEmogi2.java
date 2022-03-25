

import java.awt.Color;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
/**
 * 
 * @author lhamaa
 * тус класс нь дугуй нүд бүхий emogi-ийг дүрслэн харуулна
 *
 */
public class SmileEmogi2 extends SmileEmogi1{
	GOval leye; 
	GPolygon m;
	public SmileEmogi2(int w, int h) {
		super(w,h);
		leye=new GOval(w/5, w/5);
		add(leye, w*3/16, h/4);
		head.setFillColor(Color.yellow);
		head.setFilled(true);
		leye.setFilled(true);
		m=new GPolygon();		
		m.addVertex(w/4+5, h/3*2);
		m.addArc(w/5*2, h/4+2, 180, 180);
		m.setFillColor(Color.RED);
		m.setFilled(true);
		add(m);
	}
	
	public void setColor(Color color) {
		head.setFillColor(color);
	}
}