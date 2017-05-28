import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author mariachowdhury
 *
 */
public class EmptyArrayTest {

	@Test
	public void test() {
		int[] a = {};
		CastleCount cc=new CastleCount(a);
		int x=cc.getNumberOfPeaks(a);
		assertEquals(0,x);
		int y=cc.getNumberOfValleys(a);
		assertEquals(0,y);
		
		
	}

}
