/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CC19.app.src.test.java.cc19;

import CC19.app.src.main.java.cc19.BinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static CC19.app.src.main.java.cc19.BinaryTree.*;
import static CC19.app.src.main.java.cc19.BinaryTree.compareLeafNodes;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
@Test public void testCompareLeafs(){
    BinaryTree.TreeNode tree1 = buildTree1();   // returns the root(directory) of a tree with 3 leafs (3 files)
    BinaryTree.TreeNode tree2 = buildTree2();   // returns the root(directory of a tree with 2 leafs (2 files)

    Assertions.assertFalse( compareLeafNodes(tree1,tree2));
    Assertions.assertTrue( compareLeafNodes(tree2,tree2));
    Assertions.assertTrue(  compareLeafNodes(tree1,tree1));
}
}