package uniquemorsecode;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode {
	public int uniqueMorseRepresentations(String[] words) {
        String[] letterToCodeMap = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> uniqueTransformation = new HashSet<String>();
        for (String word : words) {
            StringBuilder combinationStr = new StringBuilder();
            for (char c : word.toCharArray()) {
                combinationStr.append(letterToCodeMap[c - 'a']);
            }
            uniqueTransformation.add(combinationStr.toString());
        }
        return uniqueTransformation.size();
    }
}
