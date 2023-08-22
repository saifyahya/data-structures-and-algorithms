# Linked List
Linked List implementation: toString , insertAtTop, include, insertAtEnd, insertBefore, insertAfter.

## Whiteboard Process
![Whiteboard](../assets/Whiteboard-toString.png)

![Whiteboard](../assets/Whiteboard-insert.png)

![Whiteboard](../assets/Whiteboard-include.png)

![Whiteboard](../assets/inertAtEnd-Whiteboard.png)
## Approach and efficiency
1. Check if the linked list is empty: tail= new node.
2. if it is not empty: tail.next = new node, tail=new node.
- efficiency: time O(1), space O(1).

![Whiteboard](../assets/inserBefore-Whiteboard.png)
## Approach and efficiency
1. Node newNode = new Node(value)
2. check if the linked list is empty:
   return
3. Node current = head;
4. if (head.data=value): call insertAtTop
   else
5. traverse the data of next node
   if(current.next.data==value):
   newNode.next=current.next;
   current.next=newNode;
- efficiency: time O(n), space O(1).

![Whiteboard](../assets/inertAfter-Whiteboard.png)
## Approach and efficiency
1. Node newNode = new Node(value)
2. check if the linked list is empty:
  return
3. Node current = head;
4. if (head.data=value): call insertAtEnd
  else
5. traverse the data of current node
  if(current.data==value):
  newNode.next=current.next;
  current.next=newNode;
- efficiency: time O(n), space O(1).

## Solution 
![LinkedList](../assets/linked%20list%20solution.png)
![LinkedList1](../assets/linked%20list%20solution1.png)




