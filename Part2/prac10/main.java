import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String inpstr = sc.nextLine();
    sc.close();
    String[] arrsplit = inpstr.split(" ");

    if (arrsplit.length == 1) {
      System.out.println("Modified String : ");
      rep(inpstr);
      System.out.println("Length of the String is : " + inpstr.length());
    }

    if (arrsplit.length > 1) {
      String modifiedString = rep(arrsplit);
      System.out.println(modifiedString);

      if (modifiedString.length() > 10) {
        System.out.println(modifiedString.toLowerCase());
      }
    }
  }

  public static void rep(String inpstr) {
    inpstr = inpstr.replace('A', 'Z');
    inpstr = inpstr.replace('a', 'z');
    System.out.println(inpstr);
  }

  public static String rep(String arrsplit[]) {
    arrsplit[1] = "CHARUSAT";
    String string = String.join(" ", arrsplit);
    return string;
  }
}
