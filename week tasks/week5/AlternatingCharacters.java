 import java.util.*;

public class AlternatingCharacters {

    public static int alternatingCharacters(String s) {
        int deletions = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                deletions++;
            }
        }

        return deletions;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.print("Enter string: ");
            String s = sc.next();

            int result = alternatingCharacters(s);

            System.out.println("Deletions: " + result);
        }

        sc.close();
    }
}