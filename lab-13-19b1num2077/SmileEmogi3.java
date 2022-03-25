

import java.awt.Color;

import acm.graphics.GLine;
//import acm.graphics.GOval;
/**
 * 
 * @author lhamaa
 * тус класс нь дугуй нүд бүхий emogi-ийг дүрслэн харуулна
 *
 */
public class SmileEmogi3 extends Emogi{
	GLine m, leyebrow, reyebrow;
	public SmileEmogi3(int w, int h) {
		super(w,h);
		leye.setLocation(w/5, h/3);
		reye.setLocation(w*4/5-w/6, h/3);
		leyebrow = new GLine(w/6, h/3, w*3/8, h/4 );
		reyebrow = new GLine(w*5/6, h/3, w*5/8, h/4 );
		m = new GLine(w/4+6,h*5/8,w*5/8,h*5/8);
		head.setFilled(true);
		head.setFillColor(Color.yellow);
		reye.setFilled(true);
		reye.setFillColor(Color.blue);
		leye.setFilled(true);
		leye.setFillColor(Color.blue);
		add(leyebrow);
		add(reyebrow);
		add(m);
		
	}
	/**
	 * GObject классын өнгө өгөх аргыг дахин тодорхойлсон.
	 *  @param color нь толгойн өнгө болно
	 */
	public void setColor(Color color) {
		head.setFillColor(color);
	}
}