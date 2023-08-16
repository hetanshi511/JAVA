import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ana2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    char[] x=generatedanagram(word);
    System.out.println(x);
    System.out.println("enter gussing word : ");
    String s1 = sc.next();
    test(s1, word);
  }

  static void test(String s1, String word) {
    if (s1.length() == word.length()) {
      
      char[] chars = word.toCharArray();
      char[] chars2 = s1.toCharArray();
      Arrays.sort(chars);
      Arrays.sort(chars2);
      if (Arrays.equals(chars, chars2)) {
        System.out.println("Both the strings are anagram");
      } else {
        System.out.println("The strings are not anagram");
      }
    } else {
      System.out.println("The strings are not anagram");
    }
    static char[] generatedanagram(String word){
    char[] chars = word.toCharArray();

    Random random = new Random();
    for (int a = 0; a < word.length(); a++) {
      int j = random.nextInt(word.length() - 1);
      char temp = chars[a];
      chars[a] = chars[j];
      chars[j] = temp;
    }
    return chars;
  }
}

    
}

