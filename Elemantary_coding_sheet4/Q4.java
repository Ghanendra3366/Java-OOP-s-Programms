import java.util.*;

public class Q4 {

	public static int nnGenerator(String input) {
		if (input == null || input.length() == 0) return 0;

		StringBuilder out = new StringBuilder();
		int n = input.length();
		int pos = 0;

		while (pos < n) {
			int firstDigit = input.charAt(pos) - '0';
			int firstParity = firstDigit % 2; // 0 even, 1 odd
			int sum = firstDigit;
			int idx = pos + 1;

			// keep adding until sum parity becomes opposite to firstParity
			while (idx < n) {
				int d = input.charAt(idx) - '0';
				sum += d;
				if ((sum % 2) != firstParity) {
					// parity changed, stop this pass
					idx++; // move to next start position after this digit
					break;
				}
				idx++;
			}

			// append the sum for this pass
			out.append(sum);

			// set next start position
			if (idx <= pos) {
				// defensive: ensure progress
				pos++;
			} else {
				pos = idx;
			}
		}

		// result may be large but expected to fit into int per problem statement
		try {
			return Integer.parseInt(out.toString());
		} catch (NumberFormatException ex) {
			// if too large, return lower 32-bit value (or could throw)
			return out.toString().hashCode();
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			if (!sc.hasNext()) return;
			String input = sc.next().trim();
			System.out.print(nnGenerator(input));
		}
	}
}
