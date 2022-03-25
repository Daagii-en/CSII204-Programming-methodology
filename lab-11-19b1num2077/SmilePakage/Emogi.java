package SmilePakage;

import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GOval;
/**
 * 
 * @author lhamaa
 * тус класс нь дугуй нүд бүхий emogi-ийг дүрслэн харуулна
 *
 */
public class Emogi extends GCompound{
	GOval head;
	GOval leye, reye;
	public Emogi(int w, int h) {
		head=new GOval(w, h);
		leye=new GOval(w/5, w/5);
		reye=new GOval(w/5, w/5);		
		head.setLocation(0, 0);
		leye.setLocation(w/5, h/5);
		reye.setLocation(w/5*3, h/5);
		add(head);
		add(leye);
		head.setFillColor(Color.yellow);
		head.setFilled(true);
		add(reye);
	}
	/**
	 * нүдний өнгийг өөрчлөх арга
	 * @param color нь нүдний өнгө болно
	 */
	public void setEyeColor(Color color) {
		super.setColor(color);
		leye.setColor(color);
		leye.setFilled(true);
		reye.setColor(color);
		reye.setFilled(true);
	}
	/**
	 * GObject классын өнгө өгөх аргыг дахин тодорхойлсон.
	 *  @param color нь толгойн өнгө болно
	 */
	public void setColor(Color color) {
		head.setFillColor(color);
	}
}
