import java.util.ArrayList;
import java.util.Arrays;

//https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/

public class Solution {

	public int solution(int[] A) {
		int smallest=0;	
		Arrays.sort(A);
		//Make an array to put consecutive positive numbers without duplicate elements
		ArrayList<Integer> list = new ArrayList<Integer>();
		try {
			for(int i=0; i<A.length; i++) {
				if(A[i]>0 && A[i]!=A[i+1]) {
					list.add(A[i]);
				}				
			}
		}catch(ArrayIndexOutOfBoundsException exception) {
			list.add(A[A.length-1]);
		}	
		//If the array only has negative elements return, smallest = 1
		if(list.isEmpty()) {
			smallest=1;
		}
		//Check for a single element
		if(list.size()==1) {
			smallest=list.get(0)+1;
		}

		//Look for the smallest positive integer (greater than 0) that does not occur in A.		
		int count = 1;
		for(int i=1; i<list.size(); i++) {
			if(list.get(i)!=list.get(0)+count) {
				smallest =list.get(0)+count;
				break;
			}
			if(list.get(i)==list.get(0)+count) {
				smallest=list.get((list.size()-1))+1;
			}
			count++;		

		}
		return smallest;
	}



	public static void main(String args[]) 
	{
		Solution s = new Solution();
		int[] array = {0};
		System.out.println(s.solution(array)); 
	}

}
