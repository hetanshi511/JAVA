import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ana {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first string: ");
    String s1 = sc.next();
    char temp;
    Random s = new Random();
    char[] charArr1 = s1.toCharArray();
    for (int i = charArr1.length - 1; i > 0; i--) {
      int j = s.nextInt(i + 1);
      temp = charArr1[i];
      charArr1[i] = charArr1[j];
      charArr1[j] = temp;
    }
    String str = new String(charArr1);
    while (str.equals(s1)) {
      for (int i = charArr1.length - 1; i > 0; i--) {
        int j = s.nextInt(i + 1);
        temp = charArr1[i];
        charArr1[i] = charArr1[j];
        charArr1[j] = temp;
      }
      str = new String(charArr1);
    }
    System.out.println("New generated anagram of the stirng is: " + str);
    System.out.println("Enter the second string: ");
    String s2 = sc.next();
    // System.out.println("The anagram of the string is: ");
    if (s1.length() == s2.length()) {
      // char[] charArr1=s1.toCharArray();
      char[] charArr2 = s2.toCharArray();
      Arrays.sort(charArr1);
      Arrays.sort(charArr2);
      if (Arrays.equals(charArr1, charArr2)) {
        System.out.println("Both the strings are anagram");
      } else {
        System.out.println("The strings are not anagram");
      }
    }
  }
}
