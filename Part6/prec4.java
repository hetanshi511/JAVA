class ProductBooking implements Runnable {

  int Product = 2;
//   int item;

//   ProductBooking(int item) {
//     this.item = item;
//   }

  public void run() {
    synchronized (this) {
      System.out.println(
        "Waiting to book Product for : " + Thread.currentThread().getName()
      );
      if (Product > 0) {
        System.out.println(
          "Booking Product for : " + Thread.currentThread().getName()
        );

        //Let's say system takes some time in booking Product (here we have taken 1 second time)
        try {
          Thread.sleep(1000);
        } catch (Exception e) {}

        Product--;
        System.out.println(
          "Product BOOKED for : " + Thread.currentThread().getName()
        );
        System.out.println("currently Product = " + Product);
      } else {
        System.out.println(
          "Product NOT BOOKED for : " + Thread.currentThread().getName()
        );
      }
    }
  }
}

public class prec4 {

  public static void main(String[] args) throws InterruptedException {
    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter number of product : ");
    // int x = sc.nextInt();

    ProductBooking obj = new ProductBooking();

    Thread thread1 = new Thread(obj, "Consumer1 Thread");
    Thread thread2 = new Thread(obj, "Consumer2 Thread");
    Thread thread3 = new Thread(obj, "Consumer3 Thread");

    thread1.start();
    thread1.join();

    thread2.start();
    thread2.join();

    thread3.start();
  }
}
