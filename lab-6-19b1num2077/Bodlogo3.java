import java.awt.Color;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Bodlogo3 extends GraphicsProgram {
	private static final int n=7;
    public void run() {
	    double width = 0;
	    double height = 0;
	        
	    for(int i = 0; i < n; i++){
	    	if(i % 2 == 0){
	    		GRect rect = new GRect(width, height, this.getWidth()-width*2-1, this.getHeight()-height*2);
	    		rect.setFilled(true);
	    		rect.setColor(Color.BLUE);
	    		add(rect);
	    	} 
	    	else {
	    		GRect rect = new GRect(width-n/2+1, height-n/2, this.getWidth()-width*2,this.getHeight()-height*2+1);
	    		rect.setFilled(true);
	    		rect.setColor(Color.CYAN);
	    		add(rect);
	    	}
	    	width = width + this.getWidth()/(2*n);
	    	height = height + this.getHeight()/(2*n);
	    }
      
   }
}
