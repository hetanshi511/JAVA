class synchclass{
    public void display() throws InterruptedException{
        
    }
}
class Consumer extends Thread{
    int arr[];

    Consumer(int[] arr){
        this.arr=arr;
    }

    public void run(){
        for(int i=0;i<arr.length;i++){
            System.out.println(" Consumer "+i);
        }
    }

}
class Producer extends Thread{
    int arr[];

    Producer(int[] arr){
        this.arr=arr;
    }
    public void run(){
        for(int i=0;i<arr.length;i++){
            System.out.println(" Producer "+i);
        }
    }
}
public class Pcsol {
    public static void main(String[] args) throws InterruptedException {
        int arr[]={0,1,2,3,4,5,6};
        Producer p = new Producer(arr);
        p.start();
        p.join();
        Consumer c = new Consumer(arr);
        c.start();
    
}
}
