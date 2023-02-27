package org.shashank.problems.misc;

import java.util.Stack;

public class NextGreater {

    public static void printNextGreater(int[] arr){
        int n = arr.length;

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        int next, topElement;

        for(int i=0; i<n; i++){
            next = arr[i];

            if(!stack.isEmpty()){
                topElement = stack.pop();
                while(topElement < next){
                    System.out.println("The next greater element for  " + topElement
                    + " is - " + next);
                    if(stack.isEmpty()) break;
                    topElement = stack.pop();
                }
                if(topElement > next) stack.push(next);
            }
            stack.push(next);
        }

        for(Integer i: stack){
            System.out.println("The next greater element for  " + i +" is -1");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 11, 13, 21, 3 };
        printNextGreater(arr);
    }
}
