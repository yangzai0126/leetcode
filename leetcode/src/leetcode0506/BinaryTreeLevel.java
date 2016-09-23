package leetcode0506;
import java.util.*;;
public class BinaryTreeLevel {
public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        levelOrder(root,ll);
        return ll;
    }
public void levelOrder(TreeNode root, List<List<Integer>> ll){
	if(root==null){
		return;
	}
}
}
