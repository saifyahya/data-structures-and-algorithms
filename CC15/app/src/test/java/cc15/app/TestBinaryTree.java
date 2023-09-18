package CC15.app.src.test.java.cc15.app;

import CC15.app.src.main.java.cc15.app.BinarySearchTree;
import CC15.app.src.main.java.cc15.app.BinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import java.util.List;

public class TestBinaryTree {
    @Test void emptyTree(){
        BinaryTree tree = new BinaryTree();
Assertions.assertNull(tree.getRoot());
    }
    @Test void singleNodeTree(){
        BinaryTree tree = new BinaryTree();
        tree.setRoot(new BinaryTree.TreeNode<>(1));
        Assertions.assertEquals(1,tree.getRoot().getData());
    }
    @Test void testPreOrderTraversal(){
        BinaryTree tree = new BinaryTree();
        tree.createBinaryTree();
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(3);
        expectedResult.add(2);
        Assertions.assertEquals(expectedResult,tree.iterativePreOrderTraversal(tree.getRoot()));
    }
    @Test void testInOrderTraversal(){
        BinaryTree tree = new BinaryTree();
        tree.createBinaryTree();
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(3);
        expectedResult.add(1);
        expectedResult.add(2);
        Assertions.assertEquals(expectedResult,tree.iterativeInOrderTraversal(tree.getRoot()));
    }
    @Test void testPostOrderTraversal(){
        BinaryTree tree = new BinaryTree();
        tree.createBinaryTree();
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(3);
        expectedResult.add(2);
        expectedResult.add(1);
        Assertions.assertEquals(expectedResult,tree.iterativePostOrderTraversal(tree.getRoot()));
    }
        // BST
    @Test void testBSTCreation() {     // can insert right and left child appropriate to BST
        BinarySearchTree bst = new BinarySearchTree();
        bst.createBinarySearchTree();           //    2 <--1--> 3
        Assertions.assertTrue((int)bst.getRoot().getLeft().getData() < (int)bst.getRoot().getRight().getData());
    }

    @Test void testBSTInsert() {     // can insert to BST and search for it
        BinarySearchTree bst = new BinarySearchTree();
        bst.createBinarySearchTree();       //    2 <--1--> 3
        bst.insertNumberAtBST(5);
        Assertions.assertTrue(bst.search(5));
        Assertions.assertFalse(bst.search(4));
    }
}
