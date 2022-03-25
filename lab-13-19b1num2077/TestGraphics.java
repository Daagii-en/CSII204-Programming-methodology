import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
public class TestGraphics extends GraphicsProgram{
	
	RandomGenerator rgen=RandomGenerator.getInstance();
	private GPoint last;
	private GObject gobj;
	
	
	public void keyTyped(KeyEvent e){
	
		int x = rgen.nextInt(getWidth());
		int y = rgen.nextInt(getHeight());
		int w = rgen.nextInt(getWidth()-x);
		int h = rgen.nextInt(getHeight()-y);
	
		switch (e.getKeyChar()){
			case 's': 
				add(new Emogi(w,h),x,y);
				break;
			case 'c': 
				add( new GStar(w),x,y);
				break;
			case 'r': 
				add(new SmileEmogi1(w,h), x, y);
				break;
			case 't': 
				add(new SmileEmogi2(w,h), x , y);
				break;
			case 'k': 
				add((new SmileEmogi3(w,h)), x , y); 
				break;
		}
	}
	public void init(){
		addKeyListeners(this);
		addMouseListeners();
	}
	public void mousePressed(MouseEvent e){
		last = new GPoint(e.getPoint());
		gobj = getElementAt(last);
	}
	public void mouseDragged(MouseEvent e){
		if(gobj != null){
			gobj.move(e.getX()-last.getX(),e.getY()-last.getY());
			last = new GPoint(e.getPoint());
		}
	}
	public void mouseClicked(MouseEvent e){
		if(gobj != null) gobj.sendToFront();
	}
	public void keyPressed(KeyEvent e){
		if(gobj != null){
			switch (e.getKeyCode()){
			case KeyEvent.VK_UP: gobj.move(0, -1); break;
			case KeyEvent.VK_DOWN: gobj.move(0, 1); break;
			case KeyEvent.VK_LEFT: gobj.move(-1, 0); break;
			case KeyEvent.VK_RIGHT: gobj.move(1, 0); break;
			}
		}
	}

	
}
