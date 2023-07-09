class Prime3{
    public static void main(String[] args){
int n = Integer.parseInt(args[0]);
        int i = 1, num = 0;

        while (num < n) {
            int count = 0;
            int j = 1;
            
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