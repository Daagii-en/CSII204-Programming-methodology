import acm.graphics.GArc;
import acm.graphics.GRect;

import java.awt.Color;
import acm.program.GraphicsProgram;

public class Rainbow extends GraphicsProgram{

	public void run(){
		GRect rect= new GRect(0,0,getWidth(), getHeight());
		rect.setFilled(true);
		rect.setColor(Color.CYAN);
		add(rect);
		GArc rainbow = new GArc(0,0,getWidth(), getHeight(), 0, 180);
		rainbow.setFilled(true);
		rainbow.setColor(Color.RED);
		add(rainbow, 0, 0);
		GArc rainbow1 = new GArc(0,0,getWidth()-10, getHeight()-10, 0, 180);
		rainbow1.setFilled(true);
		rainbow1.setColor(Color.ORANGE);
		add(rainbow1, 0+5, 0+5);
		GArc rainbow2 = new GArc(0,0,getWidth()-20, getHeight()-20, 0, 180);
		rainbow2.setFilled(true);
		rainbow2.setColor(Color.YELLOW);
		add(rainbow2, 0+10, 0+10);
		GArc rainbow3 = new GArc(0,0,getWidth()-30, getHeight()-30, 0, 180);
		rainbow3.setFilled(true);
		rainbow3.setColor(Color.GREEN);
		add(rainbow3, 0+15, 0+15);
		GArc rainbow4 = new GArc(0,0,getWidth()-40, getHeight()-40, 0, 180);
		rainbow4.setFilled(true);
		rainbow4.setColor(Color.BLUE);
		add(rainbow4, 0+20, 0+20);
		GArc rainbow5 = new GArc(0,0,getWidth()-50, getHeight()-50, 0, 180);
		rainbow5.setFilled(true);
		rainbow5.setColor(Color.MAGENTA);
		add(rainbow5, 0+25, 0+25);
		GArc rainbow6 = new GArc(0,0,getWidth()-60, getHeight()-60, 0, 180);
		rainbow6.setFilled(true);
		rainbow6.setColor(Color.CYAN);
		add(rainbow6, 0+30, 0+30);
	}

}
