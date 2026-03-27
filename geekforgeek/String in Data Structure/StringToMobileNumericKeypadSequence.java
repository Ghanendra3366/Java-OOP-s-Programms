import java.util.Scanner;

public class StringToMobileNumericKeypadSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String sequence = keypadSequence(s);
        System.out.println("Sequence: " + sequence);
    }
    static String keypadSequence(String s) {
        String[] keypad = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        StringBuilder sb = new StringBuilder();
        for (char c : s.toUpperCase().toCharArray()) {
            for (int i = 2; i <= 9; i++) {
                if (keypad[i].contains(String.valueOf(c))) {
                    sb.append(String.valueOf(i).repeat(keypad[i].indexOf(c) + 1));
                    break;
                }
            }
        }
        return sb.toString();
    }
}