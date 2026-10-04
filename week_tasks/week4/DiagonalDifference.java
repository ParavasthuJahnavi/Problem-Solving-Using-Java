import java.util.*;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int n = arr.size();

        int leftDiagonal = 0;
        int rightDiagonal = 0;

        for (int i = 0; i < n; i++) {

            leftDiagonal += arr.get(i).get(i);

            rightDiagonal += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(leftDiagonal - rightDiagonal);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();

        List<List<Integer>> arr = new ArrayList<>();

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }

            arr.add(row);
        }

        int result = diagonalDifference(arr);

        System.out.println("Diagonal Difference: " + result);

        sc.close();
    }
}