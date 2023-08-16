class maxnum {

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(args[i + 1]);
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
    System.out.println("maximum number among all is " + arr[n - 1]);
  }
}
