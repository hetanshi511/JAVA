import java.util.Scanner;

public class p7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    account a1 = new account();
    a1.withdraw(500);
    a1.deposite(400);
    a1.display();
    account a2 = new account(44, 10000);
    a2.withdraw(20000);
    a2.deposite(5000);
    a2.display();
    account a3 = new account();
    a3.setid(88);
    a3.setbalance(5000);
    a3.setArate(5);
    a3.deposite(3000);
    a3.withdraw(5666);
    a3.display();
  }
}
