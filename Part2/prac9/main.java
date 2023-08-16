import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    GasMeter g = new GasMeter();
    double quantity;
    while (true) {
      System.out.println(
        "what do you want : 1=95, 2=98, 3=Diesel (type any other number to quit) : "
      );
      int type = sc.nextInt();
      if (type >= 1 && type <= 3) {
        System.out.println("How much do you want to refuel : ");
        quantity = sc.nextDouble();
      } else {
        break;
      }
      g.settrack(type, quantity);
    }
    g.display();
  }
}
