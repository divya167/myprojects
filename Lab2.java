import java.util.Stack;
public class Lab2 {
   public static void main(String[] args) {
      String d1="DataStructuresIssss###Fun";
      String d2="DataStructuresIszwp###Fun";
      boolean answer=backspaceCompare(d1,d2);
      System.out.println(answer);      
   }
   public static boolean backspaceCompare(String d1, String d2) {
      Stack<Character>d1_stack=new Stack<Character>();
      Stack<Character>d2_stack=new Stack<Character>();
      
      int backspaceCount=0;
     
      for(int b=0;b<d2.length();b++){
         if(d2.charAt(b)=='#')  d2_stack.pop();
         else   
           d2_stack.push(d2.charAt(b));
      }
      
      for(int b=0;b<d1.length(); b++){
         if(d1.charAt(b)=='#'){
            backspaceCount++;
           d1_stack.pop();
         }
         else
         {
           d1_stack.push(d1.charAt(b));
         }
      }
      
      for(int b=0;b<d1.length()-2*backspaceCount;b++){
         if(d1_stack.pop()!=d2_stack.pop()) 
            return false;
      }
      return true;
   }
}