package JAVA.Elemantary_coding_sheet3;

public class Q5 {
    public static Result solve(int[] arr) {
    if (arr == null || arr.length < 2) return new Result(0, 0);
    
    int count = 0;
    int maxLen = 0;
    int currLen = 1;
    
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < arr[i-1]) {
            currLen++;
        } else {
            if (currLen >= 2) {
                count++;
                maxLen = Math.max(maxLen, currLen);
            }
            currLen = 1;
        }
    }
    if (currLen >= 2) {
        count++;
        maxLen = Math.max(maxLen, currLen);
    }
    
    return new Result(count, maxLen);
}
    
}
