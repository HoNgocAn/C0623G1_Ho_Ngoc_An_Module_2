package ss4_Class_Object.Bai_tap.Exersise2;

public class Calculate2 {
    public static void main(String[] args) {

            StopWatch stopwatch = new StopWatch();
            stopwatch.start();

            for (int i = 0; i <= 100000; i++) {
                System.out.println(i);
            }
            stopwatch.stop();
            System.out.println("The execution time of the program is: " + stopwatch.getElapsedTime() + "ms");
        }
    }





