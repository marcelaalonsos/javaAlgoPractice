/*
 * given a string s containing just the characters  '(',')','[',']','{','}' determine is the input string is valid
 */

import java.util.Stack;

class Solution {
  public boolean validParenthesis(String s) {
    //create a new stack to store the characters
    Stack<Character> stack = new Stack<>();
    //convert string into char array and access the characters using for each loop
    for(char c : s.toCharArray()){
      //check c
      switch (c) {
        //open bracket then push it to the stack
        //close bracket then pop the item and compare
        case '(':
        case '{':
        case '[':
          stack.push(c);
          break;
        case ')':
        //if the stack is empty then it means string have no open bracket, hence its invalid
        if(stack.isEmpty() || stack.pop() != '(') {
          return false;
        }
        break;
        case '}':
        if(stack.isEmpty() || stack.pop() != '{') {
          return false;
        }
        break;
        case ']':
        if(stack.isEmpty() || stack.pop() != '[') {
          return false;
        }
        break;
      }
    }
    //after the loop we have to check one more condition
    //return true only if the stack is empty
    //if the stack is not empty, that means we have unused brackets
    return stack.isEmpty();
  }
}
