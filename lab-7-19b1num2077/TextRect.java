import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.*;

public class TextRect extends GraphicsProgram{
	void drawRectWithText(int x, int y, String txt){
		
	}
	public void run(){
		GLabel label = new GLabel("19B1NUM2077");
		label.setFont("Bold-20");
		double x = label.getWidth();
		double y = label.getHeight();
		//label.setLocation(x,2*y);
	    add(label,x,2*y);
	    
	    GRect rect = new GRect(x,y);
	    //rect.setLocation(x,y);
	    add(rect,x,y);
	}
}
