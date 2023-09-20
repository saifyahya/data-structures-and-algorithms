package CC17.app.src.test.java.cc17;

import CC17.app.src.main.java.cc17.BinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestBinaryTree {
    @Test
    void TestBreadthFirst() {
        BinaryTree tree = new BinaryTree();
        tree.createBinaryTree();
        Integer arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> list = Arrays.asList(arr);
        Assertions.assertEquals(list,tree.breadthFirst(tree.getRoot()));

    }
}
