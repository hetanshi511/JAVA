import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class anagram {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String word=sc.nextLine();
System.out.println("enter gussing word : ");
String s1=sc.next();
   test(s1,word);
  }
    static void test(String s1,String word){
       
        for (int i = 0; i < word.length(); i++) {
            char[] chars = word.toCharArray();
        
        Random random=new Random();
        for(int i=0;i<word.length(),i++){
             int j=random.nextInt(word.length()-1);
             swap(word,i,j);
           
            }
            System.out.println("new anagram : "+chars);
        }
      
        static void swap(int word[],int i,int j){
            int temp=word[i];
            word[i]=word[j];
            word[j]=temp;
        }    
         if(s1.length==word.length){
            
    char[] chars2 = s1.toCharArray();
      Arrays.sort(chars);
      Arrays.sort(chars2);
      if (Arrays.equals(chars, chars2)) {
        System.out.println("Both the strings are anagram");
      } else {
        System.out.println("The strings are not anagram");
      }
    }
}
}
