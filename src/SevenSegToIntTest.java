import org.junit.*;
import static org.junit.Assert.*;

public class SevenSegToIntTest {

	@Test
	public void alwaysPasses() {

		assertTrue(SevenSegToInt.SevenSegStringToInt("") == -1);
	}
}

