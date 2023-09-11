import java.util.Scanner;

public class prac1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean inputCorrect = true;
    try {
      int x = sc.nextInt();
      int y = sc.nextInt();
      System.out.println(x + y);
    } catch (Exception e) {
      System.out.println("You did not type an integer!");
      inputCorrect = false;
      System.out.println("Input value  is " + inputCorrect);
    }
  }
}
