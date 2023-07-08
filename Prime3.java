class Prime3 {
    public static void main(String arg[]) {
        int n = Integer.parseInt(arg[0]);
        int i = 1, j = 1, count = 0, num = 0;
        while (num <= n) {
            while (j <= i) {
                if (i % j == 0) {
                    count++;
                }
                j++;
            }

            if (count == 2) {
                System.out.println("Prime Number " + num);
                num++;
            }

            i++;
        }
    }
}