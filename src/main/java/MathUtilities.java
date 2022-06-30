 

public class MathUtilities{
    
  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd number
   * @return the sum of the two numbers
   */
  public Integer add(Integer baseValue, Integer valueToAdd){

      return baseValue + valueToAdd;
  }

  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd second number
   * @return the sum of the two numbers
   */
  public Double add(Double baseValue, Double valueToAdd){

      return baseValue + valueToAdd;
  }

  /**
   * Get half the value of the number
   * @param number the number given
   * @return the half of the number in double
   */
  public Double half(Integer number) {
      // need to match the method type with the return type
      // create a new variable to hold the value and return it
      double numbHalf = number/2;

      // return (double)(number/2)
      // right answer number/2.0 --> still come out as an integer, b/c there is a floating number

      return numbHalf;
  }

  /**
   * Determine if the number is odd
   * @param number the number given
   * @return true if the number is odd, false if it is even
   */
  public Boolean isOdd(Integer number){
      // set a boolean variable
      // check if even, set get to false
      // check if odd, set get to true
      // return get
      boolean get;

      // One way to answer it
      // Start messing with the code, comment out Khris code, okay to leav it in the assestment
      // if (number%2==1)
      // return true;
      // else return false;
      // Dont have to have the else if the only other thing to return is a false

      // Its a boolean so you can just return number %2!=0


      if(number%2==0) {
          get = false;
      } else {   // Don't need this section
          get = true;
      }

      return get;
  }


  /**
   * Multiply the number by itself
   * @param number the number given
   * @return the result of the number multiply by itself
   */
  public Integer square(Integer number) {
      // cast the (int) math.pow(number,2)

      return number * number;
  }

}
