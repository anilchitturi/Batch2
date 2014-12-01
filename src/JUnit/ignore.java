package JUnit;

import org.junit.Ignore;
import org.junit.Test;

public class ignore {
	
	@Ignore("Test is ignored as a demonstration")
	@Test
	public void testSane() {
	}

}
