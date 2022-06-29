 

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

      if(number%2==0) {
          get = false;
      } else {
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

      return number * number;
  }

}
