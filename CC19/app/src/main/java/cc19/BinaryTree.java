package CC19.app.src.main.java.cc19;
public class BinaryTree {
    protected TreeNode root;
    public static class TreeNode <T>{
        protected T data;
        protected TreeNode<T> left;
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

    public void createBinaryTree() {                //    3 <--1--> 2
        TreeNode<Integer> first = new TreeNode<>(1);
        TreeNode<Integer> second = new TreeNode<>(2);
        TreeNode<Integer> third = new TreeNode<>(3);
        root = first;
        first.right=second;
        first.left=third;
    }


    public static boolean compareLeafNodes(TreeNode root1, TreeNode root2) {
        int leafCount1 = countLeafNodes(root1);
        int leafCount2 = countLeafNodes(root2);

        return leafCount1 == leafCount2;
    }
    private static int countLeafNodes(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            // Node is a leaf node
            return 1;
        }
        int leftCount = countLeafNodes(node.left);
        int rightCount = countLeafNodes(node.right);
        return leftCount + rightCount;
    }

    public static TreeNode buildTree1() {  // contains 3 leafs node
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        return root;
    }

    public static TreeNode buildTree2() {      // contains 2 leafs node
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        return root;
    }
}

