import java.util.Scanner;

public class practical21 {

  public static void main(String[] args) {
    Microsoft_product[] obj = new Microsoft_product[2];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < obj.length; i++) {
      obj[i] = new Microsoft_product();
      System.out.print("ENter product name : ");
      obj[i].setName(sc.next());
      System.out.print("ENter product number : ");
      obj[i].setNo(Float.parseFloat(sc.next()));
      System.out.print("ENter product price : ");
      obj[i].setPrice(Float.parseFloat(sc.next()));
      System.out.print("ENter product ActivationKey : ");
      obj[i].setKey(sc.next());
    }
    System.out.println("digit");
    int digit = Integer.parseInt(sc.next());
    if (digit == 1) {
      System.out.println("enter product no");
      float findNumber = Float.parseFloat(sc.next());
      for (int i = 0; i < 5; i++) {
        if (obj[i].getNo() == findNumber) {
          obj[i].display();
          break;
        }
      }
    } else if (digit == 2) {
      System.out.println("enter product name");
      String findName = sc.next();
      for (int i = 0; i < 5; i++) {
        if (obj[i].getName().equals(findName)) {
          obj[i].display();
          break;
        }
      }
    } else {
      System.out.println("Enter valid entry");
    }
  }
}
