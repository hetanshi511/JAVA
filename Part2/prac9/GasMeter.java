public class GasMeter {

  private double type95;
  private double type98;
  private double Diesel;

  public void settrack(int type, double quantity) {
    if (type == 1) {
      type95 += quantity;
    } else if (type == 2) {
      type98 += quantity;
    } else if (type == 3) {
      Diesel += quantity;
    }
  }

  public double getTotalUsedFuel() {
    return type95 + type98 + Diesel;
  }

  public double getTotal95Quantity() {
    return type95;
  }

  public double getTotal98Quantity() {
    return type98;
  }

  public double getTotalDeiselQuantity() {
    return Diesel;
  }

  public void display() {
    System.out.println("Total used fuel : " + getTotalUsedFuel());
    System.out.println("Total used 95 octane fuel : " + getTotal95Quantity());
    System.out.println("Total used 98 octane fuel : " + getTotal98Quantity());
    System.out.println("Total used Diesel fuel : " + getTotalDeiselQuantity());
  }
}
