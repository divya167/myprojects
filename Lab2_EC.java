import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Lab2_EC {
	public static void main(String[] args) {
		
       String b1 = "civic";//true
		boolean answer = checkPalindrome(b1);
		System.out.println(answer);
	}
	public static boolean checkPalindrome(String b1) {
		
      Stack < Character > s = new Stack < Character > ();
		Queue < Character > d = new LinkedList < Character > ();
		int i;
		for (i = 0; i < b1.length(); i++) {
			s.push(b1.charAt(i));
			d.add(b1.charAt(i));
		}
		 boolean answer = true;
		 while (!d.isEmpty()) {
			if (d.poll() == s.pop()) continue;
			answer = false;
			break;
		}
		return answer;
	}
}
