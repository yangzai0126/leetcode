package bfs;
//根据前序遍历和中序遍历 构造二叉树
public class BuildTree {
	public static void main(String args[]){
		int [] preorder={1,2,4,7,3,5,6,8};
		int [] inorder={4,7,2,1,5,3,8,6};
		int length=preorder.length;
		postOrder(construct(preorder,inorder,0,0,length));
	}
public static TreeNode construct(int preorder[],int inorder[],int indexpreorder,int indexinorder,int length){
	if(length<=0) return null;
	int iroot=preorder[indexpreorder];
	int index=findindex(inorder,indexinorder,length,iroot);
	int leftlength=index-indexinorder;
	int rightlength=length-leftlength-1;
	TreeNode root=new TreeNode(iroot);
	root.left=construct(preorder,inorder,indexpreorder+1,indexinorder,leftlength);
	root.right=construct(preorder,inorder,indexpreorder+leftlength+1,index+1,rightlength);
	return root;
}
public static int findindex(int [] num,int index,int length,int find){
	for(int i=index;i<index+length;i++){
		if(num[i]==find)
			return i;
	}
	return -1;//没有找到
}
public static void postOrder(TreeNode root){
	if(root==null) return;
	postOrder(root.left);
	postOrder(root.right);
	System.out.println(root.val);
}
}
