import java.util.Scanner;

public class Morsecode {

  public static void main(String[] args) {
    char[] letter = {
      'a',
      'b',
      'c',
      'd',
      'e',
      'f',
      'g',
      'h',
      'i',
      'j',
      'k',
      'l',
      'm',
      'n',
      'o',
      'p',
      'q',
      'r',
      's',
      't',
      'u',
      'v',
      'w',
      'x',
      'y',
      'z',
      '1',
      '2',
      '3',
      '4',
      '5',
      '6',
      '7',
      '8',
      '9',
      '0',
    };

    String[] code = {
      ".-",
      "-...",
      "-.-.",
      "-..",
      ".",
      "..-.",
      "--.",
      "....",
      "..",
      ".---",
      "-.-",
      ".-..",
      "--",
      "-.",
      "---",
      ".--.",
      "--.-",
      ".-.",
      "...",
      "-",
      "..-",
      "...-",
      ".--",
      "-..-",
      "-.--",
      "--..",
      "|",
    };

    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    Scanner c = new Scanner(System.in);
    String morsecode = c.nextLine();

    //String word = "Elina";
    //String morsecode = ". .-.. .. -. .-";
    word = word.toLowerCase();
    for (int i = 0; i < word.length(); i++) {
      char[] chars = word.toCharArray();
      for (int j = 0; j < letter.length; j++) {
        if (chars[i] == letter[j]) {
          System.out.print(code[j] + " ");
          break;
        }
      }
    }
    System.out.println();

    String[] arrsplit = morsecode.split(" ");
    for (int i = 0; i < arrsplit.length; i++) {
      for (int j = 0; j < code.length; j++) {
        if (arrsplit[i].equals(code[j])) {
          System.out.print(letter[j]);
          break;
        }
      }
    }
  }
}
