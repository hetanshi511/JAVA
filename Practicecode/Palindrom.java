class Palindrom
{
    public static void main(String [] args)
    {
        int num = Integer.parseInt(args[0]);
        
        int reverse = 0;
        int originalnum = num;
        
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = (num/ 10);
        }
        
        if (originalnum == reverse) {
            System.out.println("Number  is a palindrom");
        } else {
            System.out.println("Number  is not a palindrom");
        }
        
    }
}