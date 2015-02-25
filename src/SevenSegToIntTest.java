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
	public void SevenSegStringToInt_StringOne_IntOneReturned() {
		assertEquals(1, SevenSegToInt.SevenSegStringToInt("   \n  |\n  |"), 0);
	}

	@Test
	public void SevenSegStringToInt_StringTwelve_IntTwelveReturned() {
		assertEquals(12, SevenSegToInt.SevenSegStringToInt("    _ \n   | _|\n  ||_ "), 0);
	}
}

