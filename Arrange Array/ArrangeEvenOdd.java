import java.util.Scanner;

public class ArrangeEvenOdd {
    public static void arrangeEvenOdd(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] % 2 == 0) left++;
            while (left < right && arr[right] % 2 != 0) right--;
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter space-separated numbers:");
        String[] input = scanner.nextLine().split(" ");
        int n = input.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        scanner.close();
        arrangeEvenOdd(arr);
        // Print result
        System.out.print("Rearranged Array: ");
        for (int num : arr) System.out.print(num + " ");
    }
}
