import java.util.*;

public class Q7 {

    public static String userIdGeneration(String input1, String input2, String input3, int input4) {
        String firstName = input1;
        String lastName = input2;
        String pin = input3;
        int n = input4;
        
        // Step 1: Determine smaller and longer names
        String smallerName, longerName;
        if (firstName.length() < lastName.length()) {
            smallerName = firstName;
            longerName = lastName;
        } else if (firstName.length() > lastName.length()) {
            smallerName = lastName;
            longerName = firstName;
        } else {
            // Equal length: compare alphabetically
            if (firstName.compareTo(lastName) < 0) {
                smallerName = firstName;
                longerName = lastName;
            } else {
                smallerName = lastName;
                longerName = firstName;
            }
        }
        
        // Step 2: Build the user ID
        // Last letter of smaller name + entire longer name + digit at position n (left-to-right) + digit at position n (right-to-left)
        StringBuilder userId = new StringBuilder();
        userId.append(smallerName.charAt(smallerName.length() - 1));
        userId.append(longerName);
        
        // Digit at position n from left (0-indexed)
        if (n < pin.length()) {
            userId.append(pin.charAt(n));
        }
        
        // Digit at position n from right (0-indexed from right)
        if (n < pin.length()) {
            userId.append(pin.charAt(pin.length() - 1 - n));
        }
        
        // Step 3: Toggle case
        StringBuilder result = new StringBuilder();
        for (char c : userId.toString().toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c); // Keep digits and other characters as is
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNext()) return;
            String firstName = sc.next();
            String lastName = sc.next();
            String pin = sc.next();
            int n = sc.nextInt();
            
            System.out.print(userIdGeneration(firstName, lastName, pin, n));
        }
    }

}
