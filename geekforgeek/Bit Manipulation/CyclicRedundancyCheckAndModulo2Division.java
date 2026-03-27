import java.util.Scanner;

public class CyclicRedundancyCheckAndModulo2Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data: ");
        String data = sc.next();
        System.out.print("Enter generator: ");
        String gen = sc.next();
        String crc = crc(data, gen);
        System.out.println("CRC: " + crc);
    }
    static String crc(String data, String gen) {
        int genLen = gen.length();
        String appended = data + "0".repeat(genLen - 1);
        String remainder = modulo2Division(appended, gen);
        return data + remainder;
    }
    static String modulo2Division(String div, String gen) {
        int genLen = gen.length();
        StringBuilder result = new StringBuilder(div.substring(0, genLen));
        for (int i = genLen; i <= div.length(); i++) {
            if (result.charAt(0) == '1') {
                for (int j = 0; j < genLen; j++) {
                    result.setCharAt(j, (char) ((result.charAt(j) - '0') ^ (gen.charAt(j) - '0') + '0'));
                }
            }
            if (i < div.length()) {
                result.append(div.charAt(i));
            }
            result.deleteCharAt(0);
        }
        return result.toString();
    }
}