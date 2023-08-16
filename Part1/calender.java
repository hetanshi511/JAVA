import java.util.Scanner;

public class calender {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter month (1-12):");
    int month = scanner.nextInt();
    int temp = 0;
    System.out.println("Enter year:");
    int year = scanner.nextInt();
    scanner.close();
    String[] months = {
      "January",
      "February",
      "March",
      "April",
      "May",
      "June",
      "July",
      "August",
      "September",
      "October",
      "November",
      "December",
    };
    int[] monthDays = { 3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3 };
    boolean isLeap = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)
      ? true
      : false;

    int firstDayOfMonth, daysInMonth;
    firstDayOfMonth = 1;
    daysInMonth = 28 + monthDays[month - 1] + (isLeap && month == 2 ? 1 : 0);
    int x =
      (
        firstDayOfMonth +
        ((13 * (month + 1)) / 5) +
        year +
        (year / 4) -
        (year / 100) +
        (year / 400)
      ) %
      7;
    x = x + 6;
    System.out.print(months[month - 1]);
    System.out.println(" " + year);
    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    for (int i = 0; i < 40; i++) {
      if (i >= x) {
        temp++;
        System.out.printf("%3d ", temp);
      } else System.out.printf("%3c ", 32);
      if (temp == daysInMonth) break;
      if (
        i == 6 || i == 13 || i == 20 || i == 27 || i == 34
      ) System.out.println();
    }
  }
}
