import java.util.Stack;

public class Lab1{
    public static void main(String[] args){
     String str = "{}{{{}{}}}";
     boolean ans = isBalanced(str);
     System.out.println ("Answer : " + ans);
    }

     public static boolean isBalanced(String str){
      Stack<Character> stack = new Stack<Character>();
     for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == '{')
           stack.push(str.charAt(i));
        if(str.charAt(i) == '}'){
        if(stack.isEmpty())
      return false;
       else
           stack.pop();
           }
    }
    if(stack.isEmpty())
       return true;
   else
       return false;
    }
}