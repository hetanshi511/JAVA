class Calculator {

  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[2]);
    String s = args[1];
    int flag = 0;

    int c = 0;

    if (s.equals("+")) {
      flag = 1;
    } else if (s.equals("-")) {
      flag = 2;
    } else if (s.equals("x")) {
      flag = 3;
    } else if (s.equals("/")) {
      flag = 4;
    } else if (s.equals("%")) {
      flag = 5;
    }

    switch (flag) {
      case 1:
        c = a + b;
        break;
      case 2:
        c = a - b;
        break;
      case 3:
        c = a * b;
        break;
      case 4:
        c = a / b;
        break;
      case 5:
        c = a % b;
        break;
      default:
        System.out.println("enter valid operation");
        break;
    }
    System.out.println("answer c = " + c);
  }
}
