import java.util.*;

public class MaxSubarray {

    public static List<Integer> maxSubarray(List<Integer> arr) {

        // Maximum Subarray
        int currentSum = arr.get(0);
        int maxSubarray = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {

            currentSum = Math.max(
                arr.get(i),
                currentSum + arr.get(i)
            );

            maxSubarray = Math.max(maxSubarray, currentSum);
        }

        // Maximum Subsequence
        int maxSubsequence = 0;
        int largest = arr.get(0);

        for (int num : arr) {

            largest = Math.max(largest, num);

            if (num > 0) {
                maxSubsequence += num;
            }
        }

        // If all numbers are negative
        if (maxSubsequence == 0) {
            maxSubsequence = largest;
        }

        return Arrays.asList(maxSubarray, maxSubsequence);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        while (t-- > 0) {

            System.out.print("Enter array size: ");
            int n = sc.nextInt();

            List<Integer> arr = new ArrayList<>();

            System.out.println("Enter array elements:");

            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            List<Integer> result = maxSubarray(arr);

            System.out.println(
                "Maximum Subarray and Subsequence: "
                + result.get(0) + " " + result.get(1)
            );
        }

        sc.close();
    }
}
