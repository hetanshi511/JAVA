class armstrong{
    public static void main(String[] args)
    {
        int n =Integer.parseInt(args[0]);
        int originalnum = n,digit=0,sum=0;
        while(n>0)
        {
            n =(n/10);
            digit++;
        }
        while(originalnum>0)
        {
            int lastdigit= n %10;
            sum +=Math.pow(lastdigit, digit);
            originalnum=(originalnum/10);
        }
        if(sum==originalnum)
        System.out.println("Number is armstrong");
        else
         System.out.println("Number is not armstrong");
    }
}