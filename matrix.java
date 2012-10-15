import java.util.Arrays;

public class Matrix {
public  int x, y;
public int[][] matrix;

	Matrix(int x, int y) {
	matrix = new int[x][y];
		for (int i = 0; i<x ; i++) {
			for (int j=0; j<y; j++) {
			matrix[i][j] = 1;

			}		


		}
	}
	


public static void main(String[] args) {
       

System.out.println("Give me the dimensions of the Matrix");
String s = System.console().readLine();
int a = Integer.parseInt(s);
String s2 = System.console().readLine();
int b = Integer.parseInt(s2);

   Matrix matrix = new Matrix(a,b);

	System.out.println((matrix.matrix[1][1]));
}


}