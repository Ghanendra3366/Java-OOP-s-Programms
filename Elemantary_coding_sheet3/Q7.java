public class Q7 {
    public int sumOfPowerOfDigits(int input1) {
    String s = String.valueOf(Math.abs(input1));
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
        int digit = s.charAt(i) - '0';
        int power = (i + 1 < s.length()) ? (s.charAt(i + 1) - '0') : 0;
        sum += Math.pow(digit, power);
    }
    return sum;
}
}
