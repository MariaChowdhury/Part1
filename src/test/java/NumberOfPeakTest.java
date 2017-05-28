import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author mariachowdhury
 *
 */
public class NumberOfPeakTest {

	@Test
	public void test() {
		int[] a = { 1, 0, 8, 7, 5, 5, 5, 1, 10, 9, 2, 2, 20 };
		CastleCount cc=new CastleCount(a);
		int x=cc.getNumberOfPeaks(a);
		assertEquals(4,x);
	}

}
