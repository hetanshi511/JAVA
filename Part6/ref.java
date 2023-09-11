import java.util.Scanner;
class Employees extends Thread
{
    public void run()
    {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    for(int i=1;i<6;i++)
    {
        System.out.print("Enter the salary for " + i + ":");
        a[i]=sc.nextInt();
    }
    for(int i=1;i<6;i++)
    {
        a[i]+=(a[i]*5/100);
        try
        {
            sleep(2000);
        }
        catch(Exception e)
        {
           System.out.println("Error !!!");
        }
        System.out.println("Salary after Increment :"+ i + ":" +a[i]);
    }
    }
}
public class ref
{
   public static void main(String[] args) 
   {
        Employees E = new Employees();
        E.start();
   } 
}
