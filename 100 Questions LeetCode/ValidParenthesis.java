// /*
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
//  */

// import java.util.Scanner;

// public class ValidParenthesis 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter you Parenthesis: ");
//         String str = scanner.nextLine();
        
//         if(str = "abc")
//         {
//             System.out.println("Its true");
//         }
//         else
//         {
//             System.out.println("False");
//         }
//     }    
// }

import java.util.Deque;
import java.util.ArrayDeque;

public class ValidParenthesis {

    // Function to check if brackets are balanced
    static boolean areBracketsBalanced(String expr) {
        // Using ArrayDeque for stack implementation
        Deque<Character> stack = new ArrayDeque<>();

        // Traversing the expression
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            // If it's an opening bracket, push it onto the stack
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }

            // If current character is not an opening bracket, it must be closing
            if (stack.isEmpty()) {
                return false; // Stack is empty, no matching opening bracket
            }

            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check != '(') return false; // Mismatch
                    break;
                case '}':
                    check = stack.pop();
                    if (check != '{') return false; // Mismatch
                    break;
                case ']':
                    check = stack.pop();
                    if (check != '[') return false; // Mismatch
                    break;
            }
        }

        // Check if stack is empty at the end
        return stack.isEmpty();
    }

    // Driver code
    public static void main(String[] args) {
        String expr = "([{}])"; // Example input
        if (areBracketsBalanced(expr)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}