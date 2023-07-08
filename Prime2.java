class Prime {
    public static void main(String arg[]) {
        int n = Integer.parseInt(arg[0]);
       for(int i=0;i<=n;i++)
       {
        if(i%2!=0 || i%i==0 )
        System.out.println("Prime number is " + i) ;
       }
        }
    }
}