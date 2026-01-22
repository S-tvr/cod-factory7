package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/// or positive lookahead assertion.
/// zero length assertion starts with ?=
/// negation (negative) = "(?!)"
///
/// A positive lookahead assertion in RegEx is a way to say:
///“Match this only if it’s followed by something specific.”
/// It checks ahead in the string to see if a condition is met, but does not include that part in the actual match.
public class ZeroLengthAssertion {

    public static void main(String[] args) {
        String s = "BCDeX";

        Pattern pattern = Pattern.compile("^(?=.*?[a-z]).{4,}$");
                // (?=.*?[a-z]) this is the assertion
                // {4,} this is what is being matched.
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
