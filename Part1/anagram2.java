import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class anagram2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    char[] suffleword= 
    String s1 = sc.nextLine();
    test(s1, word);
  }

  static void test(String s1, String word) {
    if (s1.length() != word.length()) {
      System.out.println("Not an anagram");
      return;
    }

    char[] shuffledWord = shuffleWord(word);
    if (areAnagrams(s1.toCharArray(), shuffledWord)) {
      System.out.println(s1 + " and " + word + " are anagrams.");
    } else {
      System.out.println(s1 + " and " + word + " are NOT anagrams.");
    }
  }

  static char[] shuffleWord(String word) {
    char[] chars = word.toCharArray();
    Random random = new Random();
    for (int i = 0; i < word.length() - 1; i++) {
      int j = random.nextInt(word.length() - 1);
      char temp = chars[i];
      chars[i] = chars[j];
      chars[j] = temp;
    }
    return chars;
  }

  static boolean areAnagrams(char[] s1Chars, char[] shuffledChars) {
    Arrays.sort(s1Chars);
    Arrays.sort(shuffledChars);
    return Arrays.equals(s1Chars, shuffledChars);
  }
}
