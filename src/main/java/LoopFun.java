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
          // My though was to create a way to trim the space between the string
          // cut out the uppercase letters and append them to another string builder
          // But could not figure out how to set the middle to upper c

          int j = 0;

          StringBuilder str = new StringBuilder();
          StringBuilder strC = new StringBuilder();

          String holder = "";
          str.append(phrase);
          for(int i = 0; i<phrase.length(); i++) {
              if(!Character.isWhitespace(str.charAt(i))) {
                  str.setCharAt(j++, str.charAt(i));
              }
          }


          str.delete(j, phrase.length());
          str.trimToSize();



          for(int i = 0; i<str.length(); i++) {
              if(Character.isUpperCase(str.charAt(i))) {
                  strC.append(str.charAt(i));
              }

          }

          return strC.toString();
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
