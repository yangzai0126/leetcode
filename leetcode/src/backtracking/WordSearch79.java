package backtracking;
/*
 * Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

For example,
Given board =

[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]
word = "ABCCED", -> returns true,
word = "SEE", -> returns true,
word = "ABCB", -> returns false.
 */
//backtrack �ڱ�����ʱ��Ҳ������
public class WordSearch79 {
	public static boolean finished=false;
public  boolean exist(char[][] board, String word) {
	 finished =false;
	int row=board.length;
	int col=0;
	if(row>0)
		col=board[0].length;
	boolean u[][]=new boolean[row][col];
	for(int i=0;i<row;i++)
		for(int j=0;j<col;j++){
			if(board[i][j]!=word.charAt(0)) continue;//ѡ����ܵĿ�ʼ
			backtrack(i,j,0, board,row, col,u, word);
			if(finished) return true;
		}
	return false;
    }

public  void backtrack(int x,int y,int k,char [][] board,int row,int col,boolean [][] u,String word){
	if(k==word.length()){
			finished=true;
		return;
	}
	//Խ��Ĵ���
	if(x<0||x==row||y<0||y==col)
		return;
	//�� �ٶ� x��y �Ϸ�
	if(board[x][y]==word.charAt(k)){//��� ��K���ַ� ��� �ż���
	if(!u[x][y]){//���� û��ʹ�ù�
		u[x][y]=true;
		//��ʼ��������
		backtrack(x+1,y,k+1,board,row,col,u,word);
		if(finished) return;
		backtrack(x-1,y,k+1,board,row,col,u,word);
		if(finished) return;
		backtrack(x,y+1,k+1,board,row,col,u,word);
		if(finished) return;
		backtrack(x,y-1,k+1,board,row,col,u,word);
		if(finished) return;
		u[x][y]=false;//�ջ�  
	}
	}
}


}
