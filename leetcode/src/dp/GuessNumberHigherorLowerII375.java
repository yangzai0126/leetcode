package dp;
/*
 * 375. Guess Number Higher or Lower II  QuestionEditorial Solution  My Submissions
Total Accepted: 5054
Total Submissions: 16544
Difficulty: Medium
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I'll tell you whether the number I picked is higher or lower.

However, when you guess a particular number x, and you guess wrong, you pay $x. You win the game when you guess the number I picked.

Example:

n = 10, I pick 8.

First round:  You guess 5, I tell you that it's higher. You pay $5.
Second round: You guess 7, I tell you that it's higher. You pay $7.
Third round:  You guess 9, I tell you that it's lower. You pay $9.

Game over. 8 is the number I picked.

You end up paying $5 + $7 + $9 = $21.
Given a particular n ≥ 1, find out how much money you need to have to guarantee a win.
 */
//这个题的关键是 如果选择的是最大的 则二分法是 最难猜到的 代价是最高的
public class GuessNumberHigherorLowerII375 {
public int getMoneyAmount(int n) {
        int guess=0;
        int mid=(1+n)/2;
        while(mid!=n){
        	guess+=mid;
        	mid=(mid+1+n)/2;
        }
       return guess; 		
    }
}
