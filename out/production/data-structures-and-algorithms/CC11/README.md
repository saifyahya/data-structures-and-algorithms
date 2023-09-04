## Pseudo Queue
Implement the Queue using two stacks: stack1 and stack2.

1. enqueue(data): pushing data to stack1
2. dequeue(): if stack1 is empty, this means the queue is empty. Else, pushing stack1 to stack2 and pop stack2.