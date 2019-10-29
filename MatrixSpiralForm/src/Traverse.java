/*Traverse the matrix in clockwise fashion, one per line,space delimited. 
 */

import java.util.ArrayList;

public class Traverse{

	void clockwise(){

		int traverseRows=0;
		int lastColumn=Populate.columns-1;
		int lastRow=Populate.rows;
		int moveHorizontally=0;
		int firstRow=0;
		int firstColumn=0;

		while(true){

			try {
				//top - move right
				for(int j=moveHorizontally; j<=lastColumn;j++){
					System.out.print(Populate.getMatrix()[traverseRows][j]+" ");	
				}traverseRows++;
				moveHorizontally++;

				//right - move down
				for(int i=traverseRows; i<lastRow;i++){
					System.out.print(Populate.getMatrix()[i][lastColumn]+" ");	
				}
				lastColumn--;
				lastRow--;

				//bottom - move left
				for(int j=lastColumn; j>=firstColumn; j--){
					System.out.print(Populate.getMatrix()[lastRow][j]+" ");	
				}
				lastRow--;
				firstRow++;

				//left - move up
				for(int i=lastRow; i>=firstRow; i--) {
					System.out.print(Populate.getMatrix()[i][firstColumn]+" ");	
				}
				lastRow++;
				firstColumn++;

			}catch(Exception e){break;}
		}
	}
}
