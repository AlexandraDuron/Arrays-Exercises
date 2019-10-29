/* Write a program to print a 2D array (n*m) in clockwise order.
 * 
 * Input: The program should read lines of text. Each line contains three semicolon-delimited
 * items. The first is 'n'(rows), the second is 'm'(columns),and the third is a single space delimited
 * list of characters/numbers in row major order.
 * 
 * Output 1: Print the matrix in clockwise fashion, one per line,space delimited. 
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	//Test
	public static void main(String[] args) throws FileNotFoundException {
		//Read input
		String fileName = "data.txt";
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);

		String input = scanner.nextLine();
		//Split a string by multiple delimiters
		String data[] = input.split(";|\\s");

		int rows = Integer.valueOf(data[0]);
		int columns =Integer.valueOf(data[1]); 
		ArrayList<Integer> numbers= new ArrayList<>();

		for(int i=2; i<data.length;i++) {
			numbers.add(Integer.valueOf(data[i]));
		}

		Populate  p = new Populate (rows,columns);
		p.populateArray(numbers);
		Traverse t = new Traverse();

		//Display results
		t.clockwise();

	}
}
