public class MinimumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][] = { { 7, 2, 3 }, { 4, 5, 6 }, { 1, 8, 9 } };
		int min = abc[0][0];
		int col = 0;
		int max = 0, k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < min) {
					min = abc[i][j];
					col = j;
				}
			}
		}
		System.out.println(min);
		System.out.println(col);
		while (k < 3) {
			if (abc[k][col] > max) {
				max = abc[k][col];
				k++;
			}
			System.out.println(max);
			break;
		}
	}
}
/*
7 2 3
4 5 6
1 8 9
*/
//col stands for column number of minimum alues in array
//k stands for values of that column (returns from col)
//max is variable which return maximum value of that column 
