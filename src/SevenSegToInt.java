import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.lang.System;

public class SevenSegToInt {

	private static Hashtable<String, Integer> sevenSegInts;

	public static Hashtable<String, Integer> getSevenSegInts() {

		if(sevenSegInts == null) {
			sevenSegInts = new Hashtable<String, Integer>();
			sevenSegInts.put(" _ | ||_|", 0);
			sevenSegInts.put("     |  |", 1);
			sevenSegInts.put(" _  _||_ ", 2);
			sevenSegInts.put(" _  _| _|", 3);
			sevenSegInts.put("   |_|  |", 4);
			sevenSegInts.put(" _ |_  _|", 5);
			sevenSegInts.put(" _ |_ |_|", 6);
			sevenSegInts.put(" _   |  |", 7);
			sevenSegInts.put(" _ |_||_|", 8);
			sevenSegInts.put(" _ |_| _|", 9);
		}

		return sevenSegInts;
	}


	public static int SevenSegStringToInt(String n) {

		String[] lines = n.split("\n");

		if(lines.length != 3) {
			// TODO: Throw an error instead
			return -1;
		}

		String digit = "";
		//ArrayList<String> digits = new ArrayList<String>();

		for(int i = 0; i < lines[0].length(); i += 3) {

			digit = lines[0].substring(i, i+3);
			digit += lines[1].substring(i, i+3);
			digit += lines[2].substring(i, i+3);
		}

		return sevenSegInts.get(digit);
	}

	public static void main(String[] args) {
		System.out.println("Done!");
	}
}

