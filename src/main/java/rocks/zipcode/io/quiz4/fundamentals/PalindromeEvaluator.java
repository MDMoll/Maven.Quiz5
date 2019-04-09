package rocks.zipcode.io.quiz4.fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static rocks.zipcode.io.quiz4.fundamentals.StringEvaluator.listToArrayConverter;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        List<String> list = new ArrayList<>();
        String[] strArray = StringEvaluator.getAllSubstrings(string);
        for (String s : strArray){
            if (isPalindrome(s)){
                list.add(s);
            }
        }
        return listToArrayConverter(list);
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }
}
