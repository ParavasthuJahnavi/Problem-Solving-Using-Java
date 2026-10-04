import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        int[] arr = {-7, -5, 5, 10, 0, 3, 20, 25, 12};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        if (index >= 0 && index < arr.length) {
            System.out.println("Element at index " + index + " is: " + arr[index]);
        } else {
            System.out.println("Invalid index");
        }

        sc.close();
    }
}