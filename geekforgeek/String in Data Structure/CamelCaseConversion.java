import java.util.Scanner;

public class CamelCaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder(words[0].toLowerCase());
        for (int i = 1; i < words.length; i++) {
            sb.append(words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase());
        }
        System.out.println("Camel case: " + sb);
    }
}