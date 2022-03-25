package SmilePakage;

import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GObject;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class RandomEmogi extends GraphicsProgram{
	private RandomGenerator random=RandomGenerator.getInstance();
	/**
 * тус арга нь санамсаргүй утга сонгон тус утгад харгалзах emogi-ийг санамсаргүй хэмжээтэй үүсгэн санамсаргүй байрлалд байршуулдаг.
 * зөвхөн гүйцээх гэж заасан мөр тус бүрд харгалзах зааврыг бичснээр програм бүрэн болно.
 */
	
	public void run() {		
		GCompound s;
		double x, y;
		
		
		while(true){
			
			int size=random.nextInt(20,100);
			int w=getWidth();
			int h=getHeight();
			int key=random.nextInt(0, 5);
			Color c=random.nextColor();
			switch (key) {
			case 0:
				s=new SmileEmogi(size, size);
				break;		
				//---> 1
				/*
			case 1:
				//гүйцээх
				break;
			case 2:
				//гүйцээх
				break;
			case 3:
				//гүйцээх
				break;
				*/
				//<--- 2
			default:
				s=new Emogi(size, size);
				break;
			}		
			x=random.nextDouble(0,w-size);
			y=random.nextDouble(0,h-size);
			s.setLocation(x, y);
			s.setColor(random.nextColor());
			add(s);
			s.setColor(c);
			pause(200);
			// дараах давталт нь цонхонд зурагдсан дүрснүүдийг хөдлөж буй мэт харагдуулах зорилготой.
			for (int i = 0; i < getElementCount(); i++) {
				double d=random.nextDouble(-3,3);				
				GObject o=getElement(i);
				o.move(d,d);
			}
			
		}
		
		
	}
}
