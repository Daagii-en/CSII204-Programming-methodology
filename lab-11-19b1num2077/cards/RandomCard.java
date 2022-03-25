package cards;

import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class RandomCard extends GraphicsProgram{
	RandomGenerator rgen=RandomGenerator.getInstance();
	public void run() {
		RandomGenerator rgen=RandomGenerator.getInstance();
		int suit= rgen.nextInt(1,4);
		int rank = rgen.nextInt(1,13);
		Card c = new Card(suit,rank);
		add(c);
	}
}
