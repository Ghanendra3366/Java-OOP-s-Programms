package Elementary_coding_Sheet2;

public class Q11 {
    public String addNumberStrings(String input1, String input2) {
    StringBuilder sb = new StringBuilder();
    int i = input1.length() - 1;
    int j = input2.length() - 1;
    int carry = 0;
    
    while (i >= 0 || j >= 0 || carry > 0) {
        int sum = carry;
        if (i >= 0) sum += input1.charAt(i--) - '0';
        if (j >= 0) sum += input2.charAt(j--) - '0';
        sb.append(sum % 10);
        carry = sum / 10;
    }
    
    return sb.reverse().toString();
}
    
}
