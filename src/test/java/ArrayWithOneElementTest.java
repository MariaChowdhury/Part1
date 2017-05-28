import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author mariachowdhury
 *
 */
public class ArrayWithOneElementTest {

	@Test
	public void test() {
		int[] a ={2};
		CastleCount cc=new CastleCount(a);
		int x=cc.getNumberOfPeaks(a);
		assertEquals(1,x);
		int y=cc.getNumberOfValleys(a);
		assertEquals(0,y);
	}

}
