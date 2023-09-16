package CC15.app.src.test.java.cc15.app;

import CC15.app.src.main.java.cc15.app.BinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestBinaryTree {
    @Test void emptyTree(){
        BinaryTree tree = new BinaryTree();
Assertions.assertNull(tree.getRoot());
    }
    @Test void singleNodeTree(){
        BinaryTree tree = new BinaryTree();
        BinaryTree.TreeNode root = new BinaryTree.TreeNode<>(1);
        Assertions.assertEquals(1,tree.getRoot());
    }
    @Test void testPreOrderTraversal(){
        BinaryTree tree = new BinaryTree();
        tree.createBinaryTree();
        int x []={1,3,2};
        List expectedResult = Arrays.asList(x);
        Assertions.assertEquals(expectedResult,tree.iterativePreOrderTraversal(tree.getRoot()));
    }
    @Test void testInOrderTraversal(){
        BinaryTree tree = new BinaryTree();
        tree.createBinaryTree();
        int x []={3,1,2};
        List expectedResult = Arrays.asList(x);
        Assertions.assertEquals(expectedResult,tree.iterativeInOrderTraversal(tree.getRoot()));
    }
    @Test void testPostOrderTraversal(){
        BinaryTree tree = new BinaryTree();
        tree.createBinaryTree();
        int x []={3,2,1};
        List expectedResult = Arrays.asList(x);
        Assertions.assertEquals(expectedResult,tree.iterativePostOrderTraversal(tree.getRoot()));
    }

}
