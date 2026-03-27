import java.util.*;

public class Q5 {

	public static int findPassword(int input1, int input2, int input3, int input4, int input5) {
		int[] arr = new int[] { input1, input2, input3, input4, input5 };
		long sumStable = 0;
		long sumUnstable = 0;

		for (int v : arr) {
			if (isStable(v)) sumStable += v;
			else sumUnstable += v;
		}

		return (int)(sumStable - sumUnstable);
	}

	private static boolean isStable(int num) {
		num = Math.abs(num);
		String s = Integer.toString(num);
		int[] freq = new int[10];
		for (char c : s.toCharArray()) freq[c - '0']++;

		int target = -1;
		for (int f : freq) {
			if (f > 0) {
				if (target == -1) target = f;
				else if (f != target) return false;
			}
		}
		return true; // all non-zero digit counts are equal (or number has single digit)
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			if (!sc.hasNextInt()) return;
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			System.out.print(findPassword(a, b, c, d, e));
		}
	}

}
