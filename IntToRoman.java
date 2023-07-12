/*
 * given an integer, convert it to a roman numeral
 */

class Solution {
  public String intToRoman(int num) {
    //create a table of roman symbols and their values
    String roman[] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    int val[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    //initialize and set the index i
    int i = roman.length -1;
    //create variable to store solution
    String sol = "";
    //iterate through the num
    while(num > 0){
      //loop will work until the value of the integer is less or equal to the num
      while(val[i] <= num) {
        //append the roman into the solution string
        sol += roman[i];
        //subtract the value from the given integer
        //subtract the current number until the given integer is greater than th current number
        num -= val[i];
      }
      i--;
    }
    //once we're done with all the roman, we return the solution string
    return sol;
  }
}
