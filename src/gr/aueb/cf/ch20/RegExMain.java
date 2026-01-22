package gr.aueb.cf.ch20;

import java.util.Arrays;

/**
 * [\w\W] means "." but also \r and \n.             (config setting: DOTALL)
 *
 * 1. List of Java RegEx Metacharacters
 * Metacharacter	Meaning
 * .	Matches any character (except newline \n)
 * \d	Matches any digit [0-9]
 * \D	Matches non-digit characters
 * \w	Matches word characters [a-zA-Z0-9_]
 * \W	Matches non-word characters
 * \s	Matches whitespace (space, tab, newline)
 * \S	Matches non-whitespace characters
 * \b	Matches word boundary
 * \B	Matches non-word boundary
 * 2. Quantifiers
 * Metacharacter	Meaning
 * *	0 or more times
 * +	1 or more times
 * ?	0 or 1 time (optional)
 * {n}	Exactly n times
 * {n,}	At least n times
 * {,m} No more than m times
 * {n,m}	Between n and m times
 * 3. Anchors (Position-Based Metacharacters)
 * Metacharacter	Meaning
 * ^	Start of string
 * $	End of string
 * 4. Character Classes
 * Metacharacter	Meaning
 * [abc]	Matches any one of a, b, c
 * [^abc]	Matches NOT a, b, c
 * [a-z]	Matches lowercase letters
 * [A-Z]	Matches uppercase letters
 * [0-9]	Matches digits
 * [a-zA-Z]	Matches any letter
 * 5. Grouping and Alternation
 * Metacharacter	Meaning
 * ()	Capturing group
 * (?:...)	Non-capturing group
 * `	`
 */
public class RegExMain {

    public static void main(String[] args) {
        String s = "ath   andr";
//        System.out.println(isRed(s));
//        System.out.println(isRedOrGreen(s));
//        System.out.println(beginsWithOneUpperCaseAndEndsIning(s));
//        System.out.println(isEmailSimplified(s));
//        String[] tokens = doSplit(s);
//        for (String token : tokens) {
//            System.out.println(token);
//        }
//        System.out.println(doReplaceAll(s));
        System.out.println(doReplaceBackReference(s));
    }

    public static boolean isRed (String s) {
        return s.matches("red");        /// case sensitive
    }

    //διάζευξη
    public static boolean isRedOrGreen (String s) {
        return s.matches("red|green");
    }

    //character sets []
    public static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]ed|[gG]reen");
    }

    public static boolean beginsWithOneUpperCaseAndEndsIning(String s) {
        return s.matches("[A-Z]ing");
    }

    public static boolean isOneLetterEndsIning (String s) {
        return s.matches("[A-Za-z]ing");
    }

    public static boolean isFirstWhiteSpaceFollowedByOneDigit(String s) {
        return s.matches("\\s\\d");         // matches implies ("^\\s\\d$")
    }

    public static boolean anySymbolDigit (String s) {
        return s.matches(".\\d");       // "." == but not new line.
        //return s.matches(".[0-9]");
    }

    /// simple email recognition
    /// RFC = request for comments
    public static boolean isEmailSimplified(String s) {
        return s.matches("\\w*\\.?\\w+@\\w+\\.[a-z]{2,4}");
    }

    public static boolean isDateSimplified(String s) {
        return s.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}");
    }

    /// String.split()
    public static String[] doSplit(String s){
        return s.split("\\s+");
    }

    /// String.replaceAll()
    public static String doReplaceAll (String s) {
        return s.replaceAll("\\s+", " ");
    }

    /// Groups in RegEx.  (Like creating memory)
    public static String doReplaceBackReference(String s) {
        return s.replaceAll("(.+)\\s+(.+)", "$2 $1");
    }
}
