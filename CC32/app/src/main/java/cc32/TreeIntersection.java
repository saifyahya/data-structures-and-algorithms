package CC32.app.src.main.java.cc32;

import CC15.app.src.main.java.cc15.app.BinaryTree;
import CC30.lib.src.main.java.cc30.HashMap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeIntersection {
    public static List<Integer> treeIntersection(BinaryTree tree1,BinaryTree tree2){
        HashMap<Integer,Integer> map = new HashMap<>(50);
        List<Integer> treesIntersection= new ArrayList<>();
        recursivePreorderMappingTree1(tree1.getRoot(),map);
        recursivePreorderCheckIntersectionTree2(tree2.getRoot(),map,treesIntersection);
        return treesIntersection;
    }

    public static void recursivePreorderMappingTree1(BinaryTree.TreeNode root, HashMap map){
        if(root==null)
            return;
        map.set((Integer) root.getData(),1);
        recursivePreorderMappingTree1(root.getLeft(),map);
        recursivePreorderMappingTree1(root.getRight(),map);
    }
    public static void recursivePreorderCheckIntersectionTree2(BinaryTree.TreeNode root, HashMap map,List<Integer> treesIntersection){
        if(root==null)
            return;
        if(map.contains((Integer) root.getData()))
            treesIntersection.add((Integer)root.getData());
        recursivePreorderCheckIntersectionTree2(root.getLeft(),map,treesIntersection);
        recursivePreorderCheckIntersectionTree2(root.getRight(),map,treesIntersection);
    }
    public int height(BinaryTree.TreeNode root){
        if(root==null)
            return 0;
        int leftHeight=height((root.getLeft()));
        int rightHeight=height((root.getRight()));
        return Math.max(leftHeight,rightHeight)+1;
    }
    public static Integer secondMax(BinaryTree.TreeNode root){
        List<Integer> list= new ArrayList<>();
        if(root==null)
            return null;
        Queue<BinaryTree.TreeNode> queue=new LinkedList<>();
        int firstMax=Integer.MIN_VALUE,secondMax=Integer.MIN_VALUE;
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryTree.TreeNode temp=queue.remove();
            if((int)temp.getData()>firstMax){
                secondMax=firstMax;
                firstMax=(int)temp.getData();
            }
            else if((int)temp.getData()>secondMax){
                secondMax=(int)temp.getData();
            }
            if(temp.getLeft()!=null)
                queue.add(temp.getLeft());
            if(temp.getRight()!=null)
                queue.add(temp.getRight());
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
    public static int countLeafNodes(BinaryTree.TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.getLeft() == null && node.getRight() == null) {
            // Node is a leaf node
            return 1;
        }
        int leftCount = countLeafNodes(node.getLeft());
        int rightCount = countLeafNodes(node.getRight());
        return leftCount + rightCount;
    }
    public static int countLeafIterative(BinaryTree.TreeNode root){
        int leafCount=0;
        if(root==null)
            return leafCount;
        Queue<BinaryTree.TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryTree.TreeNode temp=queue.remove();
      if(temp.getRight()==null && temp.getLeft()==null)
          leafCount++;
            if(temp.getLeft()!=null)
                queue.add(temp.getLeft());
            if(temp.getRight()!=null)
                queue.add(temp.getRight());
        }
        return leafCount;
    }
}
