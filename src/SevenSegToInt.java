import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.System;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class SevenSegToInt
{
	private static Hashtable<String, Integer> sevenSegInts;

	public static Hashtable<String, Integer> getSevenSegInts()
	{
		if(sevenSegInts == null)
		{
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

	/**
	 * Converts a string that contains a representation of an integer into an
	 * actual integer.  Returns -1 if the input is invalid.
	 * 
	 * @param	n	3 lines of a seven segment number
	 * @return		an integer representation of the passed number, -1 on invalid
	 * 				input.
	 */
	public static int SevenSegStringToInt(String n)
	{
		if(n == null)
		{
			return -1;
		}

		String[] lines = n.split("\n");

		// Check the format of the string passed
		if(lines.length != 3)
		{
			return -1;
		}
		else
		{
			for(int i = 0; i < 3; i++)
			{
				if(lines[i].length() % 3 != 0)
				{
					return -1;
				}
			}
		}

		int result = 0;

		for(int i = 0; i < lines[0].length() / 3; i++)
		{
			int startIndex = i * 3;
			int endIndex = i * 3 + 3;

			String digit =
				lines[0].substring(startIndex, endIndex) +
				lines[1].substring(startIndex, endIndex) +
				lines[2].substring(startIndex, endIndex);

			if(!getSevenSegInts().containsKey(digit))
			{
				return -1;
			}
			
			result *= 10;
			result += getSevenSegInts().get(digit);
		}

		return result;
	}

	public static void main(String[] args) throws IOException
	{
		if(args.length != 1)
		{
			System.err.println("Error: no input file provided");
			System.exit(1);
		}

		File inFile = new File(args[0]);

		if(!inFile.exists())
		{
			System.err.println("Error: input file does not exist");
			System.exit(1);
		}

		BufferedReader inFileReader = new BufferedReader(new FileReader(inFile));

		try
		{
			String line;
			//while((line = inFileReader.readLine()) != null)
			while((line = inFileReader.readLine()).matches("\\s+"))
			{
				System.out.println(line);
			}
		}
		finally
		{
			inFileReader.close();
		}

		System.out.println("Done!");
	}
}

