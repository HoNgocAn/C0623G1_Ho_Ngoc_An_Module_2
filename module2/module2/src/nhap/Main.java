package nhap;

public class Main {
    public static void main(String[] args) {
        String str = "CodegymDaNang";
        String str1 = str.toLowerCase();
        String [] words = str1.split("");
        String [] words1 = new String[15];
        for (int i = 0; i < words1.length && i!=7 && i!=10; i++) {
            words1[i] = words[i];
            words1[7] = " ";
            words1[10] = " ";
        }
        for (String word:words) {
            System.out.print(word);
        }
    }
}

