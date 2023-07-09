 
class prime {
    public static void main(String arg[]) {
        int n = Integer.parseInt(arg[0]);
        int i = 1, num = 0;
        while (num < n) {
            int j=1;
            int count=0;
            while (j <= i) {
                
                if (i % j == 0) {
                    count++;
                }
                j++;
            }
            if (count == 2) {
                System.out.println("Prime Number " + i);
                num++;
            }
            i++;
        }
    }
}