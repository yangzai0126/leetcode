package leetcode0511;
/*
 * All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

For example,

Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",

Return:
["AAAAACCCCC", "CCCCCAAAAA"].
 */
import java.util.*;
public class RepeatedDNASequences {
	public List<String> findRepeatedDnaSequences(String s) {
        
        List<String> ans = new ArrayList<String>();  
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();  
        int key = 0;  
        for (int i = 0; i < s.length(); i++) {  
            key = ((key << 3) | (s.charAt(i) & 0x7)) & 0x3fffffff;  
            if (i < 9) continue;  
            if (map.get(key) == null) {  
                map.put(key, 1);  
            } else if (map.get(key) == 1) {  
                ans.add(s.substring(i - 9, i + 1));  
                map.put(key, 2);  
            }  
        }  
        return ans;  
    }
}
