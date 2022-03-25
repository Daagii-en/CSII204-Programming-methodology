import acm.program.*;
public class Bodlogo2 extends DialogProgram {

	public void run (){
	    int zereg = 0;
	    int zereg_devchuul = 1;
	    int a = readInt("Ta a toog oruulna uu?");
	        while (true){
	        	zereg_devchuul = zereg_devchuul * a;
	            if(zereg_devchuul > N) break;
	            zereg = zereg + 1;
	        }
	        zereg_devchuul = zereg_devchuul / a;
	        println(a+"-iin " +zereg+ " zeregt ni " +zereg_devchuul+ "  bn");
	    }
	    private static final int N = 1000000;
}