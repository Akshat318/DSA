import java.util.Stack;

public class Solution {
    public int longestValidParentheses(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
          stack.push(-1); 
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (stack.isEmpty()) {
                  
                    stack.push(i);
                } else {
                   maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution solver = new Solution();
        
       
        System.out.println(solver.longestValidParentheses("(()")); 
        
        System.out.println(solver.longestValidParentheses(")()())")); 
    }
}
