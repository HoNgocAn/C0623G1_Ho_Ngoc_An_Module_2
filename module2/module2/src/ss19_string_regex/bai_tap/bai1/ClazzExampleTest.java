package ss19_string_regex.bai_tap.bai1;

public class ClazzExampleTest {
    private static ClazzExample clazzExample;
    public static final String [] validClazz = new String[]{"C0223G", "A0323K"};
    public static final String [] invalidNClazz = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        clazzExample = new ClazzExample();
        for (String clazz: validClazz) {
            boolean isValid = clazzExample.validate(clazz);
            System.out.println("Clazz is " + clazz + " is valid " + isValid);
        }
        for (String clazz: invalidNClazz) {
            boolean isValid = clazzExample.validate(clazz);
            System.out.println("Clazz is " + clazz + " is valid " + isValid);
        }
    }
}
