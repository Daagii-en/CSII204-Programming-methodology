import acm.program.*;
public class TogsToo extends ConsoleProgram{
	private boolean isPerfect(int n){
		int sum=0;
		for(int i=1; i<n; i++){
			if(n%i==0)
				sum=sum+i;
		}
		if(sum==n)
			return true;
		else 
			return false;
	}
	public void run(){
		int n = readInt("тоогоо оруулна уу: ");
		for (int i=2; i<=n; i++){
			boolean x = isPerfect(i);
			if ( x == true)
				println(i+ " бол төгс тоо юм.");
		}
	}
}
