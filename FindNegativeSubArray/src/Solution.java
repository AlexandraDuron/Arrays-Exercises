/****************************************************************
Find the number of sub arrays, that have a negative summation of their elements 
Source: https://www.hackerrank.com/challenges/java-negative-subarray/problem

 ***************************************************************/


import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		String input = "data.txt";
		File file = new File(input);
		Scanner scanner = new Scanner(file);
		int [] A = new int[scanner.nextInt()];
		//populate array
		for(int i = 0; i<A.length; i++){
			A[i]=scanner.nextInt();
		}
		int cont = 0;
		for (int i=0; i<A.length; i++){
			int sum = 0;
			for(int j=i; j<A.length; j++){
				sum = sum + A[j];
				if (sum <0) {
					cont++;
				}
			}
		} 
		//Print the total of sub arrays that have a negative summation of their elements.
		System.out.println(cont);
	}
}

