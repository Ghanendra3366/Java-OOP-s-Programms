import java.util.Scanner;

public class FindIthIndexCharacterInABinaryStringObtainedAfterNIterations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter i: ");
        int i = sc.nextInt();
        String binary = generateBinary(n);
        if (i < binary.length()) {
            System.out.println("Char at " + i + ": " + binary.charAt(i));
        } else {
            System.out.println("Index out of range");
        }
    }
    static String generateBinary(int n) {
        String s = "0";
        for (int iter = 0; iter < n; iter++) {
            String temp = "";
            for (char c : s.toCharArray()) {
                if (c == '0') temp += "01";
                else temp += "10";
            }
            s = temp;
        }
        return s;
    }
}