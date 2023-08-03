package ss2_Loop.Bai_tap;

public class PrimeLessThan100 {
        public static void main(String[] args) {
            int count = 0;
            int n = 2;
            while (n<100){
                for (int i = 1; i < Math.sqrt(n); i++){
                    if (n%i==0){
                        count++;
                    }
                }
                if (count<2){
                    System.out.println(n);
                }
                count = 0;
                n++;
            }
        }
    }

