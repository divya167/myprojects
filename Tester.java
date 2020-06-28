public class Tester{
public static void main(String[] args){
Node head=new Node(1);
Node second=new Node(2);
Node third=new Node(3);
head.next=second;
second.next=third;
System.out.println("List Before Deletion");
printLinkedList(head);
deleteAtIndex(2,head);
System.out.println("List After Deletion at index 2");
printLinkedList(head);
deleteAtIndex(1,head);
System.out.println("List After Deletion at index 1");
printLinkedList(head);
}
public static void deleteAtIndex(int value,Node head){
Node prev,curr;
int counter=0;
curr=head;
prev=null;
for(;counter<value;counter++)
{
prev=curr;
curr=curr.next;
}
prev.next=curr.next;
}
public static void printLinkedList(Node head){
for(Node cur=head;cur!=null;cur=cur.next){
System.out.print(cur.item+" ");
}
System.out.println();
}
}