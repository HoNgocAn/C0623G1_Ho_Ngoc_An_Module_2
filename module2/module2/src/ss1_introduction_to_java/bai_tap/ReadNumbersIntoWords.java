package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int numbers = scanner.nextInt();
        String[] arr1 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] arr2 = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] arr3 = {"onehundred", "twohundred", "threehundred", "fourhundred", "fivehundred", "sixhundred", "sevenhundred", "eighthundred", "ninehundred"};
        String[] arr4 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        if (numbers >= 0 && numbers < 10) {
            switch (numbers) {
                case 0:
                    System.out.print("zero");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
                default:
                    System.out.print("out of ability");
                    break;
            }
        } else if (numbers >= 10 && numbers < 20) {
            switch (numbers) {
                case 10:
                    System.out.print("ten");
                    break;
                case 11:
                    System.out.print("eleven");
                    break;
                case 12:
                    System.out.print("twelve");
                    break;
                case 13:
                    System.out.print("thirteen");
                    break;
                case 14:
                    System.out.print("fourteen");
                    break;
                case 15:
                    System.out.print("fifteen");
                    break;
                case 16:
                    System.out.print("sixteen");
                    break;
                case 17:
                    System.out.print("seventeen");
                    break;
                case 18:
                    System.out.print("eightteen");
                    break;
                case 19:
                    System.out.print("nineteen");
                    break;
                default:
                    System.out.print("out of ability");
                    break;
            }
        } else if (numbers >= 20 && numbers < 100) {
            int number2 = numbers / 10;
            int number3 = numbers % 10;
            if (number3 == 0) {
                System.out.println(arr2[number2 - 2]);
            } else {
                System.out.println(arr2[number2 - 2] + " " + arr1[number3]);
            }
        }
        else if(numbers>=100 && numbers<=1000){
            int number1 = numbers/100;
            int remainder = numbers%100;
            int number2 = remainder/10;
            int number3 = remainder%10;
            if (remainder>=1 && remainder<=9){
                System.out.println(arr3[number1-1]  + " and " + arr1[number3]);
            } else if (remainder>=10 && remainder<=19){
                System.out.println(arr3[number1-1]  + " and " + arr4[number3]);
            } else if (number3 == 0){
                System.out.println(arr3[number1-1] + " and " + arr2[number2 - 2]);
            } else {
                System.out.println(arr3[number1-1] + " and " + arr2[number2 -2] + arr1[number3]);
            }
        }
        else{
            System.out.println("out of ability");
        }
    }
}

