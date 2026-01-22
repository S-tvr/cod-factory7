package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateMatcher2 {


    public static void main(String[] args) {
        String usDate = "21/06/2025 27/08/2024";       //mm/dd/yyyy

        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher matcher = pattern.matcher(usDate);

        while (matcher.find()) {
            StringBuilder s = new StringBuilder();
            for (int i = 1; i <= matcher.groupCount(); i++) {
                if (i < 3) {
                    s.append(matcher.group(i)).append("/");
                } else {
                    s.append(matcher.group(i));
                }
            }
            System.out.printf(s + "\n");
        }
    }
}
