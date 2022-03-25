import acm.program.ConsoleProgram;


public class TestConsole extends ConsoleProgram {
	public void run(){
		Student s = new Student("Davaajargal", "IT");
		s.setPhone(123445);
		s.setAddress("uvs");
		
		println(s+"\n  "+ s.getContactInfo());
		
	}
}