package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

import java.util.*;

import static rocks.zipcode.io.quiz4.fundamentals.StringEvaluator.listToArrayConverter;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    
    private final String input;
    
    public PalindromeObject(String input) {this.input = input;}
    
    public String[] getAllPalindromes() {return null;
        //call getAllPalindromes on input;
    }
    
    public Boolean isPalindrome() {
        return PalindromeEvaluator.isPalindrome(input);
    }
    
    public String reverseString() {
        return PalindromeEvaluator.reverseString(input);
    }
}
