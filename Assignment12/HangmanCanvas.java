

import java.awt.Color;

import acm.graphics.*;
import acm.util.ErrorException;

public class HangmanCanvas extends GCanvas {
/**
 * 
 */
	public HangmanCanvas() {
		
		lblGuessWord=new GLabel("");
		lblGuessWord.setFont("times-30");
		lblGuessWord.setLocation( SCAFFOLD_X, SCAFFOLD_Y+SCAFFOLD_HEIGHT+lblGuessWord.getHeight());
		lblIncorrectGuess=new GLabel("Aлдсан үсэг: ", lblGuessWord.getX(), lblGuessWord.getY()+lblGuessWord.getHeight());
		lblIncorrectGuess.setFont("times-italic-20");
		lblIncorrectGuess.setColor(Color.RED);
		reset();	
		add(lblGuessWord);
		add(lblIncorrectGuess);
	}
/**
 * Togloomiin orching shineer bii bolgono.
 */
	public void reset() {
		removeAll();
		drawScaffold();
		countPart = 0;
		add(lblGuessWord);
		add(lblIncorrectGuess);
		lblGuessWord.setLabel("");
		lblIncorrectGuess.setLabel("Aлдсан үсэг: ");
	}
/**
 * draw Scaffold
 */
	private void drawScaffold() {
		add(new GLine(SCAFFOLD_X, SCAFFOLD_Y, SCAFFOLD_X + BEAM_LENGTH, SCAFFOLD_Y));
		add(new GLine(SCAFFOLD_X, SCAFFOLD_Y, SCAFFOLD_X, SCAFFOLD_Y + SCAFFOLD_HEIGHT));
		add(new GLine(SCAFFOLD_X + BEAM_LENGTH, SCAFFOLD_Y, SCAFFOLD_X + BEAM_LENGTH, SCAFFOLD_Y + ROPE_LENGTH));

	}

	/**
	 * draw Head
	 */
	private void drawHead() {
		add(new GOval(SCAFFOLD_X + BEAM_LENGTH-HEAD_RADIUS, SCAFFOLD_Y + ROPE_LENGTH, HEAD_RADIUS*2, HEAD_RADIUS*2 ));
		
		System.out.println("head");
	}

	/**
	 * draw Body
	 */
	private void drawBody() {
		add(new GLine(SCAFFOLD_X + BEAM_LENGTH, SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS*2, SCAFFOLD_X + BEAM_LENGTH, BODY_LENGTH+SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS));
		System.out.println("body");
	}

	/**
	 * draw Left Arm
	 */
	private void drawLeftArm() {
		/* You fill this in */
		add(new GLine(SCAFFOLD_X + BEAM_LENGTH,  SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS*2+ARM_OFFSET_FROM_HEAD, SCAFFOLD_X + BEAM_LENGTH-UPPER_ARM_LENGTH, SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS*2+ARM_OFFSET_FROM_HEAD));
		add(new GLine(SCAFFOLD_X + BEAM_LENGTH-UPPER_ARM_LENGTH, SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS*2+ARM_OFFSET_FROM_HEAD, SCAFFOLD_X + BEAM_LENGTH-UPPER_ARM_LENGTH,  SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS*2+ARM_OFFSET_FROM_HEAD+LOWER_ARM_LENGTH));
		System.out.println("L arm");
	}

	/**
	 * draw Right Arm
	 */
	private void drawRightArm() {
		/* You fill this in */
		add(new GLine(SCAFFOLD_X + BEAM_LENGTH,  SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS*2+ARM_OFFSET_FROM_HEAD, SCAFFOLD_X + BEAM_LENGTH+UPPER_ARM_LENGTH, SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS*2+ARM_OFFSET_FROM_HEAD));
		add(new GLine(SCAFFOLD_X + BEAM_LENGTH+UPPER_ARM_LENGTH, SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS*2+ARM_OFFSET_FROM_HEAD, SCAFFOLD_X + BEAM_LENGTH+UPPER_ARM_LENGTH,  SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS*2+ARM_OFFSET_FROM_HEAD+LOWER_ARM_LENGTH));
	System.out.println("R arm");
	}

	/**
	 * draw left leg
	 */
	private void drawLeftLeg() {
		/* You fill this in */
		add(new GLine(SCAFFOLD_X + BEAM_LENGTH, BODY_LENGTH+SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS, SCAFFOLD_X + BEAM_LENGTH-HIP_WIDTH, BODY_LENGTH+SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS));
		add(new GLine(SCAFFOLD_X + BEAM_LENGTH-HIP_WIDTH, BODY_LENGTH+SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS, SCAFFOLD_X + BEAM_LENGTH-HIP_WIDTH, LEG_LENGTH+BODY_LENGTH+SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS));
		
		System.out.println("L leg");
	}

	/**
	 * draw Right leg
	 */
	private void drawRightLeg() {
		/* You fill this in */
		add(new GLine(SCAFFOLD_X + BEAM_LENGTH, BODY_LENGTH+SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS, SCAFFOLD_X + BEAM_LENGTH+HIP_WIDTH, BODY_LENGTH+SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS));
		add(new GLine(SCAFFOLD_X + BEAM_LENGTH+HIP_WIDTH, BODY_LENGTH+SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS, HIP_WIDTH+SCAFFOLD_X + BEAM_LENGTH, LEG_LENGTH+BODY_LENGTH+SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS));
		
		System.out.println("R leg");
	}

	/**
	 * draw left Foot
	 */
	private void drawLeftFoot() {
		/* You fill this in */
		add(new GLine(SCAFFOLD_X + BEAM_LENGTH-HIP_WIDTH, LEG_LENGTH+BODY_LENGTH+SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS,SCAFFOLD_X + BEAM_LENGTH-HIP_WIDTH-FOOT_LENGTH, LEG_LENGTH+BODY_LENGTH+SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS));
	System.out.println("L leg");
	}

	/**
	 * draw Right Foot
	 */
	private void drawRightFoot() {
		/* You fill this in */
		add(new GLine(SCAFFOLD_X + BEAM_LENGTH+HIP_WIDTH, LEG_LENGTH+BODY_LENGTH+SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS,SCAFFOLD_X + BEAM_LENGTH+HIP_WIDTH+FOOT_LENGTH, LEG_LENGTH+BODY_LENGTH+SCAFFOLD_Y + ROPE_LENGTH+HEAD_RADIUS));
		System.out.println("R leg");
	}

	/**
	 * Songoson ugiig delgetsend haruulna.
	 * @param word random-r songoson useg
	 */
	public void displayWord(String word) {
		lblGuessWord.setLabel(word);
	}

	/**
	 * Buruu baisan usguudiig delgetsend haruulna.
	 * @param letter hereglegchees ugsun useg
	 */
	public void noteIncorrectGuess(char letter) {
		lblIncorrectGuess.setLabel(lblIncorrectGuess.getLabel()+Character.toUpperCase(letter)+", ");
	}

	/**
	 * Useg taaj chadaagui tohioldold biyiin heseg buriig nemj haruulna.
	 */
	public void addPart() {
		countPart++;
		switch (countPart) {
		case 1: drawHead();			break;
		case 2:	drawBody();			break;
		case 3:	drawLeftArm();		break;
		case 4:	drawRightArm();		break;
		case 5:	drawLeftLeg();		break;
		case 6:	drawRightLeg();		break;
		case 7:	drawLeftFoot();		break;
		case 8:	drawRightFoot();	break;
		default:
			throw new ErrorException("addPart: can not add part. allready lossed");
		}
	}
	/**
	 * Ugiig taaj chdsan tohioldold "Ta hojloo", "Tand bayr hurgey bichgiig" delgetsend haruulna.
	 */
	public void win() {
		GLabel label=new GLabel("Та хожлоо");
		label.setColor(Color.BLUE);
		label.setFont("arial-30");
		add(label, (getWidth()-label.getWidth())/2,(getHeight()+label.getAscent())/2);
		GLabel word=new GLabel("Танд баяр хүргэе");
		word.setColor(Color.BLUE);
		word.setFont("arial-20");
		add(word, (getWidth()-word.getWidth())/2,(label.getY()+word.getHeight()));
	}
	/**
	 * Herev bolomjiin too duusch hojigdvol "Ta hojigdloo"-g ulaanaar door ni zov hariultig gargaj haruulna.
	 * @param correctWord zuv hariu
	 */
	public void lose(String correctWord) {
		GLabel label=new GLabel("Та хожигдлоо");
		label.setColor(Color.RED);
		label.setFont("arial-30");
		add(label, (getWidth()-label.getWidth())/2,(getHeight()+label.getAscent())/2);
		GLabel word=new GLabel("Зөв хариулт - "+correctWord.toUpperCase());
		word.setColor(Color.BLUE);
		word.setFont("arial-20");
		add(word, (getWidth()-word.getWidth())/2,(label.getY()+word.getHeight()));
	}

	private int countPart;
	private GLabel lblGuessWord;
	private GLabel lblIncorrectGuess;
	/* Constants for the simple version of the picture (in pixels) */

	private static final int SCAFFOLD_X = 10;
	private static final int SCAFFOLD_Y = 10;
	private static final int SCAFFOLD_HEIGHT = 360;
	private static final int BEAM_LENGTH = 144;
	private static final int ROPE_LENGTH = 18;
	private static final int HEAD_RADIUS = 36;
	private static final int BODY_LENGTH = 144;
	private static final int ARM_OFFSET_FROM_HEAD = 28;
	private static final int UPPER_ARM_LENGTH = 72;
	private static final int LOWER_ARM_LENGTH = 44;
	private static final int HIP_WIDTH = 36;
	private static final int LEG_LENGTH = 108;
	private static final int FOOT_LENGTH = 28;

}