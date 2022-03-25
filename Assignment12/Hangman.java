
/*
 * File: Hangman.java
 * ------------------
 * This program will eventually play the Hangman game from
 * Assignment #4.
 */

import acm.program.*;
import acm.util.*;

public class Hangman extends ConsoleProgram {
	private static final int APP_HEIGHT = 500;
	private static final int APP_WIDTH = 800;
	private RandomGenerator rgen = RandomGenerator.getInstance(); // RandomGenerator
	private HangmanLexicon wordDatabase = new HangmanLexicon(); // Database of
																// words
	private HangmanCanvas canvas;
	private String guessWord ;
	private String dashedWord;
	public void init() {
		super.init();
		setSize(APP_WIDTH, APP_HEIGHT);
		canvas = new HangmanCanvas();
		add(canvas);
	}

	private final static int NUMBER_OF_GUESSES = 8;
/**
 * Togloomiig ehluulne
 */
	public void run() {
		initGame();
		playGame(NUMBER_OF_GUESSES);
	}
	/**
	 * Togloomiin orching beltgene
	 */
	public void initGame(){
		canvas.reset();
		guessWord = wordDatabase.getWord(rgen.nextInt(wordDatabase.getWordCount()));
		dashedWord = createDashedWord(guessWord);
		guessWord=guessWord.toUpperCase();
		canvas.displayWord(dashedWord);
	}
	/**
	 * Hereglechees ugsun usgiig taah ugend bga esehiig shalgaad taah bolomjiig toolno.
	 * @param chance taah bolomjiin too
	 */
	public void playGame(int chance) {
			
		while (true) {
			println("Таны таах үг: " + dashedWord);//үг нууцалсан зурааснууд
			char ch = readChar("үсэг оруулна уу: ");// гараас нэг үсэг уншин
			if (!checkLetter(Character.toUpperCase(ch))) {
				chance--;
				println(ch + " үсгийг агуулаагүй байна.");
				canvas.noteIncorrectGuess(ch);
				canvas.addPart();
				if (chance == 0) {
					println("Та хожигдлоо. Таны таах үг:"+guessWord);					
					canvas.lose(guessWord);
					break;
				}
			} else {
				println(ch + " үсгийг агуулсан байна.");
				
				canvas.displayWord(dashedWord);
				if (guessWord.equalsIgnoreCase(dashedWord)) {
					println("Та хожлоо. Таны таасан үг:"+guessWord);
					canvas.win();
					break;
				}
			}
			println("Таны боломжийн тоо: "+chance);
		}
	}

	/**
	 * ugugdsun temdegt murtei adilhan urt buhii dan - temdegtuudees butsen
	 * temtegt mur uusgej butsaana
	 * 
	 * @param word
	 *            huvirgah ug
	 * @return huvirsan ug
	 */
	public String createDashedWord(String word) {
		// guitseeh
		String dash = "";
		for(int i=0; i<word.length(); i++){
			dash += "-";
		}
		return dash;

	}

	/**
	 * ugugdsun temdegt muriin pos bairlal deerh temdegtiig ch bolgoj solij
	 * bichne
	 * 
	 * @param str
	 *            temdegt muriin
	 * @param pos
	 *            bairlal deerh temdegtiig
	 * @param ch
	 *            bolgoj solij biche
	 * @return uurchilsun temdegt muriig butsaana
	 */
	public String showLetters(String str, int pos, char ch) {
		// guitseeh
		char[] chars = str.toCharArray();
	    chars[pos] = ch;
	    return String.valueOf(chars);
	}

	/**
	 * guessWord ni letter-iig aguulj baival aguulj bgaa bairlal buriin huvid
	 * dashedWord-iin hargalzah bairlal dah temdegtiig letter bolgoj uurchilnu
	 * @param letter
	 * @return guessWord ni letter-iig aguulj baival true ugui bol false utga
	 *         butsaana
	 */
	boolean checkLetter( char letter) {
		// guitseeh
		int count = 0;
		for(int i =0; i<guessWord.length(); i++){
			if(guessWord.charAt(i)==letter) {
				dashedWord = showLetters(dashedWord, i, letter);
				count++;
			}
		}
		if(count>0) return true;
		return false;
	}
	/**
	 * oroltod zuvhun neg useg ogson ued tus usgiig butsaana
	 * @param title oroltod utga unshihdaa hevlej haruulah ug
	 * @return oroltod ushsan useg
	 */
	char readChar(String title) {
		while(true){
			String str = readLine(title);
			if(str.length()==1){
				char c = str.charAt(0);
				return c;
			}
		}
	}
}