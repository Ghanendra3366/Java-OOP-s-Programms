import java.util.Scanner;

public class CheckIfAllBitsCanBeMadeSameBySingleFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary string: ");
        String s = sc.nextLine();
        boolean canMakeSame = s.contains("0") && s.contains("1");
        System.out.println(canMakeSame ? "Can make same" : "Cannot");
    }
}