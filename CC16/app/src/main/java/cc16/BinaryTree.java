package CC16.app.src.main.java.cc16;

import java.util.Stack;

public class BinaryTree {
    protected TreeNode root;
    public static class TreeNode <T>{
        protected T data;
        protected TreeNode<T> left;
        protected TreeNode<T> right;

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
public int treeMaxValue(){
        if(root==null)
            return 0;
        int result = (int)root.data;
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while(!stack.isEmpty()) {
        TreeNode temp = stack.pop();
        if((int)temp.data>result)
            result=(int)temp.data;
        if (temp.right != null)
            stack.push(temp.right);
        if (temp.left != null)
            stack.push(temp.left);
    }
    return result;
}
    public void createBinaryTree() {                //    3 <--1--> 2
        TreeNode<Integer> first = new TreeNode<>(1);
        BinaryTree.TreeNode<Integer> second = new TreeNode<>(2);
       BinaryTree.TreeNode<Integer> third = new TreeNode<>(3);
        root = first;
        first.right=second;
        first.left=third;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
