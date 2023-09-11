import java.util.Scanner;

class SmallException extends Exception {

  SmallException(String msg) {
    super(msg);
  }
}

class BigException extends Exception {

  BigException(String msg) {
    super(msg);
  }
}

class OwnException {

  void printErrorReport(Exception e) {
    System.out.println("Error report " + e.getMessage());
  }

  void testvalue(int n) throws SmallException, BigException {
    if (n < 5) {
      throw new SmallException("value is less than 5");
    }
    if (n > 10) {
      throw new BigException("value is greater than 10");
    }
  }
}

public class prac2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number : ");
    int x = sc.nextInt();
    OwnException o = new OwnException();
    try {
      o.testvalue(x);
    } catch (SmallException s) {
      // TODO: handle exception
      o.printErrorReport(s);
    } catch (BigException b) {
      o.printErrorReport(b);
    }
  }
}
