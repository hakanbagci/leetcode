int minDiff = Integer.MAX_VALUE;
int prevVal = Integer.MIN_VALUE;

public int getMinimumDifference(TreeNode root) {
    findMinimumDifference(root);
    return minDiff;
}

// traverse BST inorder to find consecutive absolute differences
public void findMinimumDifference(TreeNode root) {
    if(root == null) {
        return;
    }

    findMinimumDifference(root.left);

    if (prevVal != Integer.MIN_VALUE) {
        int diff = Math.abs(root.val - prevVal);
        if (diff < minDiff) {
            minDiff = diff; 
        }
    }

    prevVal = root.val;

    findMinimumDifference(root.right);
}
