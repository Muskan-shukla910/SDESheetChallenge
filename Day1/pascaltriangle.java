import java.util.ArrayList;
import java.util.List;

public class pascaltriangle {
    public static List<Integer> generateRow(int rowNo) {
        long ans = 1;
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1); // The first element is always 1

        for (int col = 1; col < rowNo; col++) {
            ans = ans * (rowNo - col);
            ans = ans / col;
            currentRow.add((int) ans);
        }
        return currentRow;
    }

    public static List<List<Integer>> generatePascal(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        // Generate each row from 1 to numRows and add to our final list
        for (int i = 1; i <= numRows; i++) {
            ans.add(generateRow(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> result = generatePascal(n);

        System.out.println("--- Pascal's Triangle (Optimal Way) ---");
        // Printing using traditional i and j loops
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println(); // Move to the next line for grid view
        }
    
    }
}
