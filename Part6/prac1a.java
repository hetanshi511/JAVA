
class ExtendThreadclass extends Thread{
   public void run(){
        System.out.println("Hello World!");
        System.out.println(Thread.currentThread().getName());
    }
}
public class prac1a {
    public static void main(String[] args) {
        ExtendThreadclass i=new ExtendThreadclass();
        i.start();
    }
}
