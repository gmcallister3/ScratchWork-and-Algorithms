//Algorithm to set all rows and columns in an array to zero if they contain a 0
//Runs O(MN) time where M = # cols & N = # rows
//Doesn't work for jagged arrays, would have to change indexing slightly

import java.util.ArrayList;

public class zeroArrays {
	
	public static void main(String[] args) {
		//Testing
		int[][] t1 = {{1, 3, 0}, {2, 1, 9}, {3, 8, 6}, {6, 4, 3}};
		//	1 3 0			0 0 0
		//	2 1 9			2 1 0
		//	3 8 6   ->		3 8 0
		//	6 4 3			6 4 0
		int[][] out1 = setZero(t1);
		for (int i = 0; i < out1.length; i++) {
			for (int j = 0; j < out1[0].length; j++) {
				System.out.print(out1[i][j]);
			}
			System.out.println("");
		}

		System.out.println("Test 2: ");
		//	1 3 0			0 0 0
		//	2 1 9			2 0 0
		//	3 0 6   ->		0 0 0
		//	6 4 3			6 0 0
		t1[2][1] = 0;
		int[][] out2 = setZero(t1);
		for (int i = 0; i < out2.length; i++) {
			for (int j = 0; j < out2[0].length; j++) {
				System.out.print(out2[i][j]);
			}
			System.out.println("");
		}
	}

	static int[][] setZero(int[][] in) {
		int rows = in.length;
		int cols = in[0].length;
		ArrayList<Integer> zeroRows = new ArrayList<>();
		ArrayList<Integer> zeroCols = new ArrayList<>();

		//Scan input array
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (in[i][j] == 0) {
					zeroRows.add(i);
					zeroCols.add(j);
				}
			}
		}

		//Make new output array
		int[][] out = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			if (!zeroRows.contains(i)) {
				for (int j = 0; j < cols; j++) {
					if (!zeroCols.contains(j)) {
						out[i][j] = in[i][j];
					}
				}
			}
		}
		return out;
	}
}