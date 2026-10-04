import java.util.*;

public class NaivePatternSearch {

    public static List<Integer> search(String pat, String txt) {

        int m = pat.length();
        int n = txt.length();

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= n - m; i++) {

            int j;

            for (j = 0; j < m; j++) {

                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                ans.add(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String txt = "aabaacaadaabaaba";
        String pat = "aaba";

        List<Integer> result = search(pat, txt);

        System.out.print("Pattern found at indices: ");

        for (int index : result) {
            System.out.print(index + " ");
        }

        System.out.println();
    }
}