// package Day1;

public class setMatricesZero {
    public static void setZeroes(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int col0 = 1;

        // Step 1: Traverse the matrix and mark row and col trackers
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    // Mark the i-th row
                    arr[i][0] = 0;

                    // Mark the j-th column
                    if (j != 0) {
                        arr[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        // Step 2: Update the matrix using trackers (except 1st row and 1st col)
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        // Step 3: Update the 1st row
        if (arr[0][0] == 0) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

        // Step 4: Update the 1st col
        if (col0 == 0) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }

    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 1, 1 },
                { 0, 0, 2 },
                { 0, 4, 5 }
        };
        setZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}