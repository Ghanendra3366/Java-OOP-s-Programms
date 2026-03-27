package JAVA.Elemantary_coding_sheet3;

public class Q10 {
    // Read only region start
class UserMainCode
{
    public static Result encodeThreeStrings(String input1, String input2, String input3) {
        
        String s1 = input1;
        String s2 = input2;
        String s3 = input3;
        
        String front1 = "", middle1 = "", end1 = "";
        String front2 = "", middle2 = "", end2 = "";
        String front3 = "", middle3 = "", end3 = "";
        
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        
        // Split string 1
        if (len1 % 3 == 0) {
            front1 = s1.substring(0, len1/3);
            middle1 = s1.substring(len1/3, 2*len1/3);
            end1 = s1.substring(2*len1/3);
        } else if (len1 % 3 == 1) {
            front1 = s1.substring(0, len1/3 + 1);
            middle1 = s1.substring(len1/3 + 1, 2*len1/3 + 1);
            end1 = s1.substring(2*len1/3 + 1);
        } else { // len1 % 3 == 2
            front1 = s1.substring(0, len1/3 + 1);
            middle1 = s1.substring(len1/3 + 1, 2*len1/3 + 2);
            end1 = s1.substring(2*len1/3 + 2);
        }
        
        // Split string 2
        if (len2 % 3 == 0) {
            front2 = s2.substring(0, len2/3);
            middle2 = s2.substring(len2/3, 2*len2/3);
            end2 = s2.substring(2*len2/3);
        } else if (len2 % 3 == 1) {
            front2 = s2.substring(0, len2/3 + 1);
            middle2 = s2.substring(len2/3 + 1, 2*len2/3 + 1);
            end2 = s2.substring(2*len2/3 + 1);
        } else {
            front2 = s2.substring(0, len2/3 + 1);
            middle2 = s2.substring(len2/3 + 1, 2*len2/3 + 2);
            end2 = s2.substring(2*len2/3 + 2);
        }
        
        // Split string 3
        if (len3 % 3 == 0) {
            front3 = s3.substring(0, len3/3);
            middle3 = s3.substring(len3/3, 2*len3/3);
            end3 = s3.substring(2*len3/3);
        } else if (len3 % 3 == 1) {
            front3 = s3.substring(0, len3/3 + 1);
            middle3 = s3.substring(len3/3 + 1, 2*len3/3 + 1);
            end3 = s3.substring(2*len3/3 + 1);
        } else {
            front3 = s3.substring(0, len3/3 + 1);
            middle3 = s3.substring(len3/3 + 1, 2*len3/3 + 2);
            end3 = s3.substring(2*len3/3 + 2);
        }
        
        // Step 2: Create output1, output2, output3
        String output1 = front1 + front2 + front3;
        String output2 = middle1 + middle2 + middle3;
        String output3 = end1 + end2 + end3;
        
        // Step 3: Toggle case of output3 only
        StringBuilder toggled = new StringBuilder();
        for (char c : output3.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else {
                toggled.append(Character.toUpperCase(c));
            }
        }
        String finalOutput3 = toggled.toString();
        
        // Return result
        Result res = new Result();
        res.output1 = output1;
        res.output2 = output2;
        res.output3 = finalOutput3;
        
        return res;
    }
}
// Read only region end
    
}
