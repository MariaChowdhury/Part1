import java.util.ArrayList;

/**
 * This class takes an array of integers and counts the number of valleys or
 * peaks. Assumption, first element and last element of the array are compared
 * with following and preceding respective elements of the array
 * 
 * @author mariachowdhury
 * @version 1
 */

public class CastleCount {
	int[] a;
	public CastleCount(int[] a){
		this.a=a;
	}
	/**
	 * This method inserts the elements of the array to a list where contagious
	 * duplicates are removed
	 * 
	 * @param a
	 *            is an array of int
	 * @return list
	 */
	public ArrayList<Integer> getArrayListNoDups(int[] a) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(a[0]);
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] == a[i])
				continue;
			else {
				al.add(a[i]);
			}

		}
		return al;
	}

	/**
	 * This method counts the number of castles in the valleys. Assumption:
	 * first element and last element of the array are compared with following
	 * and preceding respective elements of the array
	 * 
	 * @param a
	 *            is an array of int
	 * @return number of castles in valleys
	 */
	public int getNumberOfValleys(int[] a) {
		/*if the array is empty or with one element only.If there is only one element,
		i.e., no valleys*/
		if (a.length == 0 || a.length == 1) {
			System.out.println("Number of castles in valleys: " + 0);
			return 0;
			}

		/* duplicate contagious elements of the array are removed 
		as they are considered as one peak or one valley*/
		ArrayList<Integer> al = getArrayListNoDups(a);
		int count = 0;
		int i = 0;

		// decision to build a castle at the start of the array
		if (al.get(0) < al.get(1)) {
			count++;
			i++;
		}
		for (i = i + 1; i < al.size() - 1; i++) {
			if (al.get(i) < al.get(i + 1) && al.get(i) < al.get(i - 1)) {
				count++;
			}
		}

		// decision to build a castle at the end of the array
		if (al.get(al.size() - 1) < al.get(al.size() - 2)) {
			count++;
		}
		return count;
	}

	/**
	 * 
	 * This method counts the number of castles in the peaks. Assumption: first
	 * element and last element of the array are compared with following and
	 * preceding respective elements of the array
	 * 
	 * @param a
	 *            is an array of int
	 * @return number of castles in peaks
	 */
	 public int getNumberOfPeaks(int[] a) {
		//// if the array is empty or with one element only
		if (a.length == 0 || a.length == 1) {
			System.out.println("Number of castles in peaks or peakss: " + a.length);
			return a.length;
			}

		// duplicate contagious elements of the array are removed
		ArrayList<Integer> al = getArrayListNoDups(a);
		int count = 0;
		int i = 0;

		// decision to build a castle at the start of the array
		if (al.get(0) > al.get(1)) {
			count++;
			i++;
		}

		for (i = i + 1; i < al.size() - 1; i++) {
			if (al.get(i) > al.get(i + 1) && al.get(i) > al.get(i - 1)) {
				count++;
			}
		}

		// decision to build a castle at the end of the array
		if (al.get(al.size() - 1) > al.get(al.size() - 2)) {
			count++;
		}
		return count;
	}


}
