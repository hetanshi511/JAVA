class Synchexample {

  public void display(String name) throws InterruptedException {
    synchronized (Synchexample.class) {
      for (int i = 0; i < 5; i++) {
        Thread.sleep(1000);
        System.out.println(name );
      }
    }
  }
}

class Mythread extends Thread {

  Synchexample s;
  String name;
  

  Mythread(Synchexample s, String name) {
    this.s = s;
    this.name = name;
    
  }

  public void run() {
    try {
      s.display(name);
    } catch (InterruptedException e) {
      // TODO: handle exception
      throw new RuntimeException(e);
    }
  }
}

public class prec3B {

  public static void main(String[] args) throws InterruptedException {
    Synchexample s = new Synchexample();
    Mythread m = new Mythread(s, "Dhoni");
    m.start();
    m.join();
    Mythread m1 = new Mythread(s, "Kohli");
    m1.start();
    m1.join();
    Mythread m2 = new Mythread(s, "Hardik");
    m2.start();
  }
}
