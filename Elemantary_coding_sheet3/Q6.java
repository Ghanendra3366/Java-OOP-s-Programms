package JAVA.Elemantary_coding_sheet3;

public class Q6 {
    public static int mostFrequentlyOccurringDigit(int[] input1, int input2) {
    int[] digitCount = new int[10];
    
    for (int i = 0; i < input2; i++) {
        int num = Math.abs(input1[i]);
        if (num == 0) {
            digitCount[0]++;
        } else {
            while (num > 0) {
                digitCount[num % 10]++;
                num /= 10;
            }
        }
    }
    
    int maxFreq = 0;
    for (int count : digitCount) {
        maxFreq = Math.max(maxFreq, count);
    }
    
    for (int d = 9; d >= 0; d--) {
        if (digitCount[d] == maxFreq) {
            return d;
        }
    }
    
    return 0;
}
    
}
