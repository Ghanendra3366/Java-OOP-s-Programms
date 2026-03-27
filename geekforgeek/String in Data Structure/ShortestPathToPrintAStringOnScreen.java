import java.util.Scanner;

public class ShortestPathToPrintAStringOnScreen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int moves = 0;
        int pos = 0;
        for (char c : s.toCharArray()) {
            int target = c - 'A';
            int diff = Math.abs(target - pos);
            moves += Math.min(diff, 26 - diff);
            pos = target;
        }
        System.out.println("Moves: " + moves);
    }
}