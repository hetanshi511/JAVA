import java.util.Scanner;

interface Recycable {
  default void display() {
    System.out.println("Give proper input");
  }
}

class Fabric implements Recycable {

  public String toString() {
    return "Fabric";
  }
}

class Bottle implements Recycable {

  public String toString() {
    return "Bottle";
  }
}

class Paper implements Recycable {

  public String toString() {
    return "Paper";
  }
}

public class Maininterface {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Fabric f = new Fabric();
    Bottle b = new Bottle();
    Paper p = new Paper();
    boolean a = true;
    System.out.println("What do you want to recycle? ");
    System.out.println("1 - Clothes");
    System.out.println("2 - Bottles");
    System.out.println("3 - Newspapers");
    System.out.println("4 - Exit");

    while (a) {
      System.out.print("Choose a Number : ");
      int x = sc.nextInt();
      switch (x) {
        case 1:
          System.out.println(f + " Recycled");
          break;
        case 2:
          System.out.println(b + " Recycled");
          break;
        case 3:
          System.out.println(p + " Recycled");
          break;
        case 4:
          System.out.println("Thanks for coming");
          a = false;
          break;
        default:
          f.display();
          break;
      }
    }
  }
}
