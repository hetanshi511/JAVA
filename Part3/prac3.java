import java.util.Scanner;

interface Recycable {
  default void display() {
    System.out.println("Bottle returned for recycling");
  }
}

class Bottle implements Recycable {

  double vol;

  Bottle(double vol) {
    this.vol = vol;
  }

  public Double volume() {
    return vol;
  }
}

class Sodabottle extends Bottle {

  String name;

  Sodabottle(double vol, String name) {
    super(vol);
    this.name = name;
  }

  public String toString() {
    return name;
  }

  public Double volume() {
    return vol;
  }
}

public class prac3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Type in the name of the soda:");
    String name = sc.next();
    System.out.print("Type in the volume of the bottle:");
    double volu = sc.nextDouble();
    Bottle b = new Bottle(volu);
    Sodabottle sb = new Sodabottle(volu, name);
    System.out.println(name + " ," + volu + " Litres");

    sb.display();
  }
}
