package ss19_string_regex.bai_tap.bai2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Numbersphone {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NUMBERSPHONE = "^\\d{2}[-][0][0-9]+$";
    public Numbersphone(){
        pattern = Pattern.compile(NUMBERSPHONE);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
