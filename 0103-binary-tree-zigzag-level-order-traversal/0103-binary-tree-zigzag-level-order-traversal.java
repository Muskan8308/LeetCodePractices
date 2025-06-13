
class Solution {

    // printing from left to right
    public void printLR(TreeNode root, int n, List<Integer> arr)
    {
        if(root == null) return;
        if(n == 1)
        {
            arr.add(root.val);
            return;
        }
        printLR(root.left, n-1, arr);
        printLR(root.right, n-1, arr);
    }

    // printing from right to left
    public void printRL(TreeNode root, int n, List<Integer> arr)
    {
        if(root == null) return;
        if(n == 1)
        {
            arr.add(root.val);
            return;
        }
        printRL(root.right, n-1, arr);
        printRL(root.left, n-1, arr);
    }

    // finding the height on the basis of levels of tree
    public int height(TreeNode root)
    {
        if(root == null || (root.left == null && root.right == null))	return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int level = height(root) + 1;
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null) return ans;
        for(int i = 1; i <= level; i++)
        {
            List<Integer> arr = new ArrayList<>();
            if(i % 2 != 0)  printLR(root, i, arr);  // for odd level
            else printRL(root, i, arr);             // for even level
            ans.add(arr);
        }
        return ans;
    }
}