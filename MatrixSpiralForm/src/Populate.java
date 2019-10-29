/* 
 * In this class the 2D array is populated. 
 */

import java.util.ArrayList;

public class Populate {

	//Attributes
	private static int matrix[][];
	static int rows;
	static int columns;

	//Constructor
	Populate(int rows, int columns){
		this.rows=rows;
		this.columns=columns;
		this.matrix = new int[rows][columns];
	}
	//Put numbers in the 2D array
	void populateArray(ArrayList<Integer> numbers) {
		int count = 0;
		for(int i=0; i<matrix.length; i++) {
			for (int j = 0; j<matrix.length; j++) {
				matrix[i][j]= numbers.get(count);
				count++;
			}			
		}
	}

	//Get 2D array
	static int[][] getMatrix(){
		return matrix;
	}	
}
