package CC16.app.src.test.java.cc16;

import CC16.app.src.main.java.cc16.BinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBinaryTree {

    @Test
    public void testTreeMaxValue(){
        BinaryTree tree = new BinaryTree();
        tree.createBinaryTree();  //    3 <--1--> 2
        Assertions.assertEquals(3,tree.treeMaxValue());
    }
    @Test
    public void testTreeMaxValue1(){
        BinaryTree tree = new BinaryTree();         //empty binary tree
        Assertions.assertEquals(0,tree.treeMaxValue());
    }
}
