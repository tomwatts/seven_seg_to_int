import org.junit.*;
import static org.junit.Assert.*;

public class SevenSegToIntTest {

	@Test
	public void sevenSegInts_Size_IsTen() {
		assertEquals(10, SevenSegToInt.getSevenSegInts().size(), 0);
	}

	@Test
	public void sevenSegInts_KeyProvided_ExpectedIntReturned() {
		assertEquals(0, SevenSegToInt.getSevenSegInts().get(" _ | ||_|"), 0);
		assertEquals(1, SevenSegToInt.getSevenSegInts().get("     |  |"), 0);
		assertEquals(2, SevenSegToInt.getSevenSegInts().get(" _  _||_ "), 0);
		assertEquals(3, SevenSegToInt.getSevenSegInts().get(" _  _| _|"), 0);
		assertEquals(4, SevenSegToInt.getSevenSegInts().get("   |_|  |"), 0);
		assertEquals(5, SevenSegToInt.getSevenSegInts().get(" _ |_  _|"), 0);
		assertEquals(6, SevenSegToInt.getSevenSegInts().get(" _ |_ |_|"), 0);
		assertEquals(7, SevenSegToInt.getSevenSegInts().get(" _   |  |"), 0);
		assertEquals(8, SevenSegToInt.getSevenSegInts().get(" _ |_||_|"), 0);
		assertEquals(9, SevenSegToInt.getSevenSegInts().get(" _ |_| _|"), 0);
	}

	@Test
	public void SevenSegStringToInt_NullInput_NegativeOneReturned() {

		// Arrange
		String n = null;

		// Act
		int actual = SevenSegToInt.SevenSegStringToInt(n);

		// Assert
		assertEquals(-1, actual, 0);

	}

	@Test
	public void SevenSegStringToInt_NotEnoughLines_NegativeOneReturned() {

		// Arrange
		String n = "   \n  |";

		// Act
		int actual = SevenSegToInt.SevenSegStringToInt(n);

		// Assert
		assertEquals(-1, actual, 0);

	}

	@Test
	public void SevenSegStringToInt_ThreeLinesWithTwoCharacters_NegativeOneReturned() {

		// Arrange
		String n =
			"  \n" +
			" |\n" +
			" |";

		// Act
		int actual = SevenSegToInt.SevenSegStringToInt(n);

		// Assert
		assertEquals(-1, actual, 0);

	}

	@Test
	public void SevenSegStringToInt_InvalidDigits_NegativeOneReturned() {

		// Arrange
		String n =
			"    _  _     _  _  _  _  _ \n" +
			"  | _| _||_||_ |_ |  |_||_|\n" +
			"  ||_  _|  | _||_||  |_| _|";

		// Act
		int actual = SevenSegToInt.SevenSegStringToInt(n);

		// Assert
		assertEquals(-1, actual, 0);

	}

	@Test
	public void SevenSegStringToInt_String1_Int1Returned() {

		// Arrange
		String n =
			"   \n" +
			"  |\n" +
			"  |";

		// Act
		int actual = SevenSegToInt.SevenSegStringToInt(n);

		// Assert
		assertEquals(1, actual, 0);
	}

	@Test
	public void SevenSegStringToInt_String12_Int12Returned() {

		// Arrange
		String n = 
			"    _ \n" +
			"  | _|\n" +
			"  ||_ ";

		// Act
		int actual = SevenSegToInt.SevenSegStringToInt(n);

		// Assert
		assertEquals(12, actual, 0);

	}

	@Test
	public void SevenSegStringToInt_String123456789_Int123456789Returned() {

		// Arrange
		String n =
			"    _  _     _  _  _  _  _ \n" +
			"  | _| _||_||_ |_   ||_||_|\n" +
			"  ||_  _|  | _||_|  ||_| _|";

		// Act
		int actual = SevenSegToInt.SevenSegStringToInt(n);

		// Assert
		assertEquals(123456789, actual, 0);

	}
}

