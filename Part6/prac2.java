import java.util.Scanner;

class salary extends Thread {

  public void run() {
    Scanner sc = new Scanner(System.in);
    double[] income = new double[6];

    for (int i = 1; i < 6; i++) {
      System.out.print("Salary of Employee  " + i + ": ");
      income[i] = sc.nextDouble();
    }

    for (int i = 1; i < 6; i++) {
      income[i] = income[i] + (income[i] * 0.05);

      try {
        sleep(2000);
      } catch (Exception e) {
        // TODO: handle exception
      }

      System.out.println(
        "Incremented salary of EMployee " + i + ": " + income[i]
      );
    }
  }
}

public class prac2 {

  public static void main(String[] args) {
    salary s = new salary();
    s.start();
  }
}
