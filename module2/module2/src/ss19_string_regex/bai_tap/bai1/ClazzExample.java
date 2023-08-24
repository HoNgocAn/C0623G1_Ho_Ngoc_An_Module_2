package ss19_string_regex.bai_tap.bai1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClazzExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLAZZ_REGEX = "^[ACP]\\d{4}[GHIK]$";
    public ClazzExample(){
        pattern = Pattern.compile(CLAZZ_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return  matcher.matches();
    }
}

