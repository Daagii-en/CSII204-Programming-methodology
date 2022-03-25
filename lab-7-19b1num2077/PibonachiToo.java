import acm.program.*;
public class PibonachiToo extends ConsoleProgram{
	public void run(){
		print("Фибоначи тоог олох програм . Энд анхны тоо нь 0,хоёр дахь тоо 1 гэж гарааны утга онооно.");
		int n1=1, n2=1, n3;
		int a = readInt("Тоон дарааллын хязгаараа оруул: ");
		while(n1<a){
			println(n1);
			n3 = n1 + n2 ;
			n1 = n2;
			n2 = n3;
		}
	}   
}
