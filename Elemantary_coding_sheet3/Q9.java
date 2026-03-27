package JAVA.Elemantary_coding_sheet3;

public class Q9 {
    // Read only region start
class UserMainCode
{
    public String identifyPossibleWords(String input1, String input2) {
        // Read only region end
        
        String pattern = input1.toUpperCase();           // e.g., "FI_ER"
        String[] words = input2.split(":");              // split by colon
        
        StringBuilder result = new StringBuilder();
        boolean foundAny = false;
        
        // Find position of underscore
        int underscorePos = pattern.indexOf('_');
        
        // If no underscore (should not happen as per problem), return error
        if (underscorePos == -1) {
            return "ERROR-009";
        }
        
        for (String word : words) {
            word = word.toUpperCase();
            
            // Must be same length as pattern
            if (word.length() != pattern.length()) {
                continue;
            }
            
            boolean matches = true;
            
            // Check all positions except the underscore one
            for (int i = 0; i < pattern.length(); i++) {
                if (i == underscorePos) {
                    continue; // skip the missing letter
                }
                if (pattern.charAt(i) != word.charAt(i)) {
                    matches = false;
                    break;
                }
            }
            
            // If all known letters match, it's a valid candidate
            if (matches) {
                if (foundAny) {
                    result.append(":");
                }
                result.append(word);
                foundAny = true;
            }
        }
        
        // If no valid word found
        if (!foundAny) {
            return "ERROR-009";
        }
        
        return result.toString();
    }
}
    
}
