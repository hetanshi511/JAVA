class Factorial {

  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    Factorial d = new Factorial();

    int ans = d.factorial(x);
    System.out.println(ans);
  }

  int factorial(int n) {
    if (n == 0 || n == 1) return 1; else return (n * factorial(n - 1));
  }
}
