import acm.program.ConsoleProgram;
public class MaxMinAverage extends ConsoleProgram {
	private static final int N=0;
	public void run (){
		int max = -32768;
		int min = 32767;
		int sum=0;
		int i=0;
		double avr;
		print("Өгөгдсөн тоон дарааллын хамгийн их ,хамгийн бага, дундаж  утгыг хэвлэдэг програм. Та эхний тоогоо оруулна уу.");
		int a = readInt(" ");
		while(true){
			if(a==N){
		        print("0-ээс өмнө ядаж нэг тоо оруулна уу..");
			    a = readInt();
		        continue;
			}
			else if(a!= N){
				while(true){
			        sum = sum + a;
		            i=i+1;
		            if (a >= max)
			             max = a;
		            if ( a <= min)
		            	min = a;
		            a = readInt("Та дараагийн тоогоо оруулна уу. Хэрвээ тоон дарааллыг дуусгах бол 0-ийг оруулна уу...");
		            if ( a == N) 
		    	        break;
				}
				avr = sum / i;
		        println("Хамгийн их утга нь  " + max);
		        println("Хамгийн бага утга нь " + min);
		        println("Дундаж утга нь " +avr );
		        break;
			}
		}
	}
}