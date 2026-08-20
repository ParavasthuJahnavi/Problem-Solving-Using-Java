package week3;


import java.util.ArrayList;
import java.util.Collections;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(33);
        numbers.add(67);

        System.out.println("Numbers: " + numbers);

        int largest = Collections.max(numbers);
        System.out.println("Largest number is: " + largest);

        int max = numbers.get(0);

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest number (manual check): " + max);
    }
}