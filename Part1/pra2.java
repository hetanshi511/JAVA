import java.util.Scanner;

public class pra2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("The NUmber is in form of +91-AA-BBB-CCCCC ");
    String num = sc.next();
    String[] arrsplit = num.split("-");

    System.out.println(arrsplit[0]);
    System.out.println("Operator code : " + arrsplit[1]);
    System.out.println("MSC : " + arrsplit[2]);
    System.out.println("Unique Code : " + arrsplit[3]);
  }
}
