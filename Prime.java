class Prime {
    public static void main(String arg[]) {
        int n = Integer.parseInt(arg[0]);
        int i = 0;
        for (i = 0; i <= n; i++) {
            if (i % 2 != 0)
                System.out.println("Prime number is " + i) ;
        }
    }
}