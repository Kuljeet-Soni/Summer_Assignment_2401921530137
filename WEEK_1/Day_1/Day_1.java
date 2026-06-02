package WEEK_1.Day_1;
import java.util.Scanner;

public class Day_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Array Elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        add(arr, target);

        sc.close();
    }

    public static void add(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println("Output: [" + i + ", " + j + "]");
                    return;
                }
            }
        }

        System.out.println("Output: Not Found");
    }
}
