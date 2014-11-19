import java.util.*;
import java.io.*;

public class CrossWord {
	
	private char[][] board;
	private ArrayList<String> AllEnglishWords = new ArrayList<String>();
	private String[] wordList;
	private Random randgen = new Random();

	public CrossWord(int len, int width) {
		
		board = new char[len][width];
		loadWords();
		genWordList((randgen.nextInt(5) - 2) + len * width * 3 / (5 * 5)); // Decent amount of real words, 3/5 of the board should contain legit letters, average word length = approx. 5. +/- 2 word count jff
		fillBoard(); // TO BE IMPLEMENTED LATER
	
	}

	public CrossWord() {

		board = new char[10][10];
		loadWords();
		genWordList(12 + (randgen.nextInt(5) - 2)); // Refer to ln 10
		fillBoard();

	}

	/**
	<h3>To String Method</h3>
	Returns a string containing the entire board and wordbank, intake = none.
	*/

	public String ToString() {

		String str = new String();

		for (int i = 0 ; i < board.length ; i++) {
			for (int a = 0 ; a < board[i].length ; a++) {
				str = str + board[i][a];
			}

			str = str + "\n";
		}

		str = str + "\nWord Bank:\n";
		str = str + Arrays.toString(wordList);

		return str;
	}
	/**
	<h3>loadWords Method</h3>
	Intake = none
	Output = none
	Takes all lower-case only english words from /usr/share/dict/words and puts them into ArrayList AllEnglishWords.
	*/

	private void loadWords(){

		try {
			BufferedReader br = new BufferedReader(new FileReader("/usr/share/dict/words"));
			String line;
			while ((line = br.readLine()) != null) {
				if (isAllLowerCase(line)) {
					AllEnglishWords.add(line);
				}
			}

			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!!");
		} catch (IOException E) {
			System.out.println("Program crashed while reading file");
		}
	}

	/**
	<h3>isAllLowerCase Method</h3>
	Intake = word
	Output = boolean representing if it is comprised only of lowercase characters
	*/

	private boolean isAllLowerCase(String word) {

		int asciiVal;

		for (int i = 0 ; i < word.length() ; i++) {
			asciiVal = (int)(word.charAt(i)); // ascii value of char at index i
			if (!(asciiVal > 96 && asciiVal < 123)) { // 97 = 'a' ; 122 = 'z'
				return false;
			}
		}

		return true;
	}

	/**
	<h3>genWordList Method</h3>
	Intake = size of wordList
	Output = none
	Select a random set of words from AllEnglishWords with size equal to the parameter
	and puts them into wordList.
	*/

	private void genWordList(int size) {
		
		wordList = new String[size];
		int index;

		for (int i = 0 ; i < size ; i++) {
			index = randgen.nextInt(AllEnglishWords.size());
			wordList[i] = AllEnglishWords.get(index);
		}
	}

	/**
	<h3>fillBoard Method</h3>
	Intake = none
	Output = none
	Fills the board according to wordList and randomizes the rest of the board
	*/

	private void fillBoard() {

		int direction, x, y;
		// x goes left to right
		// y goes up to down

		for (int i = 0 ; i < wordList.length ; i++) {
			direction = randgen.nextInt(8);
			
			switch(direction) {
				case 0: // going north (up)
				case 1: // going north-east (up and right)
				case 2: // going east (right)
				case 3: // going south-east (down and right)
				case 4: // going south (you get the point)
				case 5: // going south-west
				case 6: // going west
				case 7: // going north-west
			}
		}

		for (int i = 0 ; i < board.length ; i++){
			for (int a = 0 ; a < board[0].length ; a++) {
				if (board[i][a] == 0) {
					board[i][a] = '.';
				}
			}
		}
	}
}
