/****************************************************************
 * Fin pairs of numbers in an array. Print the number of pairs. 
 * Source: https://www.hackerrank.com/challenges/sock-merchant/problem

 * **************************************************************/

import java.io.*;
import java.util.*;

public class Solution {
	static int pair;

	static int sockMerchant(int n, int[] ar) {
		//Make array list for numbers without a pair
		ArrayList<Integer> list = new ArrayList<>();

		//Sort array
		Arrays.sort(ar);
		try {
			pair = 0;
			for(int i = 0; i<ar.length; i+=2){
				if(ar[i]==ar[i+1]){
					pair++;

				} 
				else {
					//Put elements without a pair in the array list 
					list.add(ar[i]);
					list.add(ar[i+1]);
				}		
			}
		}catch(ArrayIndexOutOfBoundsException exception) {}
		try {
			//Check for missing pairs not found in the previous search
			for(int i=0; i<list.size();i++) {
				if(list.get(i+1)==list.get(i+2)) {
					pair++;
				}
			}
		}catch(Exception e) {}

		return pair;
	}



	public static void main(String[] args) throws IOException {
		//read data
		String fileName= "data.txt";
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);

		// hackerrank's  code
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int[] ar = new int[n];
		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}
		int result = sockMerchant(n, ar);
		System.out.println(result);
		scanner.close();
		// hackerrank's  code ends

	}
}
