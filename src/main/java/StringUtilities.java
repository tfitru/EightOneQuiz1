import java.util.ArrayList;

public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        // set the string as the return
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        //create string buiildier object
        // add the baseValue
        // add the valueToBAdded
        // return string

        // return baseValue + valueToBeAdded;
        // Alternative return baseValue.concat(valueToBeAdded)
        // Why baseValue is an object, calling concat on it to pass


        StringBuilder str = new StringBuilder();
        str.append(baseValue);
        str.append(valueToBeAdded);


        return str.toString();
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {

        // create a string builder object
        // add the string to the string builder
        // call the reverse method
        // return the string
        // need to look up the reverse with characters


        // return New StringBuilder(valueToBeReverseed).reversed().toString();

        StringBuilder str = new StringBuilder();

            str.append(valueToBeReversed);
            str.reverse();




        return str.toString();
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {

        // set two char variables
        // create an if statement
        // If the word's length is divisible by 2 then set
        // the char value for one of the variables to the word length divided by 2 minus 1
        // it is going to cut the word in half and look at the character at the end
        // return that character value
        // else if the length is not divisible by 2
        // then cut the word in half and return that character value

        //
        // return word.charAt(word.length()/2);


        char charMid1;
        char charMid2;
        if(word.length() % 2 ==0) {
            charMid1 = word.charAt((word.length()/2) - 1);
            return charMid1;
        } else {
            charMid2 = word.charAt((word.length()/2));
            return charMid2;
        }

    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String charToRemoveHold = "";
        // Set a string to the value of the character I want to remove
        // create an if statement to check if the string contains the x
        // if it does contain the word, set a variable equal to the replacement of the character at that position (value.replace(charToRemoveStr, "")

        // String s = value.replaceAll(String.valueOf(charToRemove), "");
        // return

        String charToRemoveStr = String.valueOf(charToRemove);
        if(value.contains(charToRemoveStr)) {
            charToRemoveHold = value.replace(charToRemoveStr,"");
            return charToRemoveHold;
        }

        return "";
    }

    //

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {


        // Alternative way, ArrayList<String> s = new ArrayList<>(sentence.split(" ));
        //return s.get(s.size()-1);



        // Create an array of the string and split it with a string containing space
        String[] lastWordGet = sentence.split(" ");

        // return the array[array.length - 1]
        return lastWordGet[lastWordGet.length - 1];
    }
}
