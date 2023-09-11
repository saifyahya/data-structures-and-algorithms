package CC13.lib.src.main.java.cc13;

import CC10.lib.src.main.java.cc10.datastsructure.Stack;

public class StackBracketsValidator {

    public static boolean validateBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        char[] characters = str.toCharArray();
        for(char character: characters) {
            if((int) character ==40 || (int) character ==41 || (int) character ==91 ||    // skip other characters rather than brackets
                    (int) character == 93 || (int) character == 123 || (int) character ==125) {
                if(character=='{' ||
                        character=='(' ||
                        character=='[')
                    stack.push(character);
                else {
                    if(stack.isEmpty())
                        return false;
                    else if( (stack.peak()=='{' && character=='}') ||
                            (stack.peak()=='(' && character==')') ||
                            (stack.peak()=='[' && character==']') )
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
