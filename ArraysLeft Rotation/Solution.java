
/* Arrays: Left Rotation
 * Source: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 * */

public class Solution {

	static int[] rotLeft(int[] a, int d) {
		//For loop, to manipulate the number of rotations
		for(int j=0; j<d; j++) {
			int move = 0;
			int first = a[0];
			//Make rotation
			for(int i= 1; i<a.length; i++) {
				move=a[i];
				a[i-1]=move;
			}a[a.length-1]=first; 
		}
		return a;
	}

	//Test
	public static void main(String[] args) throws FileNotFoundException {

		Solution s = new Solution();
		int[] a = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
		int d = 13;
		//int[] a = {1,2,3,4,5};
		//int d = 4;
		for(Integer temp:s.rotLeft(a,d)) {
			System.out.println(temp);
		}
	}

}
