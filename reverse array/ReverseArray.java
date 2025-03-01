import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter space-separated numbers:");
        String[] input = scanner.nextLine().split(" ");
        int n = input.length;
        int[] arr = new int[n];

        // Convert input to integer array
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        scanner.close();

        // Reverse the array
        reverseArray(arr);

        // Find max and min
        int max = arr[0], min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        // Print results
        System.out.print("Reversed Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nMax Value: " + max);
        System.out.println("Min Value: " + min);
    }

}
