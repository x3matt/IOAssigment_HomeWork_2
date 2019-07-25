import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestCode {

	@Test
	public void sortByLengthTest() throws Exception {
		//"Words.txt"
		List<String> res= Arrays.asList("a","bb","aaa","bbbb");
		assertEquals(res, Main.sortByLength("Words.txt"));
	}
}
