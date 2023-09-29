package CC18.app.src.main.java.cc18;

import java.util.ArrayList;
import java.util.List;

public class TreeNode <T> {
    T data;
    List<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public static void print(TreeNode<Integer> root) {
        String s = root.data+" = ";
        for(int i =0; i<root.children.size();i++){
            s=s+ root.children.get(i).data+" , ";
        }
        System.out.println(s);
        for(int i =0 ; i<root.children.size();i++){
            print(root.children.get(i));
        }
    }
    public static TreeNode fizzBuzzTree(TreeNode root) {
        return fizzBuzzRecursive(root);
    }

    private static TreeNode fizzBuzzRecursive(TreeNode node) {
        if (node == null) {
            return null;
        }
        TreeNode newNode = new TreeNode((int)node.data % 3 == 0 && (int)node.data % 5 == 0 ? "FizzBuzz" :
                (int) node.data % 3 == 0 ? "Fizz" :
                        (int) node.data % 5 == 0 ? "Buzz" :
                                Integer.toString((int)node.data));
        for ( Object child : node.children) {
            newNode.children.add(fizzBuzzRecursive((TreeNode) child));
        }

        return newNode;
    }

}
