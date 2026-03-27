import java.util.Scanner;

public class ValidateIPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP: ");
        String s = sc.nextLine();
        String[] parts = s.split("\\.");
        if (parts.length != 4) {
            System.out.println("Invalid");
            return;
        }
        boolean valid = true;
        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) valid = false;
            } catch (Exception e) {
                valid = false;
            }
        }
        System.out.println(valid ? "Valid" : "Invalid");
    }
}