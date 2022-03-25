import java.awt.Color;


import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class RandomShapes extends GraphicsProgram{
   private RandomGenerator rgen=RandomGenerator.getInstance();
   private GOval ball;
   private double dx=2.5;
   private double dy=2.5;

   public static final int BALL_SIZE=10;
   public static final int WINDOW_WIDTH=500;
   public static final int WINDOW_HEIGHT=300;
   private static final double SPEED = 25;
   
   public void init(){
	   setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
       drawRandomShapes();
       ball=new GOval((WINDOW_WIDTH-BALL_SIZE)/2, 0, BALL_SIZE, BALL_SIZE);
       ball.setFilled(true);
       add(ball);
   }
   public void run(){
       while(true){
    	   ball.move(dx, dy);
           checkWall();
           checkCollision();
           pause(SPEED);
           if(isEmpty()) break;
       }
       drawImage();
   }
// цонхонд бөмбөгнөөс өөр обьект байхгүй эсэхийг буцаа.
   // getElementCount() арга нь цонхонд нийт хэдэн обьект зурагдсан байгааг буцаадаг.
   private boolean isEmpty() {
	   int c = getElementCount();
	   println(c);
	   if(c==1){
		   return true;
	   }
   return false;
   }
   private void checkWall() {
	   double x = ball.getX();
	   double y = ball.getY();
	   if(x+BALL_SIZE>getWidth()||x<=0)
		   changeDirection(true);
	   if(getHeight()<y+BALL_SIZE || y<=0)
		   changeDirection(false);
// бөмбөгний байрлал цонхны аль нэг хананд хүрсэн бол бөмбөгний хөдлөх чиглэлийг өөрчил
// хэрэв баруун эсвэл зүүн хананд хүрсэн бол changeDirection(true)
	// хэрэв дээд эсвэл доод хананд хүрсэл бол changeDirection(false) гэж дуудна.
	}
	private void changeDirection(boolean isX){
	if(isX) dx=-dx;
	else dy=-dy;
	}
	private void checkCollision() {
		GObject a = getElementAt(ball.getX()+BALL_SIZE,BALL_SIZE+ball.getY());
		if(a!=null){
		remove(a);
		changeDirection(true);}
		GObject b = getElementAt(ball.getX()+BALL_SIZE,ball.getY());
		if(b!=null){
		remove(b);
		changeDirection(true);}
		GObject o = getElementAt(ball.getX(),ball.getY());
		if(o!=null){
		remove(o);
		changeDirection(true);}
		GObject n = getElementAt(ball.getX(),ball.getY()+BALL_SIZE);
		if(n!=null){
		remove(n);
		changeDirection(true);}
		
	// бөмбөгний дөрвөн захийн цэгтэй мөргөлдсөн обьект байгаа эсэхийг шалга
	// хэрэв мөргөлдсөн обьект байвал түүнийг цонхноос устгаад бөмбөгний чиглэлийг өөрчил
	// getElementAt(x,y) арга нь цонхны (x,y) цэг дээр ямар нэгэн обьект байвал түүнийг
	//буцаана.ямар нэгэн обьект байхгүй бол null утга буцаадаг.
	}
	private void drawImage() {
		add(new GImage("margaret_hamilton.jpg"));
		addCitation("Eh survaj");
	}
	private void addCitation(String text) {
		// TODO Auto-generated method stub
		GLabel label = new GLabel(text);
	//	label.setFont(Arial);
		double x = getWidth() - label.getWidth();
		double y = getHeight() +label.getAscent();
		add(label,x,y);
	}
	private void drawRandomShapes() {
		
	// санамсаргүй тоон удаа санамсаргүй дүрснүүдийг цонхонд санамсаргүй байрлалд зурж харуул
		for(int i=0; i<5; i++){
			int x=rgen.nextInt(getWidth());
			int y=rgen.nextInt(getHeight());
			int w=rgen.nextInt(getWidth());
			int h=rgen.nextInt(getHeight());
			if(i%2==0)
			     add(createRect(x, y, w, h, rgen.nextColor()));
			else
			     add(createOval(x, y, w, h, rgen.nextColor()));
		}
	}
	private GObject createOval(int x, int y, int w, int h, Color c) {
		// TODO Auto-generated method stub
		GOval o=new GOval(x, y, w, h);
    	o.setColor(c);
    	return o;
	}
	private GObject createRect(int x, int y, int w, int h, Color c) {
		// TODO Auto-generated method stub
		GRect r=new GRect(x, y, w, h);
    	r.setColor(c);
    	return r;
	}
	}