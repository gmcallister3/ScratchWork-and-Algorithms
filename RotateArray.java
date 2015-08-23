//Algorithm to rotate a square (N x N) array 90 degrees clockwise
//Runs in O(N^2) time
//Doesn't work for jagged arrays or non-quare arrays


public class RotateArray {
	

	//Testing
	public static void main(String[] args) {
		System.out.println("Test 1: ");
		// 1 2 3		7 4 1
		// 4 5 6  -->   8 5 2
		// 7 8 9		9 6 3
		int[][] t1 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] out1 = rotateClockwise(t1);
		for (int i = 0; i < out1.length; i++) {
			for (int j = 0; j < out1[0].length; j++) {
				System.out.print(out1[i][j] + " ");
			}
			System.out.println("");
		}

		System.out.println("Test 2: ");
		// 1 2   3   4			13 9  5 1
		// 5 6   7   8   -->   	14 10 6 2
		// 9 10  11 12			15 11 7 3
		// 13 14 15 16			16 12 8 4
		int[][] t2 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		int[][] out2 = rotateClockwise(t2);
		for (int i = 0; i < out2.length; i++) {
			for (int j = 0; j < out2[0].length; j++) {
				System.out.print(out2[i][j] + " ");
			}
			System.out.println("");
		}
	}

	static int[][] rotateClockwise(int[][] in) {
		int n = in.length;
		int[][] out = new int[n][n];
		for (int i = 0, newCol = n - 1; i < n; i++, newCol--) {
			for (int j = 0, newRow = 0; j < n; j++, newRow++) {
				out[newRow][newCol] = in[i][j];
			}
		}
		return out;
	}
}