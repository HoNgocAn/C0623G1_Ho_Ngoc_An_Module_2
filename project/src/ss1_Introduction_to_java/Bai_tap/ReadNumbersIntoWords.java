package ss1_Introduction_to_java.Bai_tap;

import java.util.Scanner;

public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int numbers = scanner.nextInt();
        String[] arr1 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] arr2 = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] arr3 = {"onehundred", "twohundred", "threehundred", "fourhundred", "fivehundred", "sixhundred", "sevenhundred", "eighthundred", "ninehundred"};

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
            double number2 = Math.floor(numbers / 10);
            double number3 = numbers % 10;
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    if (number2 - 2 == i && number3 == j && number3 != 0) {
                        System.out.println(arr2[i] + arr1[j]);
                    }
                }
            }
        } else if (numbers >= 100 && numbers < 1000) {
            double number1 = Math.floor(numbers / 100);
            double remain = numbers % 100;
            double number2 = Math.floor(remain / 10);
            double number3 = remain % 10;
            for (int h = 0; h < arr3.length; h++) {
                for (int g = 0; g < arr2.length; g++) {
                    for (int k = 0; k < arr1.length; k++) {
                        if (number1 - 1 == h && number2 - 2 == g && number3 == k) {
                            System.out.println(arr3[h] + " and " + arr2[g] + arr1[k]);
                        }
                    }
                }
            }
        } else {
            System.out.println("out of ability");
        }
    }
}

