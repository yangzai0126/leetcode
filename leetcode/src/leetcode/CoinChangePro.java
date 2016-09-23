package leetcode;

public class CoinChangePro {

}
/*
#include <cstdio>

#define MAXCOIN 18
#define MAXAMOUNT 305 

int coins[MAXCOIN]={0,1,4,9,16,25,36,49,64,81,100,121,144,169,196,225,256,289};

int AnsTab[MAXAMOUNT][MAXCOIN];

void MakeSolutionTab()
{
	//Init AnsTab
	for (int i=0; i<MAXCOIN; ++i)
	{
		AnsTab[0][i]=1;	//兑换0元都有一种方法
	}
	for (int i=1; i<MAXAMOUNT; ++i)
	{
		AnsTab[i][0]=0; //可用硬币集合为空，自然兑换方法为0
	}

	//开始填表
	for (int i=1; i<MAXAMOUNT; ++i)
	{
		for (int j=1; j<MAXCOIN; ++j)
		{
			int x=AnsTab[i][j-1];	//不用当前的硬币

			int ValLeft=i-coins[j];
			int y=(ValLeft<0)?0:AnsTab[ValLeft][j];	//用当前的硬币

			AnsTab[i][j]=x+y;
		}
	}
}

int main()
{
	MakeSolutionTab();

	int n;
	while (scanf("%d", &n)!=EOF)
	{
		if(n==0) break;

		printf("%d\n", AnsTab[n][MAXCOIN-1]);
	}

	return 0;
}*/


//空间优化

/*
int AnsTab[MAXAMOUNT];	//AnsTab[i]表示兑换i元有几种方法

void MakeSolutionTab()
{
	memset(AnsTab, 0, sizeof(AnsTab));

	AnsTab[0]=1;	//兑换0元有1种方法

	//逐个选取硬币，更新表格。上一种空间复杂度O(nm)的方法为从左向右逐行填表，这一种O(n)的方法实际上是从上到下逐列填表。
	for (int i=1; i<MAXCOIN; ++i)
	{
		for (int j=coins[i]; j<MAXAMOUNT; ++j)
		{
			AnsTab[j]+=AnsTab[j-coins[i]];
		}
	}
}
*/