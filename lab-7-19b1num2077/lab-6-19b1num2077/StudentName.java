
import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class StudentName extends GraphicsProgram{
	private static final int RECT_WIDTH=150; //tegsh untsugtiin urgun
	private static final int RECT_HEIGHT=RECT_WIDTH/2; //tegsh untsugtiin undur
	private static final int OVAL_HEIGHT=60; //toirgiin undur
	static final int OVAL_WIDTH=OVAL_HEIGHT/3*2; //toirgiin urgun
	static final int LINE_LENGTH=50; // shuluunii urt
	static final Color RECT_COLOR=Color.GREEN;
	static final Color OVAL_COLOR=Color.YELLOW;
	static final Color LINE_COLOR=Color.CYAN;
	static final int LINE_WIDTH= 10;
	
	public void run() {
		 GLine line = new GLine(this.getWidth()+OVAL_WIDTH,OVAL_HEIGHT+OVAL_WIDTH,this.getWidth()+OVAL_WIDTH,LINE_LENGTH*4);
	     line.setColor(LINE_COLOR);
	     add(line);
		 GOval oval = new GOval(this.getWidth()+OVAL_WIDTH/2,(this.getHeight()-OVAL_HEIGHT)/2, OVAL_WIDTH, OVAL_HEIGHT);
	     oval.setFilled(true);
	     oval.setFillColor(OVAL_COLOR);
	     add(oval);
		 GRect rect = new GRect(this.getWidth()-OVAL_WIDTH,this.getHeight(), RECT_WIDTH, RECT_HEIGHT);
		 rect.setFilled(true);
		 rect.setFillColor(RECT_COLOR);
	     add(rect);
	     GLabel label = new GLabel("Ө.Даваажаргал",(this.getWidth()-OVAL_WIDTH), OVAL_HEIGHT);
		 label.setFont("Bold-20");
		 label.setColor(Color.RED);
	     add(label);
	}
}
