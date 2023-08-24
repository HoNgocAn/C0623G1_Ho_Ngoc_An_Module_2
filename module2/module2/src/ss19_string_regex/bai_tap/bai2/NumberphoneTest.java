package ss19_string_regex.bai_tap.bai2;

public class NumberphoneTest {
    private static Numbersphone numbersphone;
    public static final String [] validNumbersphone = {"(84)-(0978489648)"};
    public static final String [] invalidNumbersphone ={"(a8)-(22222222)", "(84)-(22b22222)","(84)-(9978489648)"};

    public static void main(String[] args) {
        numbersphone = new Numbersphone();
        for (String numberphone: validNumbersphone) {
            boolean isValid = numbersphone.validate(numberphone);
            System.out.println("Numbersphone is " + numberphone + " is valid " + isValid);
        }
        for (String numerphone: invalidNumbersphone) {
            boolean isValid = numbersphone.validate(numerphone);
            System.out.println("Numbersphone is " + numerphone + " is valid " + isValid);

        }
    }
}
