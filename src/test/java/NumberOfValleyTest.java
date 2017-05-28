import static org.junit.Assert.*;

import org.junit.Test;

/**

 *This test performs the test of number of valleys 
 */

/**
 * @author mariachowdhury
 *
 */
public class NumberOfValleyTest {

	@Test
	public void test() {
		int[] a = { 1, 0, 8, 7, 5, 5, 5, 1, 10, 9, 2, 2, 20 };
		CastleCount cc=new CastleCount(a);
		int x=cc.getNumberOfValleys(a);
		assertEquals(3,x);
	}

}
