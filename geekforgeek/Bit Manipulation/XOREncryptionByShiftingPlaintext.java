import java.util.Scanner;

public class XOREncryptionByShiftingPlaintext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter plaintext: ");
        String text = sc.next();
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        String encrypted = "";
        for (char c : text.toCharArray()) {
            encrypted += (char) (c ^ key);
        }
        System.out.println("Encrypted: " + encrypted);
        String decrypted = "";
        for (char c : encrypted.toCharArray()) {
            decrypted += (char) (c ^ key);
        }
        System.out.println("Decrypted: " + decrypted);
    }
}