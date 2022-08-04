import java.util.*;
 
public class balanced {
 
    public static void main(String[] args) {
 
         //String str = "{[]})";
         System.out.println("Input String : ");
          Scanner sc = new Scanner(System.in);
          String str = sc.nextLine();
         //Declare a stack
         Stack<Character> st = new Stack<Character>();
 
         //Traverse a string
         for(int i = 0; i < str.length(); i++) {
 
            /* If the current character is starting bracket,
               then push them in a stack
             */
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                   st.push(str.charAt(i));
 
            /* 
               Else, If the stack is not empty,
               And current character is a closing bracket
               and top character of a stack is matching open bracket
               then pop it.
             */
            } else if ( !st.empty() && ((str.charAt(i) == ']' && st.peek() == '[') || (str.charAt(i) == '}' && st.peek() == '{') || (str.charAt(i) == ')' && st.peek() == '('))) {
 
                   st.pop();
 
             } else {
                  st.push(str.charAt(i));
             }
         }
 
         if(st.empty()) {
              System.out.println("Balanced");
         } else {
              System.out.println("Not balanced");
         }
   }
}