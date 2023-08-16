import java.util.Scanner;
import series.Harmonic;

public class prac4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Harmonic h = new Harmonic();
    int a = sc.nextInt();
    double x = h.calculate(a);
    System.out.println(x);
  }
}
