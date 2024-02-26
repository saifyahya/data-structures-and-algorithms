package CC17.app.src.main.java.cc17;

import CC10.lib.src.main.java.cc10.datastsructure.Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTree {
    protected TreeNode root;
    public static class TreeNode <T>{
        protected T data;
        protected TreeNode <T> left;
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

    public TreeNode getRoot() {
        return root;
    }
    public void createBinaryTree() {                //    create binary tree from 1-9
    TreeNode<Integer> first = new TreeNode<>(1);
    TreeNode<Integer> second = new TreeNode<>(2);
    TreeNode<Integer> third = new TreeNode<>(3);
        root = first;
        first.left=second;
        first.right=third;
        TreeNode<Integer> fourth = new TreeNode<>(4);
        TreeNode<Integer> fifth = new TreeNode<>(5);
        second.left=fourth;
        second.right=fifth;
        TreeNode<Integer> sixth = new TreeNode<>(6);
        TreeNode<Integer> seventh = new TreeNode<>(7);
        third.left=sixth;
        third.right=seventh;
        TreeNode<Integer> eighth = new TreeNode<>(8);
        TreeNode<Integer> ninth = new TreeNode<>(9);
        fourth.left=eighth;
        seventh.right=ninth;
    }
    public ArrayList breadthFirst(TreeNode root) {
        ArrayList<Integer> result= new ArrayList<>();
        Queue<TreeNode> queue= new Queue<>();
        if(root==null)
            return result;
        queue.enqueue(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.dequeue();
            result.add((int)temp.data);
            if(temp.left!=null)
                queue.enqueue(temp.left);
            if(temp.right!=null)
                queue.enqueue(temp.right);
        }
        return result;
    }

    public int maxDepth(TreeNode root){
        if (root==null)
            return 0;
   
        return 1+ Math.max(maxDepth(root.getLeft()),maxDepth(root.getRight()));
    }

}
