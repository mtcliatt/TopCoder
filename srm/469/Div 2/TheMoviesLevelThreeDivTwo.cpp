#include<iostream>
#include<vector>

using namespace std;

int helper(int num, vector<int> &timeJ, vector<int> &timeB)
{
	int sumJ = 0, sumB = 0;
	for(int i = 0; i < timeJ.size(); i++)
	{
		if(num & (1 << i))
		{
			sumJ += timeJ[i];
		}
	}

	for(int i = 0; i < timeB.size(); i++)
	{
		if(!(num & (1 << i)))
		{
			sumB += timeB[i];
			if(sumB > sumJ) return 0;
			else sumJ += timeJ[i];
		}
	}

	sumJ = 0;

	for(int i = 0; i < timeJ.size(); i++)
	{
		if(num & (1 << i))
		{
			sumJ += timeJ[i];
			if(sumJ > sumB) return 0;
			else sumB += timeB[i];
		}
	}

	return 1;
}

class TheMoviesLevelThreeDivTwo
{
public:
int find(vector<int> timeJ, vector<int> timeB)
{
	int count = 0;
	int len = timeJ.size();
	for(unsigned i = 1; i <= (1 << len); i++)
	{
		count += helper(i, timeJ, timeB);
	}

	return count;
}
};
