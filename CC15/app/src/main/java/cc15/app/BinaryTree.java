package CC15.app.src.main.java.cc15.app;

import com.sun.source.tree.Tree;

import java.util.*;

public class BinaryTree {
    protected TreeNode root;
    public static class TreeNode <T>{
        protected T data;
        protected TreeNode<T> left;
        protected TreeNode<T> right;

        public void setLeft(TreeNode<T> left) {
            this.left = left;
        }

        public void setRight(TreeNode<T> right) {
            this.right = right;
        }

        public TreeNode(T data) {
            this.data = data;
        }


        public TreeNode<T> getLeft() {
            return left;
        }

        public TreeNode<T> getRight() {
            return right;
        }

        public T getData() {
            return data;
        }
    }

        public void createBinaryTree() {                //    3 <--1--> 2
            TreeNode <Integer> first = new TreeNode<>(1);
            TreeNode <Integer> second = new TreeNode<>(2);
            TreeNode <Integer> third = new TreeNode<>(3);
            root = first;
            first.right=second;
            first.left=third;
        }
        public void recursivePreOrderTraversal(TreeNode root)
        {
            if (root==null)
                return;
            System.out.print(root.data+" ");
            recursivePreOrderTraversal(root.left);
            recursivePreOrderTraversal(root.right);
        }

    public ArrayList iterativePreOrderTraversal(TreeNode root) {
        ArrayList list = new ArrayList<>();
        if (root == null)
            return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            list.add(temp.data);
            if (temp.right != null)
                stack.push(temp.right);
            if (temp.left != null)
                stack.push(temp.left);
        }
        return list;
    }
    public void recursiveInOrderTraversal(TreeNode root) {
        if (root==null)
            return ;
        recursivePreOrderTraversal(root.left);
        System.out.print(root.data+" ");
        recursiveInOrderTraversal(root.right);
    }

    public ArrayList iterativeInOrderTraversal(TreeNode root) {
        ArrayList list = new ArrayList<>();
        if (root == null)
            return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp!=null) {
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
            else {
                temp=stack.pop();
                list.add(temp.data);
                temp=temp.right;
            }
        }
        return list;
    }
    public void recursivePostOrderTraversal(TreeNode root) {
        if (root==null)
            return;
        recursiveInOrderTraversal(root.left);
        recursivePostOrderTraversal(root.right);
        System.out.print(root.data+" ");

    }
    public ArrayList iterativePostOrderTraversal(TreeNode root) {
        ArrayList list = new ArrayList<>();
        if (root == null)
            return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(!stack.isEmpty() || current!=null) {
            if(current!=null){      // there is left node to traverse
                stack.push(current);
                current=current.left;
            }
            else {
                TreeNode temp = stack.peek().right;
                if (temp == null) { // there is no right child for this node, so I can traverse it
                    temp=stack.pop();
                    list.add(temp.data);
                    while (!stack.isEmpty() && temp==stack.peek().right)  {        // is stack empty now?, and is the node we visited a right child of stack peak, so we can visit the node
                        temp=stack.pop();
                        list.add(temp.data);
                    }
                } else {                    //temp!= null and there is a right child and might have children, and we should apply the whole algorithm on it
                    current=temp;
                }
            }
        }
        return list;
    }
public int treeMaxValue(TreeNode root) {
        if(root==null)
            return Integer.MIN_VALUE;
        int result = (int) root.data;
        int left = treeMaxValue(root.left);
        int right = treeMaxValue(root.right);
        if(left>right)
            result=left;
        if(right>left)
            result = right;
        return result;

}
    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public boolean rootToLeafSum(TreeNode root, int value) {
        if (root == null) {
            return false;
        }

        // Check if the current node is a leaf
        if (root.left == null && root.right == null) {
            return (int)root.data == value;
        }
        // Recursively check left and right subtrees
        boolean leftSum = rootToLeafSum(root.left, value - (int)root.data);
        boolean rightSum = rootToLeafSum(root.right, value - (int)root.data);

        // Return true if either left or right subtree has a valid path
        return leftSum || rightSum;
    }

    public int height(TreeNode root){
        if(root==null)
            return -1;
        int leftHeight=0;
        int rightHeight=0;
        if(root.left!=null)
            leftHeight=height(root.left)+1;
        if(root.right!=null)
        leftHeight=height(root.right)+1;
        return Math.max(leftHeight,rightHeight);
    }
    public int heightIterative(TreeNode root){
        if(root==null)
            return 0;
        int maxHeight= -1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int height= queue.size();
            for(int i =0;i<height;i++){
                TreeNode temp = queue.remove();
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
            }
            maxHeight++;
        }
return maxHeight;
    }
public static boolean identicalTrees(BinaryTree tree1, BinaryTree tree2){
        if(tree1.root==null && tree2.root==null) //both are null (identical), both not null(identical)
            return true;
    else if(tree2.root==null || tree1.root==null)  //only one null(not identical)
        return false;
    Queue<TreeNode> queue1 =new LinkedList<>();
    Queue<TreeNode> queue2 =new LinkedList<>();
    queue1.add(tree1.root);
    queue2.add(tree2.root);
    while(!queue1.isEmpty() && !queue2.isEmpty()){
        TreeNode temp1 = queue1.remove();
        TreeNode temp2 = queue2.remove();
        if(temp2.data!=temp1.data)
            return false;
        if(temp2.left!=null && temp1.left!=null){
            queue2.add(temp2.left);
            queue1.add(temp1.left);
        }else if(temp2.left!=null || temp1.left!=null)  //get the case when one only is null
            return false;
        if(temp2.right!=null && temp1.right!=null){
            queue2.add(temp2.right);
            queue1.add(temp1.right);
        }else if(temp2.right!=null || temp1.right!=null)
            return false;
    }
return true;
}
public Integer secondMax(TreeNode root){
        List<Integer> list= new ArrayList<>();
        if(root==null)
            return null;
        Queue<TreeNode> queue=new LinkedList<>();
        int firstMax=Integer.MIN_VALUE,secondMax=Integer.MIN_VALUE;
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp=queue.remove();
            if((int)temp.data>firstMax){
                secondMax=firstMax;
                firstMax=(int)temp.data;
            }
            else if((int)temp.data>secondMax){
                secondMax=(int)temp.data;
            }
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }
        return secondMax;
}
    public static Integer secondMin(BinaryTree.TreeNode root){
        List<Integer> list= new ArrayList<>();
        if(root==null)
            return null;
        Queue<BinaryTree.TreeNode> queue=new LinkedList<>();
        int firstMin=Integer.MAX_VALUE,secondMin=Integer.MAX_VALUE;
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryTree.TreeNode temp=queue.remove();
            if((int)temp.getData()<firstMin){
                secondMin=firstMin;
                firstMin=(int)temp.getData();
            }
            else if((int)temp.getData()<secondMin){
                secondMin=(int)temp.getData();
            }
            if(temp.getLeft()!=null)
                queue.add(temp.getLeft());
            if(temp.getRight()!=null)
                queue.add(temp.getRight());
        }
        return secondMin;
    }
    public TreeNode invertTree(TreeNode root){ //space O(h) h:height of tree (calls in stack)
        if(root==null)
            return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
    public TreeNode invertTreeIterative(TreeNode root)  //space O(n)
    {
     if(root==null)
         return null;
     Queue<TreeNode> queue= new LinkedList<>();
     queue.add(root);
     while (!queue.isEmpty()) {
         TreeNode temp = queue.poll();

         TreeNode tempHold= temp.left;
         temp.left=temp.right;
         temp.right=tempHold;

         if(temp.left!=null)
             queue.add(temp.left);
         if(temp.right!=null)
             queue.add(temp.right);
     }
return root;
    }}

