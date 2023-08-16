import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    /*point p = new point(-88, 70);
    p.move(30, 40);
    System.out.println(p.toString());*/
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter intital x : ");
    int m = Integer.parseInt(sc.next());
    System.out.print("Enter initial y : ");
    int n = Integer.parseInt(sc.next());
    point p = new point(m, n);
    System.out.print("initial coordinates : ");
    System.out.print(p.toString());
    System.out.println();
    System.out.print("X2 : ");
    int x = Integer.parseInt(sc.next());
    System.out.print("y2 : ");
    int y = Integer.parseInt(sc.next());
    p.move(x, y);
    System.out.print("Final Position coordinates is :");
    System.out.print(p.toString());
  }
}
