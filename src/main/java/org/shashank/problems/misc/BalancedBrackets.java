package org.shashank.problems.misc;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

    public static boolean isStringBalanced(String str){

//        Stack<Character> stack = new Stack<>();
        // Stack is LIFO so always use addFirst
        // push() Pushes an element onto the stack represented by this deque.
        //   In other words, inserts the element at the front of this deque.
        Deque<Character> stack
                = new ArrayDeque<>();
        String openingBrackets = "{[(";
        char prevBracket;

        for(int i =0; i < str.length(); i ++){
            char c = str.charAt(i);
            if(openingBrackets.indexOf(c)!= -1){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    prevBracket = stack.pop();
                    switch(c) {
                        case ')':
                            if (prevBracket != '(') return false;
                            break;
                        case '}':
                            if (prevBracket != '{') return false;
                            break;
                        case ']':
                            if (prevBracket != '[') return false;
                            break;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isStringBalanced("[()]{}{[()()]()}"));
    }
}
