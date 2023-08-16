class patternp5 {

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    for (int row = 1; row <= n; row++) {
        if(row<=(n/2))
        {
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
    }
        else
        {
         for (int col = 1; col <=n - row + 1 ; col++) {
        System.out.print("* ");
               }
      }
       System.out.println();
    }
     
    }
  }

