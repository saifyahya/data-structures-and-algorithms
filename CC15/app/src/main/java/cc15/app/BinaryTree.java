package CC15.app.src.main.java.cc15.app;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Stack;

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
}

