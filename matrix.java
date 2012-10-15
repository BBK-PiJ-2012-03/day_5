import java.util.Arrays;

public class Matrix {
public static int x, y, value;
public  int height, width;
public int[][] matrix;

	Matrix(int h, int w) {
		matrix = new int[h][w];
		height = h;
		width = w;
		for (int i = 0; i<height ; i++) {
			for (int j=0; j<width; j++) {
			matrix[i][j] = 1;

			}	
		}
	}

	void setElement (int x, int y, int value) {
System.out.println("Give me the potition of the element you want to modify");
String s3 = System.console().readLine();
x = Integer.parseInt(s3);
String s4 = System.console().readLine();
y = Integer.parseInt(s4);

		if (x>0 && x<height && y>0 && y<width) {
		System.out.println("Give me the value you want to assign");
String s5 = System.console().readLine();
value = Integer.parseInt(s5);
		matrix[x][y] = value ;

 
		

		}
		else {
		System.out.println("Wrong indeces");
		}



	}
	


public static void main(String[] args) {
       

System.out.println("Give me the dimensions of the Matrix");
String s = System.console().readLine();
int a = Integer.parseInt(s);
String s2 = System.console().readLine();
int b = Integer.parseInt(s2);

   Matrix matrix = new Matrix(a,b);
	matrix.setElement (x,y,value);

	System.out.println(matrix.matrix[2][2]);
}


}