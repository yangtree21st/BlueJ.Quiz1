import java.lang.Math;
import static java.lang.System.*;



public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reverse = "";
        for(int i = valueToBeReversed. length() - 1; i >= 0; i--) {
        reverse = reverse + valueToBeReversed. charAt(i); 
       }
       return reverse;
      }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        
        int mid;
        if( word.length()%2 == 0){
            mid = word.length()/2;
        }
        else{
            mid = Math.round(word.length()/2 );
           
        }
        
        return word.charAt(mid);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    
    /** public static String removeCharacter(String str, char charToRemove){
        String rmStr = Character.toString(charToRemove);
        String repString = replaceMethod(str, rmStr," ");
        return repString;
    }

    static String replaceMethod(String str, String from, String to) 
    {
        String[] arr = str.split(from);
        StringBuilder output = new StringBuilder();

        int i = 0;
        for (; i < arr.length - 1; i++){
        output.append(arr[i]).append(to);}

        output.append(arr[i]);
        if (str.substring(str.lastIndexOf(" ")).equalsIgnoreCase(" " + from))
           { output.append(to);
            }
        return output.toString();
    } */

    public String removeCharacter(String value, Character charToRemove) {
        int position = value.indexOf(charToRemove)  ;
        return charRemoveAt(value, position);
    }
    public static String charRemoveAt(String str, int position) {  
              return str.substring(0, position) + str.substring(position + 1);  
     }  
    

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
       
        
        return  sentence.substring(sentence.lastIndexOf(" ")+1);
    }
}
