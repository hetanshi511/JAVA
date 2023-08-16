package series;

public class Harmonic {
  public double ans = 0.0;

  public double calculate(int n) {
    for (int i = 1; i <= n; i++) {
      ans = ans + (1.0 / i);
    }
    return ans;
  }
}
