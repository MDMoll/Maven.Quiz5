package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        List<String> substrings = new ArrayList<>();
        for (int i = 0; i < string.length(); i++)
            for (int j = i + 1; j <= string.length(); j++) {
                substrings.add(string.substring(i, j));
            }
        Set<String> strings = new TreeSet<>(substrings);
        List<String> finalSubstrings = new ArrayList<>(strings);
        return listToArrayConverter(finalSubstrings);
    }
    
    public static String[] listToArrayConverter(List<String> inputList) {
        String[] substrings = new String[inputList.size()];
        
        for (int j = 0; j < substrings.length; j++) {
            substrings[j] = inputList.get(j);
        }
        
        return substrings;
    }
    
    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] substrings1 = getAllSubstrings(string1);
        String[] substrings2 = getAllSubstrings(string2);
        List<String> substrings = new ArrayList<>();
        for (int i = 0; i < substrings1.length; i++)
            for (int j = 0; j < substrings2.length; j++) {
                if (substrings1[i].equals(substrings2[j])) {
                    substrings.add(substrings1[i]);
                }
        }
        return listToArrayConverter(substrings);
    }
    
    public static String getLargestCommonSubstring(String string1, String string2) {
        Comparator<String> compByLength = Comparator.comparingInt(String::length);
        String[] substrings1 = getAllSubstrings(string1);
        String[] substrings1Reversed = Arrays.stream(substrings1).sorted(Collections.reverseOrder(compByLength))
                .toArray(String[]::new);
        String[] substrings2 = getAllSubstrings(string2);
        String[] substrings2Reversed = Arrays.stream(substrings2).sorted(compByLength)
                .toArray(String[]::new);
        for (int i = 0; i < substrings1Reversed.length; i++)
            for (int j = 0; j < substrings2Reversed.length; j++) {
                if (substrings1Reversed[i].equals(substrings2Reversed[j])) {
                    return substrings1Reversed[i];
                }
            }
        return null;
    }
}
