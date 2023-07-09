class pattern2
{
    public static void main(String[] args)
    {
        int n=6;
        for(int row = 0; row < n  ;row++)
        {
           int printingcol = row > (n/2) ? n - row : row;

           int space = (n/2)- printingcol;
           for(int s=0; s < space ; s++)
           {
             System.out.print(" ");
           }
           for(int col = 0 ; col <  printingcol; col++)
           {
            System.out.print(" "+ row);
           }   
           System.out.println();
        }
    }
}
