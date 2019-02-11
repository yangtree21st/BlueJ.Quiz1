import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math; 
import java.math.BigInteger;
public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          
         BigInteger f = new BigInteger("1");
        for (int i =1;i<=number;i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
          return  f.intValue(); 
        }
   

      

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          //String result = Arrays.stream(word.trim().split(" "))
         //** String[] array = phrase.split(" ");
          //int length = array.length;
         //.map(word -> word.charAt(0))
          //for (int i =0;i<length;i++ ){
          // String s += array[i][0];
        //
         //.map(c -> c.toString().toUpperCase())
         //.collect(Collectors.joining());
        // phrase.split(" ") ;
         //String firstLetters = "";
         
         //for(String s : phrase.split(" "))
          
          //  firstLetters = s.charAt(0);
         //;
         char a[] = phrase.toCharArray();
         String b = "";
         for (int i = 0; i<a.length;i++)
            { if (a[i] != ' '){
                if (i == 0) {
                    char c = a[i];
                    b = Character.toString(c);
                    return  b;
                }
                else if (a [i-1] == ' ' ){
                   char c = a[i];
                   b = Character.toString(c);
                   return  b; }   
                        
            }
       
        }    return b;
      }
      

      /**
       * To prevent anyone from reading our messages, we can encrypt it
       * so it will only be readable by its
       * intended audience. This method encrypt the message by 
       * shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          return null;
      }
}
