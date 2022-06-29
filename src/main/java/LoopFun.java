import java.nio.CharBuffer;

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          // set a variable equal to 1
          // loop through the input (number) and multiply the result by i and sum it to itself
          // return the result
          int result = 1;

          for(int i = 1; i< number; i++) {
              result += result * i;
          }

          return result;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          // Set a variable to an empty string
          // set acronym to the first charachter at index 0
          // Set up a for loop to pass through the string length
          // if there is any white space in the string, add the space into the variable
          // move to the next variable
          // replace any whitespace as a character and set it to upper case
          // Upper case doesnt matter, just get the three letters

          String acronymOut = "";

          acronymOut += phrase.charAt(0);

          for(int i = 0; i < phrase.length(); i++) {
              if(Character.isWhitespace(phrase.charAt(i))) {
                  acronymOut += phrase.charAt(i);
                  acronymOut += phrase.charAt(i+1);

              }
          }



          return acronymOut.replaceAll("\\s+", "").toUpperCase();



      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
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

          // Created a string builder instance to get the method append
          // Added the string word into the array
          // Set char array result equal to a new char with the string length
          // for loop from the length of the char array
          // iterated into the result array characters from the alphabet and shifted by 3 for the length of the array
          // Need to understand how to get the alphabet for characters and reshape an array
          // set the resulting character into a string wrapper to return the string

          StringBuilder str = new StringBuilder();
          str.append(word);
          char[] charArray = new char[str.length()];
          for(int i = 0; i<charArray.length; i++){
              charArray[i] = (char) ((char) (str.charAt(i) - 'a' + 3) % 26 + 'a');
          }

          return String.valueOf(charArray);
      }
}
