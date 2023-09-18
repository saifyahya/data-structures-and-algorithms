package CC15.app.src.main.java.cc15.app;

import com.sun.source.tree.Tree;

public class BinarySearchTree extends  BinaryTree{
    public void createBinarySearchTree() {                //    2 <--1--> 3
        TreeNode <Integer> first = new TreeNode<>(1);
        TreeNode <Integer> second = new TreeNode<>(2);
        TreeNode <Integer> third = new TreeNode<>(3);
        root = first;
        first.right=third;
        first.left=second;
    }
    public TreeNode recursiveInsertNumberAtBST(TreeNode root, int value) {   // method arguments: root of current tree, value to be inserted
        if(root==null){                                             // return: the root of current tree
            root= new TreeNode<>(value);
        return root;}
        if(value < (int) root.data)
            root.left=  recursiveInsertNumberAtBST(root.left,value);
        else
            root.right=recursiveInsertNumberAtBST(root.right,value);
return root;
    }
    public void insertNumberAtBST(int value){
        TreeNode current =root;
        TreeNode newNode = new TreeNode(value);
        if (current==null){
            root=newNode;
            return;}
        while(current!=null) {
            if(value>(int)current.data){
                if(current.right==null){
                    current.right=newNode;
                return;}
                current=current.right;
            }
            else{
                if(current.left==null){
                    current.left=newNode;
                    return;}
                current=current.left;
            }
        }}
        public Boolean search(int value){
            TreeNode current =root;
            if (current==null){
                return false;}
            while(current!=null) {
                if(value==(int)current.data){
                        return true;}
                else if(value>(int)current.data){
                    current=current.right;
                }
                else{
                    current=current.left;
                }
            }
        return false;
    }
    public TreeNode recursiveSearch(TreeNode root, int value) {          // method arguments: root of current tree, value to be inserted
        if(root==null || (int )root.data==value)                // return: the node with the founded value
            return root;
        if((int)root.data<value)
            return recursiveSearch(root.right,value);
        else
            return recursiveSearch(root.left,value);
    }
}
