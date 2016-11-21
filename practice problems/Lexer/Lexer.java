import java.util.ArrayList;

public class Lexer {
 
    public String[] tokenize(String[] tokens, String input) {
          
        /* 
         Linear Solution:
          Make a trie from tokens. 
          Determine the longest valid token the input begins with at the same time.
            
            If the trie contains the first letter that input begins with, then go to the
            next character and test again all see if the trie contains the first two letters
            input begins with. Repeat and remove the longest matching token, start again.
            
            For every match, it takes O(1) (Trie search is O(key-length)) 
            to see if the letter exists in the trie as a child of the node 
            you're on (root for the first iteration). This is done at most once for every letter.

            For every non-math, it requires the same time, O(1), to 
            determine it is a non-match. Pass that letter, continue,
            at most one O(1) operation per letter.
            
            Storing consumed tokens is constant time by storing their indices.
            
            Bounds are so low anyway so no need to do any of that.
        */
        
        java.util.Arrays.sort(tokens);
        
        ArrayList<Integer> consumed = new ArrayList<>();
        
        int currentIndex = 0;
        while (currentIndex < input.length() - 1) {
            
            int matchIndex = -1;
            
            for (int i = 0; i < tokens.length; i++) {
                if (input.startsWith(tokens[i], currentIndex)) {
                    matchIndex = i;
                }
            }
            
            if (matchIndex == -1) {
                currentIndex++;
            } else {
                currentIndex += tokens[matchIndex].length();
                consumed.add(matchIndex);
            }
        	    
        }
        
        String[] result = new String[consumed.size()];
        for (int i = 0; i < result.length; i++)
          result[i] = tokens[consumed.get(i)];                                     
        
        return result;
    }
    
}
