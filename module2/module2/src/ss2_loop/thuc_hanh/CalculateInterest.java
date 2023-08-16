package ss2_Loop.Thuc_hanh;

import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
      double money;
      int month;
      double interestRate;
      Scanner input = new Scanner(System.in);
      System.out.println("Ennter money");
      money = input.nextDouble();
      System.out.println("Enter month");
      month = input.nextInt();
      System.out.println("Enter interestRade");
      interestRate = input.nextDouble();
      double totalInterst = 0;
      for (int i=0; i<month;i++){
          totalInterst = totalInterst + money*interestRate*month/12;
      }
      System.out.print("TotalInterest is : " + totalInterst);
    }
}
