import java.util.Scanner;

public class LexicographicallyNextString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String next = nextPermutation(s);
        System.out.println("Next: " + next);
    }
    static String nextPermutation(String s) {
        char[] arr = s.toCharArray();
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;
        if (i < 0) return "No next";
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) j--;
        swap(arr, i, j);
        reverse(arr, i + 1, arr.length - 1);
        return new String(arr);
    }
    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}