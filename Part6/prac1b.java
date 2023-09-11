class implimentRunnableInterface implements Runnable{
    public void run(){
        System.out.println("Hello world!");
        System.out.println(Thread.currentThread().getName());
    }
}
public class prac1b {
    public static void main(String[] args) {
        implimentRunnableInterface r= new implimentRunnableInterface();
        Thread th=new Thread(r);
        th.start();
    }
}
