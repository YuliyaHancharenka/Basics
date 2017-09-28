package collection.task_2dDimArray;

import java.util.HashSet;

public class SecondDimArray_v2 {

    public static void main(String[] args) {
		
		int[][] matrix = new int[4][3];
		
		matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 11;
        matrix[1][1] = 22;
        matrix[1][2] = 33;

        matrix[2][0] = 111;
        matrix[2][1] = 222;
        matrix[2][2] = 333;

        matrix[3][0] = 2222;
        matrix[3][1] = 5;
        matrix[3][2] = 5;
		
		boolean hasDuplicates = hasDuplicates(matrix);

		if (hasDuplicates){
			System.out.println("Matrix has duplicates");
		} else {
			System.out.println("Matrix hasn't duplicates");
		}
    }

    static boolean hasDuplicates(int[][] matrix) {
		HashSet<Integer> myHashSet = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (!myHashSet.add(matrix[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }
}