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
		AnsTab[0][i]=1;	//�һ�0Ԫ����һ�ַ���
	}
	for (int i=1; i<MAXAMOUNT; ++i)
	{
		AnsTab[i][0]=0; //����Ӳ�Ҽ���Ϊ�գ���Ȼ�һ�����Ϊ0
	}

	//��ʼ���
	for (int i=1; i<MAXAMOUNT; ++i)
	{
		for (int j=1; j<MAXCOIN; ++j)
		{
			int x=AnsTab[i][j-1];	//���õ�ǰ��Ӳ��

			int ValLeft=i-coins[j];
			int y=(ValLeft<0)?0:AnsTab[ValLeft][j];	//�õ�ǰ��Ӳ��

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


//�ռ��Ż�

/*
int AnsTab[MAXAMOUNT];	//AnsTab[i]��ʾ�һ�iԪ�м��ַ���

void MakeSolutionTab()
{
	memset(AnsTab, 0, sizeof(AnsTab));

	AnsTab[0]=1;	//�һ�0Ԫ��1�ַ���

	//���ѡȡӲ�ң����±����һ�ֿռ临�Ӷ�O(nm)�ķ���Ϊ�����������������һ��O(n)�ķ���ʵ�����Ǵ��ϵ����������
	for (int i=1; i<MAXCOIN; ++i)
	{
		for (int j=coins[i]; j<MAXAMOUNT; ++j)
		{
			AnsTab[j]+=AnsTab[j-coins[i]];
		}
	}
}
*/