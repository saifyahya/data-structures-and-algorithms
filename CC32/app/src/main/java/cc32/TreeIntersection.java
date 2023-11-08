package CC32.app.src.main.java.cc32;

import CC15.app.src.main.java.cc15.app.BinaryTree;
import CC30.lib.src.main.java.cc30.HashMap;

import java.util.ArrayList;
import java.util.List;

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
}
