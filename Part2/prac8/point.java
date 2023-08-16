public class point {

  private int x;
  private int y;

  point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void move(int dx, int dy) {
    this.x += dx;
    this.y += dy;
    if (x > 100 || x < 0) {
      x = 0;
    }
    if (y > 100 || y < 0) {
      y = 100;
    }
  }

  public String toString() {
    return "(" + x + "," + y + ")";
  }
}
