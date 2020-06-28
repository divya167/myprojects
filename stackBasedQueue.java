import java.util.Stack;
public class stackBasedQueue {
 Stack<Integer> stack1;
 Stack<Integer> stack2; 
   public stackBasedQueue(){
 stack1 = new Stack<Integer>();
 stack2 = new Stack<Integer>();
}  
public boolean isEmpty(){
return stack2.isEmpty();
 } 
public void enqueue(int newItem){
 if(stack2.size() > 0){
    int len = stack2.size();
       int temp = 0;
           for(int p=0;p<len;p++){
temp = stack2.pop();
stack1.push(temp);
 }
}
stack1.push(newItem);
}  
 public int dequeue() 
 throws QueueException{
   if(stack2.size() > 0){
 return stack2.pop();
 
}else if(stack2.size() == 0){
   if(stack1.size() == 0){
throw new QueueException("You can't DEQUE on an EMPTY queue: ((");

}else if(stack1.size() == 1)
return stack1.pop();

else if(stack1.size() > 0){
int len = stack1.size();
int temp = 0;

for(int p=0;p<len;p++){
temp = stack1.pop();
stack2.push(temp);
}
 return stack2.pop();
  }
     }
return 0;
 } 
 public void dequeAll(){
 if(!stack1.isEmpty())
    stack1.pop();
 if(!stack2.isEmpty())
stack2.pop();
}  
 public int peek() throws QueueException{
   if(stack2.size() > 0){
     return stack2.peek();
}else if(stack2.size() == 0){
 if(stack1.size() == 0){
    throw new QueueException("You can't PEEK on an EMPTY queue :((");
}else if(stack1.size() == 1)
    return stack1.peek();
  else if(stack1.size() > 0){
int len = stack1.size();
int temp = 0;
for(int p=0;p<len;p++){
   temp = stack1.pop();
  stack2.push(temp);
 }
return stack2.peek();
}
  }
return 0;
  }
  public static void main(String args[]){
stackBasedQueue q = new stackBasedQueue();
q.enqueue(1);
q.enqueue(2);
q.enqueue(3);
System.out.println("Ans#1: "+q.peek());     
 q.dequeue();
 q.dequeue();
 System.out.println("Ans#2: "+q.peek());
 System.out.println("Ans#3: "+q.isEmpty());      
q.dequeAll();
System.out.println("Ans#4: "+q.isEmpty());
System.out.println("Ans#5: "+q.peek());
   }   
}