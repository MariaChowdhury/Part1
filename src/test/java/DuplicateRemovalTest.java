import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * This test checks the removal of contagious duplicates
 */

/**
 * @author mariachowdhury
 *
 */
public class DuplicateRemovalTest {

	@Test
	public void test() {
		int[] a = { 1, 0, 8, 7, 5, 5, 5, 1, 10, 9, 2, 2, 20 };
		CastleCount cc=new CastleCount(a);
		int[] expected={1,0,8,7,5,1,10,9,2,20};
		ArrayList<Integer> outlist=cc.getArrayListNoDups(a);
		assertEquals(expected.length,outlist.size());
		
	}

}
