public class Microsoft_product {

  private float productNo;
  private String productName;
  private String activationKey;
  private float productPrice;

  public float getNo() {
    return productNo;
  }

  public void setNo(float productNo) {
    this.productNo = productNo;
  }

  public String getName() {
    return productName;
  }

  public void setName(String productName) {
    this.productName = productName;
  }

  public String getKey() {
    return activationKey;
  }

  public void setKey(String activationKey) {
    this.activationKey = activationKey;
  }

  public float getPrice() {
    return productPrice;
  }

  public void setPrice(float productPrice) {
    this.productPrice = productPrice;
  }

  public void display() {
    System.out.println("Product name is : " + getName());
    System.out.println("Product number is : " + getNo());
    System.out.println("Product price is : " + getPrice());
    System.out.println("ACtivation Key is : " + getKey());
  }
}
