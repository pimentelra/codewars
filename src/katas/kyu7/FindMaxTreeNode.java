package katas.kyu7;

public class FindMaxTreeNode {
    static int findMax(TreeNode root) {
        int max = root.value;
        if (root.left != null) max = Math.max(max, findMax(root.left));
        if (root.right != null) max = Math.max(max, findMax(root.right));
        return max;
    }
}
