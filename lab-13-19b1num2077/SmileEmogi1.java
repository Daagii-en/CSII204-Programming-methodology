

import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GLine;
import acm.graphics.GOval;
/**
 * 
 * @author lhamaa
 * тус класс нь дугуй нүд бүхий emogi-ийг дүрслэн харуулна
 *
 */
public class SmileEmogi1 extends GCompound{
	GOval head;
	GLine leye1,  reye1,  m;
	public SmileEmogi1(int w, int h) {
		head=new GOval(w, h);
		leye1=new GLine(w/4, h*3/8, w*3/8, h*3/8);
		reye1=new GLine(w*3/4,h*3/8, w*5/8, h*3/8);
		m = new GLine(w/4+6,h*5/8+4,w*5/8,h*5/8+4);
		head.setLocation(0, 0);
		head.setFilled(true);
		add(head);
		add(leye1);
		add(reye1);
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